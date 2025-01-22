package ui;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class daily_salesTest {

    private daily_sales dailySales; // Assuming the daily method is inside the daily_sales class
    private JDateChooser sdate;
    private JTable salesTable;
    private JTextField dailySalesTextField;

    public daily_salesTest() {
    }

    @Before
    public void setUp() {
        // Initialize the daily_sales object and UI components
        dailySales = new daily_sales(); // Replace with your actual class name
        sdate = new JDateChooser(); // Date chooser for input
        salesTable = new JTable(); // Table to display results
        dailySalesTextField = new JTextField(); // Text field for displaying total sales
    }

    @After
    public void tearDown() {
        dailySales = null;
        sdate = null;
        salesTable = null;
        dailySalesTextField = null;
    }

    /**
     * Test of daily method, of class daily_sales.
     */
    @Test
    public void testValid() throws SQLException {
        // Set a valid date that exists in the database (ensure this date has data in the database)
        sdate.setDate(Date.valueOf("2022-12-31"));

        // Call the daily method
        dailySales.daily(sdate, salesTable, dailySalesTextField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table contains rows (at least one sale)
        assertTrue("The table should contain at least one row for a valid date", model.getRowCount() > 0);

        // Assert that the daily sales text field contains a value (non-empty)
        assertTrue("The daily sales text field should contain a value", !dailySalesTextField.getText().isEmpty());
    }

    @Test
    public void testInvalidDate() throws SQLException {
        // Set an invalid date that does not exist in the database
        sdate.setDate(Date.valueOf("2099-01-01"));

        // Call the daily method
        dailySales.daily(sdate, salesTable, dailySalesTextField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table is empty for an invalid date
        assertEquals("The table should be empty for an invalid date", 0, model.getRowCount());

        // Assert that the daily sales text field is empty (or 0)
        assertEquals("The daily sales text field should be empty for an invalid date", "", dailySalesTextField.getText());
    }

    @Test
    public void testEmptyDate() throws SQLException {
        // Set the date to null (empty input case)
        sdate.setDate(null);

        // Call the daily method
        dailySales.daily(sdate, salesTable, dailySalesTextField);

        DefaultTableModel model = (DefaultTableModel) salesTable.getModel();

        // Assert that the table is empty when no date is selected
        assertEquals("The table should be empty when no date is selected", 0, model.getRowCount());

        // Assert that the daily sales text field is empty (or 0)
        assertEquals("The daily sales text field should be empty when no date is selected", "", dailySalesTextField.getText());
    }
}

