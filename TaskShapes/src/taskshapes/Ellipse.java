/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public class Ellipse extends Shape {
   double majorAxisRadius ,minorAxisRadius;

    public Ellipse(double majorAxisRadius, double minorAxisRadius) {
        this.majorAxisRadius = majorAxisRadius;
        this.minorAxisRadius = minorAxisRadius;
    }

    public double getMajorAxisRadius() {
        return majorAxisRadius;
    }

    public void setMajorAxisRadius(double majorAxisRadius) {
        this.majorAxisRadius = majorAxisRadius;
    }

    public double getMinorAxisRadius() {
        return minorAxisRadius;
    }

    public void setMinorAxisRadius(double minorAxisRadius) {
        this.minorAxisRadius = minorAxisRadius;
    }
   
    @Override
    public double calculateArea() {
        return 3.14*minorAxisRadius*majorAxisRadius; 
    }

    @Override
    public double calculatePerimeter() {
         return Math.PI * (3 * (majorAxisRadius + minorAxisRadius) - Math.sqrt((3 * majorAxisRadius + minorAxisRadius) * (majorAxisRadius + 3 * minorAxisRadius)));
 
    }
    
}
