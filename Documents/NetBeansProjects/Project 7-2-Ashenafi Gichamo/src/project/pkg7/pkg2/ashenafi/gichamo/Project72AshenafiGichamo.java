/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg7.pkg2.ashenafi.gichamo;

import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class Project72AshenafiGichamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to the Circle Tester");
        System.out.println();
        
        String choice="y";
        
        Scanner sc = new Scanner(System.in);
        
             
        
        while(choice.equalsIgnoreCase("y"))
        {
            double radius = Validator.getDouble(sc,"Enter radius: ");
            
            // create circle object
            Circle cl = new Circle();
            cl.Circle(radius);
            cl.getArea();
            cl.getCircumference();
            
            
            //Formatted Out Put
            System.out.println("Circumference: " + cl.getFormattedCircumference());
            System.out.println("Area:          "+cl.getFormattedArea());
            
            
            // Prompt the usere to continue or not 
            
            System.out.print("Continue? (y/n): ");
            choice=sc.next();
            
            if(choice=="n")
            {
                int objectCount = cl.getObjectCount();
                System.out.println("Goodbye. You created" +objectCount+ "Circle object(s)." );
            
            }
            
            
   
        }
        
    }
    
    
    
}
