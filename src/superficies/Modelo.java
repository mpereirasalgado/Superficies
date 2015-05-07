/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficies;

/**
 * commit
 * @author mpereirasalgado
 */
public class Modelo {
    float squareArea;
    float sideLength;
    float sideHeight;
    float rectangleArea;
    float baseLength;
    float height;
    float triangleArea;
    float radius;
    float circleArea;
    float selectArea;

    /**
     *
     * @param selectArea con este parametro indicamos que area seleccionamos para realizar los calculos
     * @param squareArea en este parametro se guarda el calculo del area del cuadrado
     * @param sideLength parametro de longitud de lado del rectangulo
     * @param sideHeight parametro de altura de lado del rectangulo
     * @param rectangleArea en este parametro se guarda elcalculo del area del rectangulo
     * @param baseLength parametro de base del triangulo
     * @param height parametro de altura del triangulo
     * @param triangleArea en este parametro se guarda el calculo del area del triangulo
     * @param radius parametro de radio
     * @param circleArea en este parametro se guarda el calculo del area del circulo
     */
    public Modelo(float selectArea, float squareArea, float sideLength, float sideHeight, float rectangleArea, float baseLength, float height, float triangleArea, float radius, float circleArea) {
        this.squareArea = squareArea;
        this.sideLength = sideLength;
        this.sideHeight = sideHeight;
        this.rectangleArea = rectangleArea;
        this.baseLength = baseLength;
        this.height = height;
        this.triangleArea = triangleArea;
        this.radius = radius;
        this.circleArea = circleArea;
        this.selectArea = selectArea;
    }

    /**
     *
     */
    public Modelo() {
    }

    /**
     *
     * @return
     */
    public float getSelectArea() {
        return selectArea;
    }

    /**
     *
     * @param selectArea
     */
    public void setSelectArea(float selectArea) {
        this.selectArea = selectArea;
    }
    
    /**
     *
     * @return
     */
    public float getSquareArea() {
        return squareArea;
    }

    /**
     *
     * @param squareArea
     */
    public void setSquareArea(float squareArea) {
        this.squareArea = squareArea;
    }

    /**
     *
     * @return
     */
    public float getSideLength() {
        return sideLength;
    }

    /**
     *
     * @param sideLength
     */
    public void setSideLength(float sideLength) {
        this.sideLength = sideLength;
    }

    /**
     *
     * @return
     */
    public float getSideHeight() {
        return sideHeight;
    }

    /**
     *
     * @param sideHeight
     */
    public void setSideHeight(float sideHeight) {
        this.sideHeight = sideHeight;
    }

    /**
     *
     * @return
     */
    public float getRectangleArea() {
        return rectangleArea;
    }

    /**
     *
     * @param rectangleArea
     */
    public void setRectangleArea(float rectangleArea) {
        this.rectangleArea = rectangleArea;
    }

    /**
     *
     * @return
     */
    public float getBaseLength() {
        return baseLength;
    }

    /**
     *
     * @param baseLength
     */
    public void setBaseLength(float baseLength) {
        this.baseLength = baseLength;
    }

    /**
     *
     * @return
     */
    public float getHeight() {
        return height;
    }

    /**
     *
     * @param height
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     *
     * @return
     */
    public float getTriangleArea() {
        return triangleArea;
    }

    /**
     *
     * @param triangleArea
     */
    public void setTriangleArea(float triangleArea) {
        this.triangleArea = triangleArea;
    }

    /**
     *
     * @return
     */
    public float getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public float getCircleArea() {
        return circleArea;
    }

    /**
     *
     * @param circleArea
     */
    public void setCircleArea(float circleArea) {
        this.circleArea = circleArea;
    }

    @Override
    public String toString() {
        return "Modelo{" + "squareArea=" + squareArea + ", sideLength=" + sideLength + ", sideHeight=" + sideHeight + ", rectangleArea=" + rectangleArea + ", baseLength=" + baseLength + ", height=" + height + ", triangleArea=" + triangleArea + ", radius=" + radius + ", circleArea=" + circleArea + ", selectArea=" + selectArea + '}';
    }
    
    
    

}
