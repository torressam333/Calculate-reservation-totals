/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg7.pkg2.ashenafi.gichamo;
import static java.lang.Math.*;
import java.text.NumberFormat;

/**
 *
 * @author agichamo
 */
public class Circle {
    
   private double Cfrance;
   private double area;
   private double radius;
   private static int objectCount;
   
   // Circle Constractor
   public Circle()
    {
        this.Cfrance=0;
        this.area=0;
        this.radius=0;
        
    }

   public void Circle(double radius)
    {
        this.radius=radius;
        objectCount++;
             
    }

  
   public double getCircumference()
    {
        
        this.calculateCircumfrance(); //calls calculateCircumfrance() method
        return Cfrance;
    }
    
   private void calculateCircumfrance()
    {
        //Cfrance = Circumfrance
       Cfrance =  2 * PI * radius; // Calculate Circumfrance
    }
    
    // This method get formated  Circumfrance
   public String getFormattedCircumference()
    {
       String formatCF = this.formatNumber(Cfrance); // format Circumfrance
       return formatCF; // return Circumfrance
    }
    
  
    // Calculate Area
   private void calculateArea()
    { 
        //area formula
        area=  PI * radius*radius;
    }
    
   public double getArea()
            
    {
        // call calculateArea() method 
        this.calculateArea();
        return area;
    }
      
   public String getFormattedArea()
    {
       String formatedArea=this.formatNumber(area); //format Area
       return formatedArea; // return Area
    }
    
   private String formatNumber(double a)
    {
        NumberFormat setFormat = NumberFormat.getInstance();
        setFormat.setMaximumFractionDigits(2); // set the fraction 
        return setFormat.format(a);
    }
    
    // return the number of Circle object.
    public static int getObjectCount() 
    {
        return objectCount;
    }

   
}
