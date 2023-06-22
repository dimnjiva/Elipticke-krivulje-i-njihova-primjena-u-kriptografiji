/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eliptickekrivulje.racunanjeiprikaz;

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
public class TockaTest {
    
    public TockaTest() {
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
     * Test of beskonacnaTocka method, of class Tocka.
     */
    @Test
    public void testBeskonacnaTocka() {
        System.out.println("beskonacnaTocka");
        Tocka instance = new Tocka(1, 8);
        instance = instance.beskonacnaTocka();
        boolean result = instance.beskTocka;
        boolean expResult = true;
        assertEquals(expResult, result);
    }

    /**
     * Test of jednako method, of class Tocka.
     */
    @Test
    public void testJednako() {
        System.out.println("jednako");
        Tocka instance = new Tocka(2, 5);
        Tocka t = new Tocka(2, 5);
        boolean result = instance.jednako(t);
        boolean expValue = true;
        assertEquals(expValue, result);
    }

    /**
     * Test of toString method, of class Tocka.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Tocka instance = new Tocka();
        String expResult = null;
        String result = instance.toString();
        assertNotEquals(expResult, result);
    }
    
}
