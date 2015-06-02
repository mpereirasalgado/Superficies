/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mpereirasalgado
 */
public class SuperficiesTest {
    
    public SuperficiesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    

    /**
     * Test of calcular method, of class Superficies.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Modelo contenedor = new Modelo(4, 4, 2, 0, 0, 0, 0, 0, 0, 0);
        float expResult = 4.0F;
        float result = logic.calcular(contenedor);
        assertEquals(expResult, result, 4);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
