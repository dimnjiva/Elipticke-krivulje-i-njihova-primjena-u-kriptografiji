/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package eliptickekrivulje.generatorkljuca;

import eliptickekrivulje.domene.ParKljuceva;
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
public class GeneratorKljucaTest {
    
    public GeneratorKljucaTest() {
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
     * Test of generateKeys method, of class GeneratorKljuca.
     */
    @Test
    public void testGenerateKeys() {
        System.out.println("generateKeys");
        GeneratorKljuca instance = new GeneratorKljuca("secp192k1");
        ParKljuceva expResult = null;
        ParKljuceva result = instance.generateKeys();
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void testGetGeneratorKLjuca(){
        System.out.println("getGeneratorKLjuca");
        GeneratorKljuca instance = new GeneratorKljuca("secp384r1");
        GeneratorKljuca expGeneratorKljuca = null;
        assertNotEquals(instance, expGeneratorKljuca);
    }
    
}
