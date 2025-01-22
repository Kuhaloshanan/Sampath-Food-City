package ui;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class loginTest {

    private login Login;  // Corrected to use 'Login' instance instead of 'login'

    public loginTest() {
    }

    @Before
    public void setUp() {
        Login = new login();  // Initialize the login object that contains the login method
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class login.
     */
    @Test
    public void testAdminLogin() throws SQLException {
        // Assuming you already have a user "admin1" with password "admin@1" and userType "admin" in your database
        
        String result = Login.login("admin1", "admin@1", "admin");  // Use the instance 'Login'
        
        // Assert that the login returns "success" for valid credentials
        assertEquals("success", result);
    }

    @Test
    public void testInvalidLogin() throws SQLException {
        // Simulating incorrect login credentials
        String result = Login.login("wrongUser", "wrongPassword", "admin");
        
        // Assert that the result is "invalid credentials" because the credentials are wrong
        assertEquals("invalid credentials", result);
    }

    @Test
    public void testEmptyFields() throws SQLException {
        // Simulating an empty username and password
        String result = Login.login("", "", "");
        
        // Assert that the result is "empty fields" because we have empty input
        assertEquals("empty fields", result);
    }

    @Test
    public void testEmployeeLogin() throws SQLException {
        // Assuming you have an "employee1" with password "emp@1" and userType "employee" in the database
        
        String result = Login.login("user1", "user@1", "Employee");
        
        // Assert that the login for employee returns "success"
        assertEquals("success", result);
    }

  
   
}
