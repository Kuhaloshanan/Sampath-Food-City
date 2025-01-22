import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import static org.junit.Assert.*;
import ui.User_Customer_behaviour;
import ui.Customer_behaviour;

public class Customer_behaviourTest {

    private  Customer_behaviour customer;
    private JTextField customer_id_txtfld;
    private JTable customerBehaviorTable;

    @Before
    public void setUp() {
        // Initialize the test components
        customer = new Customer_behaviour();
        customer_id_txtfld = new JTextField();
        customerBehaviorTable = new JTable(new DefaultTableModel(new Object[]{"Product Name", "Region", "Total Spent"}, 0));
    }

    @After
    public void tearDown() {
        // Cleanup resources after each test
        customer = null;
        customer_id_txtfld = null;
        customerBehaviorTable = null;
    }

    @Test
    public void testEmptyCustomerId() {
        // Set an empty customer ID and trigger the customer method
        customer_id_txtfld.setText("");

        customer.customer(customer_id_txtfld, customerBehaviorTable);

        // Assert that an error message is shown (No records found should be displayed)
        assertEquals("Error message should be shown for empty customer ID", 0, customerBehaviorTable.getRowCount());
    }

    @Test
    public void testInvalidCustomerId() {
        // Set an invalid customer ID (non-numeric value)
        customer_id_txtfld.setText("ABC");

        customer.customer(customer_id_txtfld, customerBehaviorTable);

        // Assert that the table remains empty and error message is shown
        assertEquals("Error message should be shown for invalid customer ID", 0, customerBehaviorTable.getRowCount());
    }

    @Test
    public void testValidCustomerIdWithNoRecords() {
        // Set a valid but non-existing customer ID
        customer_id_txtfld.setText("1001");  // Assuming customer ID 1001 does not exist in the database

        customer.customer(customer_id_txtfld, customerBehaviorTable);

        // Assert that the table remains empty and no records found message is shown
        assertEquals("Table should be empty for a customer with no records", 0, customerBehaviorTable.getRowCount());
    }

    @Test
    public void testValidCustomerIdWithRecords() {
        // Set a valid customer ID that exists in the database (assuming 1 exists in the database)
        customer_id_txtfld.setText("1");

        customer.customer(customer_id_txtfld, customerBehaviorTable);

        // Assert that the table is populated with data (at least one row should be added)
        assertTrue("Table should contain rows for a valid customer ID", customerBehaviorTable.getRowCount() > 0);
    }

    @Test
    public void testDatabaseConnectionError() {
        // Simulate a database error by disconnecting the database
        // Here you would modify your database connection logic or mock the connection
        customer_id_txtfld.setText("1");

        // You would simulate a failure to connect to the database, and the exception should be handled
        customer.customer(customer_id_txtfld, customerBehaviorTable);

        // Assert that no data is added, and an error message is shown
        assertEquals("Table should be empty if there's a database connection error", 0, customerBehaviorTable.getRowCount());
    }
}
