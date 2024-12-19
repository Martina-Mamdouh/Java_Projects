/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;



/**
 *
 * @author ACER
 */
public class Student
{
   private String FullName;
   private int Age;
   private float Ar,En,Maths,French,SC,SS,Jermany;
   private float GPA ;
   private static float TotalGPA=4.0f;
   public Student(String FullName,int Age)
   {
       this.FullName=FullName;
       this.Age=Age;
   }
   public Student(float Ar,float En,float Maths,float French,float SC,float SS,float Jermany)
   {
       this.Ar=Ar;
       this.En=En;
       this.Maths=Maths;
       this.French=French;
       this.SC=SC;
       this.SS=SS;
       this.Jermany=Jermany;
       calculateGPA();
   }
    private  void calculateGPA() {
        float totalScore = Ar + En + Maths + French + SC + SS + Jermany;
        float maxScore = 7 * 100.0f; 
        this.GPA = (totalScore / maxScore) * TotalGPA;
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        
          this.Age = Age;
    }

    public double getAr() {
        return Ar;
    }

    public void setAr(float Ar) {
        if(Ar>=0 && Ar<=100){
           this.Ar = Ar;
           calculateGPA();
        }
        else 
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public double getEn() {
        return En;
    }

    public void setEn(float En) {
        if(En>=0 && En<=100){
           this.En = En;
           calculateGPA();
        }
        else 
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public double getMaths() {
        return Maths;
    }

    public void setMaths(float Maths) {
        if(Maths>=0 && Maths<=100){
          this.Maths = Maths;
          calculateGPA();
        }
        else 
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public double getFrench() {
        return French;
    }

    public void setFrench(float French) {
        if(French>=0 && French<=100){
           this.French = French;
           calculateGPA();
        }
        else 
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public double getSC() {
        return SC;
    }

    public void setSC(float SC) {
        if(SC>=0 && SC<=100){
            this.SC = SC;
            calculateGPA();
        }
        else 
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public double getSS() {
        return SS;
    }

    public void setSS(float SS) {
        
        if(SS>=0 && SS<=100){
            this.SS = SS;
            calculateGPA();
        }
        else 
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public double getJermany() {
        return Jermany;
    }

    public void setJermany(float Jermany) {
        if(Jermany>=0 && Jermany<=100){
            this.Jermany = Jermany;
            calculateGPA();
        }
        else
            System.out.println("Not Valid. you should enter a value between 0 and 100");
    }

    public float getGPA() {
        return GPA;
    }
     public static float getTotalGPA() {
       return TotalGPA;
   }
   public static void setTotalGPA(float TotalGPA) {
       Student.TotalGPA = TotalGPA;
   }
    public void Display_Student_Info()
    {
        System.out.println("Student name is:"+FullName+" the age is: "+Age);
        System.out.println("Scores of subjects(Ar, En, French, Jermany, Maths, SS, Sc) in the same order: "+Ar+En+French+Jermany+Maths+SS+SC);
        System.out.println("GPA is: "+GPA);
    }
    
}
