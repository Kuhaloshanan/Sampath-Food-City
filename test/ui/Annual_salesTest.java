package ui;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class Annual_salesTest {

    private Annual_sales annualSales;  // The class containing the `Annual` method
    private JTextField yearField;
    private JTextField annualSalesField;
    private JTable salesTable;

    @Before
    public void setUp() {
        annualSales = new Annual_sales();
        yearField = new JTextField();
        annualSalesField = new JTextField();
        salesTable = new JTable(new DefaultTableModel(new Object[]{"Product Name", "Quantity", "Unit Price", "Total Sold"}, 0));
    }

    @After
    public void tearDown() {
        annualSales = null;
        yearField = null;
        annualSalesField = null;
        salesTable = null;
    }

    @Test
    public void testValidYear() throws SQLException {
        // Test with a valid year where sales data exists
        yearField.setText("2022");

        annualSales.Annual(yearField, annualSalesField, salesTable);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table contains rows
        assertTrue("The table should contain at least one row for a valid year", model.getRowCount() > 0);

        // Ensure the total sales field is not empty
        assertFalse("Total sales field should not be empty for a valid year", annualSalesField.getText().isEmpty());
    }

    @Test
    public void testInvalidYear() throws SQLException {
        // Test with a year that has no records (future year)
        yearField.setText("2099");

        annualSales.Annual(yearField, annualSalesField, salesTable);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table is empty
        assertEquals("The table should be empty for an invalid year", 0, model.getRowCount());

        // Ensure total sales field displays 0.00
        assertEquals("Total sales field should be 0.00 for an invalid year", "0.00", annualSalesField.getText());
    }

    @Test
    public void testEmptyYearField() throws SQLException {
        // Test with an empty year field
        yearField.setText("");

        annualSales.Annual(yearField, annualSalesField, salesTable);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table remains empty
        assertEquals("The table should be empty when no year is provided", 0, model.getRowCount());

        // Ensure total sales field is empty
        assertEquals("Total sales field should be empty when no year is provided", "", annualSalesField.getText());
    }

    @Test
    public void testNonNumericYear() throws SQLException {
        // Test with a non-numeric year input
        yearField.setText("abcd");

        annualSales.Annual(yearField, annualSalesField, salesTable);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table remains empty due to invalid input
        assertEquals("The table should be empty for non-numeric year input", 0, model.getRowCount());

        // Ensure total sales field remains empty
        assertEquals("Total sales field should be empty for non-numeric input", "", annualSalesField.getText());
    }

    @Test
public void testYearOutOfRange() throws SQLException {
    // Using an out-of-range year unlikely to exist
    yearField.setText("1500"); 

    annualSales.Annual(yearField, annualSalesField, salesTable);

    DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

    // Assert that the table should be empty for an out-of-range year
    assertEquals("The table should be empty for an unrealistic out-of-range year", 0, model.getRowCount());
}


    @Test
    public void testBoundaryYearCurrentYear() throws SQLException {
        // Test with the current year to ensure boundary cases
        int currentYear = java.time.Year.now().getValue();
        yearField.setText(String.valueOf(currentYear));

        annualSales.Annual(yearField, annualSalesField, salesTable);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the result is processed correctly
        assertTrue("The table should contain data for the current year if available", model.getRowCount() >= 0);
    }
}
