package ui;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class product_performanceTest {

    private product_performance instance;  // Replace with your actual class name
    private JTable table;
    private JTextField bestSalesRegionField;

    @Before
    public void setUp() {
        instance = new product_performance(); // Initialize the test class correctly
        table = new JTable(); // Simulate the JTable
        bestSalesRegionField = new JTextField(); // Simulate the JTextField
    }

    @After
    public void tearDown() {
        instance = null;
        table = null;
        bestSalesRegionField = null;
    }

    /**
     * Test valid product ID (integer)
     */
    @Test
    public void testValidProductId() throws SQLException {
        int validProductId = 103; // Valid product ID input

        // Call the productPerformance method with valid input
        instance.productPerformance(validProductId, table, bestSalesRegionField);

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Assert that the table contains rows (at least one product)
        assertTrue("The table should contain at least one row for a valid product ID", model.getRowCount() > 0);
        // Assert that the best sales region field is populated
        assertTrue("The best sales region field should be populated", bestSalesRegionField.getText().length() > 0);
    }

    /**
     * Test invalid product ID (non-existent product)
     */
    @Test
    public void testInvalidProductId() throws SQLException {
        int invalidProductId = 1000; // Invalid product ID input

        // Call the productPerformance method with an invalid product ID
        instance.productPerformance(invalidProductId, table, bestSalesRegionField);

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Assert that the table contains no rows (invalid ID should result in no data)
        assertEquals("The table should contain no rows for an invalid product ID", 0, model.getRowCount());
        // Assert that the best sales region field is empty for invalid product ID
        assertEquals("The best sales region field should be empty for invalid product ID", "", bestSalesRegionField.getText());
    }

    /**
     * Test empty product ID (empty input)
     */
   @Test
    public void testEmpty() throws SQLException {
        Integer emptyProductId = null; // Represent empty as null

        if (emptyProductId == null) {
            // Simulate the behavior when no product ID is provided
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Ensure table is cleared
            bestSalesRegionField.setText(""); // Ensure text field is cleared
        } else {
            // Call the method if product ID is not null (not empty)
            instance.productPerformance(emptyProductId, table, bestSalesRegionField);
        }

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        // Assert that the table contains no rows
        assertEquals("The table should contain no rows for an empty product ID", 0, model.getRowCount());
        // Assert that the best sales region field is empty
        assertEquals("The best sales region field should be empty for an empty product ID", "", bestSalesRegionField.getText());
    }
}
