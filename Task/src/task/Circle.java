/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

/**
 *
 * @author ACER
 */
public class Circle extends Shape{
   private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double Area()
    {
        System.out.println("Area of circle= ");
        return 3.14*r*r;
        
    }
    @Override
    public double Perimeter()
    {
        System.out.println("Perimeter of circle= ");
        return 2*3.14*r;
        
    }
}
