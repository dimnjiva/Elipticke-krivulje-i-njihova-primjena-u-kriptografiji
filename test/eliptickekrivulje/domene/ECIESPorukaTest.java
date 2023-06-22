/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eliptickekrivulje.domene;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gorup
 */
public class ECIESPorukaTest {
    
    public ECIESPorukaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMessage method, of class ECIESPoruka.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        ECIESPoruka instance = new ECIESPoruka();
        String expResult = null;
        String result = instance.getMessage();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setMessage method, of class ECIESPoruka.
     */
    @Test
    public void testSetMessage() {
        System.out.println("setMessage");
        String message = "Poruka";
        ECIESPoruka instance = new ECIESPoruka();
        instance.setMessage(message);
        assertEquals(message, instance.getMessage());
    }

    /**
     * Test of getR method, of class ECIESPoruka.
     */
    @Test
    public void testGetR() {
        System.out.println("getR");
        ECIESPoruka instance = new ECIESPoruka();
        String expResult = null;
        String result = instance.getR();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setR method, of class ECIESPoruka.
     */
    @Test
    public void testSetR() {
        System.out.println("setR");
        String r = "Primjer";
        ECIESPoruka instance = new ECIESPoruka();
        instance.setR(r);
        assertEquals(r, instance.getR());
    }
    
}
