/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public class Rhombus extends Parallelogram {
    
    public Rhombus(double side) {
        super(side,side);
    }
    @Override
    public double calculateArea() {
        return side1 * side2;
    }
    @Override
     public double calculatePerimeter() {
        return 4 * side1;
    }
}
