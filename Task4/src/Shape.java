/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public abstract class Shape {
    public abstract double  calculateArea();
    public abstract double calculatePerimeter();
    public void Display()
    {
        System.out.println("Shape: "+this.getClass().getSimpleName());
        System.out.println("Area: "+calculateArea());
        System.out.println("Perimeter: "+calculatePerimeter());
    }
}
