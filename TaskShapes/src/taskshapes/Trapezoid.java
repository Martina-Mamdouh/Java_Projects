/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public class Trapezoid extends Quadrilateral{
private double height;
    public Trapezoid(double side1, double side2, double side3, double side4,double height) {
        super(side1, side2, side3, side4);
        this.height=height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return (side1 + side2) * height / 2;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3 + side4;
    }
    
}
