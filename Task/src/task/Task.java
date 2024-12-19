/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task;

/**
 *
 * @author ACER
 */
public class Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle c1=new Circle() ;
        c1.setR(5);
        System.out.println(c1.Area());
        System.out.println(c1.Perimeter());
        Rectangle r1=new Rectangle ();
        r1.setHeight(5);
        r1.setWidth(6);
        System.out.println(r1.Area());
        System.out.println(r1.Perimeter());
    }
    
}
