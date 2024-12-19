/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public class Triangle extends Polygon{
private double base, height;
    public Triangle(double side1, double side2, double side3,double base,double height) {
        super(side1, side2, side3);
        this.base=base;
        this.height=height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double calculateArea() {
         return (base * height) / 2;
    }
    @Override
    public double calculatePerimeter() {
         return side1 + side2 + side3;
    } 
}
