/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskshapes;

/**
 *
 * 
 * @author ACER
 */
import java.util.*;

public class TaskShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<Shape> shapes =new ArrayList<>();
      shapes.add(new Circle(5));
      shapes.add(new Ellipse(8.0,7.0));
      shapes.add(new Parallelogram(5,6.0));
      shapes.add(new Rectangle(10.5,2));
      shapes.add(new Rhombus(5));
      shapes.add(new Square(2));
      shapes.add(new Trapezoid(5,6,7,8,10));
      shapes.add(new Triangle(10.5,15.5,2,6,4));
      for(int i=0;i<shapes.size();i++)
      {
          shapes.get(i).Display();
          System.out.println("--------");
      }
    }   
}
