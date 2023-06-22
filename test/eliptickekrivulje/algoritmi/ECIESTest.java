/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eliptickekrivulje.algoritmi;

import eliptickekrivulje.domene.ECIESPoruka;
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
public class ECIESTest {
    
    public ECIESTest() {
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
     * Test of encryptECIES method, of class ECIES.
     */
    @Test
    public void testEncryptECIES() {
        System.out.println("encryptECIES");
        String plaintext = "Test";
        String publicKey = "B8iS0gCc/+0FOKz1jau9eWIixehOEKlOt5DxtvArWr1XWTb5FOD0vPDUoYPEuE9VfAujab8S3lA=";
        ECIES instance = new ECIES("secp224r1");
        ECIESPoruka expResult = null;
        ECIESPoruka result = instance.encryptECIES(plaintext, publicKey);
        assertNotEquals(expResult, result);
    }

    /**
     * Test of decrypt method, of class ECIES.
     */
    @Test
    public void testDecrypt() {
        System.out.println("decrypt");
        ECIESPoruka eciesMessage = new ECIESPoruka();
        eciesMessage.setMessage("ITQqfOclYOKlQt/EHufqUA==");
        eciesMessage.setR("CKhWl0D7JCH6MK8PBahfZOhwArcSFvv4h3x8CU293FH8V6Pkk58hmbx0yPW/0B1Fgyvzpv7k3J/HA1XrKGNB/QDaOBNVfdkD5sOO7HHEDd1jGz7xNEZpJZg76pwguYz+");
        String privateKey = "BwmlrnUrg3Hhrp4FLWT/LeCv66fPfY977dsJlMyUtdoxfRlC2uxfuacM13W6KHUR";
        ECIES instance = new ECIES("secp521r1");
        String expResult = "Test";
        String result = instance.decrypt(eciesMessage, privateKey);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetECIES(){
        System.out.println("getECIES");
        ECIES instance = new ECIES("secp192k1");
        ECIES expResult = null;
        assertNotEquals(expResult, instance);
        
        ECIES instance1 = new ECIES("secp192k1");
        ECIES expResult1 = null;
        assertNotEquals(expResult1, instance1);
    }
    
}
