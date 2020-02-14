/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anup
 */
public class dbConnectionTest {
    
    public dbConnectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }


    /**
     * Test of login method, of class dbConnection.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String username = "";
        String password = "";
        dbConnection instance = new dbConnection();
        ResultSet expResult = null;
        ResultSet result = instance.login(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of userlogin method, of class dbConnection.
     */
    @Test
    public void testUserlogin() {
        System.out.println("userlogin");
        String tokenId = "";
        String password = "";
        dbConnection instance = new dbConnection();
        ResultSet expResult = null;
        ResultSet result = instance.userlogin(tokenId, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToken method, of class dbConnection.
     */
    @Test
    public void testAddToken() {
        System.out.println("addToken");
        String token = "";
        String password = "";
        dbConnection instance = new dbConnection();
        int expResult = 0;
        int result = instance.addToken(token, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addQues method, of class dbConnection.
     */
    @Test
    public void testAddQues() {
        System.out.println("addQues");
        String ques = "";
        String opt1 = "";
        String opt2 = "";
        String opt3 = "";
        String opt4 = "";
        String cor = "";
        String sub = "";
        String admin = "";
        dbConnection instance = new dbConnection();
        int expResult = 0;
        int result = instance.addQues(ques, opt1, opt2, opt3, opt4, cor, sub, admin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
