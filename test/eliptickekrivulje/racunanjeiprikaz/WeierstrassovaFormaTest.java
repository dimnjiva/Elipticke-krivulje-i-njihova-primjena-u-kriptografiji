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
public class WeierstrassovaFormaTest {
    
    public WeierstrassovaFormaTest() {
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
     * Test of getA method, of class WeierstrassovaForma.
     */
    @Test
    public void testGetA() {
        System.out.println("getA");
        WeierstrassovaForma instance = new WeierstrassovaForma();
        float expResult = 0.0F;
        float result = instance.getA();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of getB method, of class WeierstrassovaForma.
     */
    @Test
    public void testGetB() {
        System.out.println("getB");
        WeierstrassovaForma instance = new WeierstrassovaForma();
        float expResult = 0.0F;
        float result = instance.getB();
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of postojiLiKratkaWF method, of class WeierstrassovaForma.
     */
    @Test
    public void testPostojiLiKratkaWF() {
        System.out.println("postojiLiKratkaWF");
        WeierstrassovaForma instance = new WeierstrassovaForma();
        boolean expResult = true;
        boolean result = instance.postojiLiKratkaWF(1, 2, 1, 3, 3);
        assertEquals(expResult, result);
    }

    /**
     * Test of kratkaWF method, of class WeierstrassovaForma.
     */
    @Test
    public void testKratkaWF() {
        System.out.println("kratkaWF");
        WeierstrassovaForma instance = new WeierstrassovaForma();
        instance.kratkaWF(3, 2, 1, 3, 1);
        WeierstrassovaForma expected = new WeierstrassovaForma(3213, -91314);
        assertEquals(expected.toString(), instance.toString());
    }

    /**
     * Test of toString method, of class WeierstrassovaForma.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        WeierstrassovaForma instance = new WeierstrassovaForma();
        String expResult = null;
        String result = instance.toString();
        assertNotEquals(expResult, result);
    }
}
