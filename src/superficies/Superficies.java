package superficies;
import java.util.Scanner;
import javax.swing.JOptionPane;
import superficies.Modelo;
import superficies.Visualizar;

/**
 * Examen de MVC 3ª Avaliación
 * ramaCod examen
 * @author damian
 */
public class Superficies {


    /**cambios realizados
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedir fig
        //Pedir dato
        //calcularDato
        //imrpimir
        Modelo contenedor= new Modelo();
        Visualizar.menu(contenedor);
    }
    
    /**
     * metodo menu en el que escogemos la superficie que deseamos calcular
     * se guarada la opcion seleccionada
     * se introducen los datos pedidos
     * se llama al metodo calcular y al metodo imprimir
     * @param contenedor
     */
    

    /**
     * metodo de calculo de ojeto contenedor de datos de tipo Modelo
     * se recoge el tipo de superficie elegida en el metodo menu
     * se calcula su area
     * @param contenedor
     */
    public static void calcular(Modelo contenedor){
        if (contenedor.getSelectArea() == 0){
            contenedor.setSquareArea(contenedor.getSideLength()*contenedor.getSideLength());
        }else if(contenedor.getSelectArea() == 1){
            contenedor.setCircleArea((float) 3.14159265 *(contenedor.getRadius()*contenedor.getRadius()));
        }else if(contenedor.getSelectArea()== 2){
            contenedor.setTriangleArea((contenedor.getBaseLength()*contenedor.getHeight())/2);
        }else if(contenedor.getSelectArea()== 3){
            contenedor.setRectangleArea(contenedor.getSideHeight()*contenedor.getSideLength());
        }
    }
}
