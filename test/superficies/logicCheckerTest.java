/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author mpereirasalgado
 */
@RunWith(Parameterized.class)
public class logicCheckerTest {
   private Float expectedResult;
   private Modelo contenedor;
   private logic logic;

   @Before
   public void initialize() {
       logic = new logic();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
   public logicCheckerTest(Modelo contenedor, float expectedResult) {
      this.contenedor = contenedor;
      this.expectedResult = expectedResult;
   }

   @Parameterized.Parameters
   public static Collection logic() {
      return Arrays.asList(new Object[][] {
         { new Modelo(0, 4, 2, 0, 0, 0, 0, 0, 0, 0),4},
         { new Modelo(0, 16, 4, 0, 0, 0, 0, 0, 0, 0),16},
         { new Modelo(2, 0, 0, 0, 0, 2, 3, 3, 0, 0),3}});
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testlogicChecker() {
      System.out.println("Parametros testeados : " + contenedor );
      assertEquals(expectedResult, superficies.logic.calcular(contenedor),2.0);
   }
    
}
