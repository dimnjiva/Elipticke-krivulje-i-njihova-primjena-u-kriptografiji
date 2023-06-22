/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eliptickekrivulje.algoritmi;

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
public class AESTest {
    
    public AESTest() {
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
     * Test of encrypt method, of class AES.
     */
    @Test
    public void testEncrypt() {
        System.out.println("encrypt");
        String value = "Test";
        String key = "BwmlrnUrg3Hhrp4FLWT/LeCv66fPfY977dsJlMyUtdoxfRlC2uxfuacM13W6KHUR";
        String expResult = null;
        String result = AES.encrypt(value, key);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class AES.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        String encrypted = AES.encrypt("Test", "AQQpGTIg+FYwpsOYWzHppwmhCpTO+BIwl2MVode6lCni7Ddqm9/RGNSHtgiDThhcQJa3DKRyhBlM");
        String key = "AQQpGTIg+FYwpsOYWzHppwmhCpTO+BIwl2MVode6lCni7Ddqm9/RGNSHtgiDThhcQJa3DKRyhBlM";
        String expResult = "Test";
        String result = AES.decrypt(encrypted, key);
        assertEquals(expResult, result);
    }
    
}
