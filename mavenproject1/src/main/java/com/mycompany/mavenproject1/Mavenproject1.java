/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ACER
 */
import java.util.*;
//import java.util.Arrays;

public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Enter the number of students: ");
        Scanner scan=new Scanner(System.in);
        int Snum=scan.nextInt();
        Student [] Students= new Student[Snum];
        while(true)
        {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Remove Student");
            System.out.println("4. Display Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice=scan.nextInt();
            switch(choice)
            {
                case 1:
                    AddStudent(Students);
                    break;
                case 2:
                    UpdateStudent(Students,scan);
                    break;
                case 3:
                    RemoveStudent(Students,scan);
                    break;
                case 4:
                    DisplayStudents(Students);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;
                default :
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
 
    public static void AddStudent(Student []Students)
    {
       Scanner scan=new Scanner(System.in);
       for(int i=0;i<Students.length;i++)
       {
           if(Students[i]==null)
           {
           System.out.println("Enter Your FullName: ");
           String fullname=scan.nextLine();
           System.out.println("Enter Your Age: ");
           int age=scan.nextInt();
           scan.nextLine();
           System.out.println("Enter the grades of subject(Ar, En, French, Jermany, Maths, SS, Sc): ");
           float ar=scan.nextFloat();
           float en=scan.nextFloat();
           float french=scan.nextFloat();
           float jermany=scan.nextFloat();
           float maths=scan.nextFloat();
           float ss=scan.nextFloat();
           float sc=scan.nextFloat();
            scan.nextLine();
            Students[i] = new Student(ar, en,french,jermany, maths,ss, sc);
            Students[i].setFullName(fullname);
            Students[i].setAge(age);
            System.out.println("Student added successfully.");
       }  
        
    }
  }
   public static void UpdateStudent(Student [] Students,Scanner scan)
   {
       System.out.println("Enter the index of student: ");
       int index=scan.nextInt();
       scan.nextLine();
       if(index>=0 && index<=Students.length-1 && Students[index]!=null)
       {
           System.out.println("Enter Your FullName: ");
           String fullname=scan.nextLine();
           System.out.println("Enter Your Age: ");
           int age=scan.nextInt();
           scan.nextLine();
           System.out.println("Enter the grades of subject(Ar, En, French, Jermany, Maths, SS, Sc): ");
           float ar=scan.nextFloat();
           float en=scan.nextFloat();
           float french=scan.nextFloat();
           float jermany=scan.nextFloat();
           float maths=scan.nextFloat();
           float ss=scan.nextFloat();
           float sc=scan.nextFloat();
            scan.nextLine();
            Students[index] = new Student(ar, en,french,jermany, maths,ss, sc);
            Students[index].setFullName(fullname);
            Students[index].setAge(age); 
            System.out.println("Student updated successfully.");
       }
       else
       {
           System.out.println("invalid index");
       }
   }
   public static void RemoveStudent(Student[] Students,Scanner scan)
   {
       System.out.println("Enter the index of student: ");
       int index=scan.nextInt();
       scan.nextLine();
       if(index>=0 && index<=Students.length-1 && Students[index]!=null)
       {
           
           Students[index]=null;
           System.out.println("Student removed successfully.");
       }
       else
       {
        System.out.println("invalid index");   
       }
   }
   public static void DisplayStudents(Student[]Students)
   {
       boolean hasStudents = false;
       for(int i=0;i<Students.length;i++)
       {
           if(Students[i]!=null)
           {
               hasStudents =true;
               System.out.println("Index= "+i);
               Students[i].Display_Student_Info();
               System.out.println("********");
               
           }    
       }
       if(hasStudents==false)
           System.out.println("There is no students to display");
   }
}
