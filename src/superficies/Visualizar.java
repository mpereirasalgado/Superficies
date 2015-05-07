/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * commit añadido tambien
 * @author mpereirasalgado
 */
public class Visualizar {

    /**
     * metodo que nos manda en ventana el resultado del area calculada
     * @param contenedor
     */
    public static void Imprimir(Modelo contenedor){
        if (contenedor.getSelectArea() == 0){
            JOptionPane.showMessageDialog(null, "The area for your square:  "+contenedor.getSquareArea());
        }else if(contenedor.getSelectArea() == 1){
            JOptionPane.showMessageDialog(null, "Your Circles area is:  "+contenedor.getCircleArea());
        }else if(contenedor.getSelectArea() == 2){
            JOptionPane.showMessageDialog(null, "Your triangles area is:  "+contenedor.getTriangleArea());
        }else if(contenedor.getSelectArea()== 3){
            JOptionPane.showMessageDialog(null, "The area for your rectangle is:  "+contenedor.getRectangleArea());
        }
    }
    
}
