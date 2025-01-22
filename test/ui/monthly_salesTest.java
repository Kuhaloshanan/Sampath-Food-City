package ui;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.sql.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class monthly_salesTest {

    private monthly_sales monthly;
    private JDateChooser startDate;
    private JDateChooser endDate;
    private JTable salesTable;
    private JTextField totalSalesField;

    @Before
    public void setUp() {
        monthly = new monthly_sales();  // Initialize the monthly_sales class
        startDate = new JDateChooser();
        endDate = new JDateChooser();
        salesTable = new JTable();
        totalSalesField = new JTextField();
    }

    @After
    public void tearDown() {
        monthly = null;
        startDate = null;
        endDate = null;
        salesTable = null;
        totalSalesField = null;
    }

    @Test
    public void testValidDateRange() throws SQLException {
        // Set valid start and end dates that exist in the database
        startDate.setDate(Date.valueOf("2022-12-01"));
        endDate.setDate(Date.valueOf("2022-12-31"));

        monthly.monthly(startDate, endDate, salesTable, totalSalesField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Print debug information
        System.out.println("Number of rows found: " + model.getRowCount());
        System.out.println("Total Sales: " + totalSalesField.getText());

        // Assert that the table contains rows (data exists)
        assertTrue("The table should contain at least one row for a valid date range", model.getRowCount() > 0);

        // Ensure total sales field is not empty and contains a numeric value
        assertTrue("Total sales field should contain a numeric value", !totalSalesField.getText().trim().isEmpty());
    }

    @Test
    public void testInvalidDateRange() throws SQLException {
        // Set a future date range that does not exist in the database
        startDate.setDate(Date.valueOf("2099-01-01"));
        endDate.setDate(Date.valueOf("2099-01-31"));

        monthly.monthly(startDate, endDate, salesTable, totalSalesField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table is empty for an invalid date range
        assertEquals("The table should be empty for an invalid date range", 0, model.getRowCount());

        // Ensure total sales field is set to "0.00" for no data
        assertEquals("Total sales field should be 0.00 for an invalid date range", "0.00", totalSalesField.getText().trim());
    }

    @Test
    public void testEmptyDateFields() throws SQLException {
        // Set both dates to null (empty input case)
        startDate.setDate(null);
        endDate.setDate(null);

        monthly.monthly(startDate, endDate, salesTable, totalSalesField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table remains empty
        assertEquals("The table should be empty when no date is selected", 0, model.getRowCount());

        // Ensure total sales field is empty
        assertEquals("Total sales field should be empty when no date is selected", "", totalSalesField.getText().trim());
    }

    @Test
    public void testStartDateAfterEndDate() throws SQLException {
        // Set an invalid range where start date is after end date
        startDate.setDate(Date.valueOf("2022-02-01"));
        endDate.setDate(Date.valueOf("2022-01-01"));

        monthly.monthly(startDate, endDate, salesTable, totalSalesField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table remains empty due to incorrect date selection
        assertEquals("The table should be empty when start date is after end date", 0, model.getRowCount());

        // Ensure total sales field is empty
        assertEquals("Total sales field should be empty when start date is after end date", "", totalSalesField.getText().trim());
    }

    @Test
    public void testPartialDateInput() throws SQLException {
        // Set only the start date, leaving the end date empty
        startDate.setDate(Date.valueOf("2022-01-01"));
        endDate.setDate(null);

        monthly.monthly(startDate, endDate, salesTable, totalSalesField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table remains empty due to missing end date
        assertEquals("The table should be empty when end date is missing", 0, model.getRowCount());

        // Ensure total sales field is empty
        assertEquals("Total sales field should be empty when end date is missing", "", totalSalesField.getText().trim());
    }
}
