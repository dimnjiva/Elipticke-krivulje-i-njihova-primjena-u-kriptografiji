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
public class ParKljucevaTest {
    
    public ParKljucevaTest() {
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
     * Test of getPrivateKey method, of class ParKljuceva.
     */
    @Test
    public void testGetPrivateKey() {
        System.out.println("getPrivateKey");
        ParKljuceva instance = new ParKljuceva();
        String expResult = null;
        String result = instance.getPrivateKey();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setPrivateKey method, of class ParKljuceva.
     */
    @Test
    public void testSetPrivateKey() {
        System.out.println("setPrivateKey");
        String privateKey = "R6uW2S0jzzNWsr5IDWu6zvm5bgdKTfq1DP4aJQ==";
        ParKljuceva instance = new ParKljuceva();
        instance.setPrivateKey(privateKey);
        assertEquals(privateKey, instance.getPrivateKey());
    }

    /**
     * Test of getPublicKey method, of class ParKljuceva.
     */
    @Test
    public void testGetPublicKey() {
        System.out.println("getPublicKey");
        ParKljuceva instance = new ParKljuceva();
        String expResult = null;
        String result = instance.getPublicKey();
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setPublicKey method, of class ParKljuceva.
     */
    @Test
    public void testSetPublicKey() {
        System.out.println("setPublicKey");
        String publicKey = "AQQpGTIg+FYwpsOYWzHppwmhCpTO+BIwl2MVode6lCni7Ddqm9/RGNSHtgiDThhcQJa3DKRyhBlM";
        ParKljuceva instance = new ParKljuceva();
        instance.setPublicKey(publicKey);
        assertEquals(publicKey, instance.getPublicKey());
    }
    
}
