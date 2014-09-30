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
    
   private double cf;
   private double area;
   private double radius;
    
    public double getCircumference()
    {
     this.calculateCircumfrance();
     return cf;
    }
    
    private void calculateCircumfrance()
    {
       cf =  2 * PI * radius;
    }
    
    public String getFormattedCircumference()
    {
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    return nf.format(this.getCircumference());
            
    
    }
    
  
    
    private void calculateArea()
    {
        area=  PI * radius*radius;
    }
    
      public double getArea()
            
    {
        this.calculateArea();
        return area;
    }
      
    public String getFormattedArea()
    {
        
    NumberFormat format =NumberFormat.getCurrencyInstance();
   
    }
    
    private String formatNumber(double a)
    {
    
    }
    
    public static int getObjectCount()
            
    {
    
    }
}
