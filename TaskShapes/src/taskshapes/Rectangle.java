/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public class Rectangle extends Quadrilateral {

   public Rectangle(double length, double width) {
        super(length, width, length, width); 
    }

    @Override
    public double calculateArea() {
        return side1*side2;
    }

    @Override
    public double calculatePerimeter() {
       return 2*(side1+side2);
    }
    
}
