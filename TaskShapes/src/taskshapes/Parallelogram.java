/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public class Parallelogram extends Quadrilateral{
  private double height;
    public Parallelogram(double base, double height) {
        super(base, height, base, height);
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
        return side1*height;
    }
    @Override
    public double calculatePerimeter() {
       return 2*(side1+side2);
    }   
}
