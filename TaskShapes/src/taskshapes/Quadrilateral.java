/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskshapes;

/**
 *
 * @author ACER
 */
public abstract class Quadrilateral extends Polygon {
  protected double side4;
    public Quadrilateral(double side1, double side2, double side3,double side4) {
        super(side1, side2, side3);
        this.side4=side4;
    }

    public double getSide4() {
        return side4;
    }

    public void setSide4(double side4) {
        this.side4 = side4;
    }

   
    
}
