cipackage superficies;

import java.util.Scanner;
import javax.swing.JOptionPane;
import superficies.Modelo;

/**
 * Examen de MVC 3ª Avaliación
 *
 * @author damian
 */
public class Superficies {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo contenedor= new Modelo();
        menu(contenedor);
        
        
        /***String shapeType;

        sc = new Scanner(System.in);

        System.out.println("What shape would you like to find the area of? (square, circle, triangle, rectangle):");
        shapeType = sc.nextLine();
        System.out.println("You said: " + shapeType);

        if (shapeType.equals("square")) {
            //add area calculations for square
            float squareArea;
            float sideLength;

            System.out.println("what is the side length?");
            sideLength = sc.nextFloat();
            squareArea = sideLength * sideLength;
            System.out.println("The area for your square: " + squareArea);

        }
        if (shapeType.equals("rectangle")) {
            //add area calculations for rectangle here
            float sideLength;
            float sideHeight;
            float rectangleArea;

            System.out.println("what is the rectangles width?");
            sideLength = sc.nextFloat();
            System.out.println("What is the rectangles height?");
            sideHeight = sc.nextFloat();
            rectangleArea = sideLength * sideHeight;
            System.out.println("The area for your rectangle is: " + rectangleArea);

        }
        if (shapeType.equals("triangle")) {
            //add area calculations for triangle here
            float baseLength;
            float height;
            float triangleArea;

            System.out.println("What is the base length of the triangle?");
            baseLength = sc.nextFloat();
            System.out.println("What is the height of the triangle?");
            height = sc.nextFloat();
            triangleArea = (float) (0.5 * baseLength * height);
            System.out.println("Your triangles area is: " + triangleArea);

        }
        if (shapeType.equals("circle")) {
            //add area calculations for a circle here
            float radius;
            float circleArea;

            System.out.println("What is the radius of the circle?");
            radius = sc.nextFloat();
            circleArea = radius * radius;
            circleArea = (float) (3.14159265 * circleArea);
            System.out.println("Your Circles area is " + circleArea);**/

        

    }
    
    public static void menu(Modelo contenedor){
        int opcion = 0;
        do{
            switch(Integer.parseInt(JOptionPane.showInputDialog("****\"What shape would you like to find the area of? (square, circle, triangle, rectangle):\"****\n"
                    + "1.- SQUARE\n"
                    + "2.- CIRCLE\n"
                    + "3.- TRIANGLE\n"
                    + "4.- RECTANGLE\n"
                    + "5.- SALIR\n"))){
                case 1:
                    contenedor.setSelectArea(0);
                    contenedor.setSideLength(Float.valueOf(JOptionPane.showInputDialog("what is the side length?")));
                    calcular(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 2:
                    contenedor.setSelectArea(1);
                    contenedor.setRadius(Float.valueOf(JOptionPane.showInputDialog("What is the radius of the circle?")));
                    calcular(contenedor);
                     Vista.Imprimir(contenedor);
                    break;
                case 3:
                    contenedor.setSelectArea(2);
                    contenedor.setBaseLength(Float.valueOf(JOptionPane.showInputDialog("What is the base length of the triangle?")));
                    contenedor.setHeight(Float.valueOf(JOptionPane.showInputDialog("What is the height of the triangle?")));
                    calcular(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 4:
                    contenedor.setSelectArea(3);
                    contenedor.setSideLength(Float.valueOf(JOptionPane.showInputDialog("what is the rectangles width?")));
                    contenedor.setSideHeight(Float.valueOf(JOptionPane.showInputDialog("What is the rectangles height?")));
                    calcular(contenedor);
                     Vista.Imprimir(contenedor);
                    break;
                case 5:
                    System.exit(opcion);
                    break;
            }
            
        }while(opcion < 6 || opcion > 0 );
    }
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
