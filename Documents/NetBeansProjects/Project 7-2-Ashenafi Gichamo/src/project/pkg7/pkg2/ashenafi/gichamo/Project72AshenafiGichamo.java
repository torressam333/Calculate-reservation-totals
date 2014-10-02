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
        
        // Welcome Note
        System.out.println("Welcome to the Circle Tester");
        System.out.println();
        
        String choice="y";
        Scanner sc = new Scanner(System.in); // create scanner object
                   
        while(choice.equalsIgnoreCase("y"))
        {
            double radius = Validator.getDouble(sc,"Enter radius : ");
            
            
            Circle cl = new Circle(); // create a circle  object
            cl.Circle(radius);
            cl.getArea();
            cl.getCircumference();
            
            
            //FORMATTED RESULTS
            
            System.out.println("Circumference: " + cl.getFormattedCircumference());
            System.out.println("Area:          " +cl.getFormattedArea());
            System.out.println();
        
            
            // Validate User Input and display Message

           
            boolean  isValid=false;
            while(isValid==false)

            {
                System.out.print("Continue? (y/n):");
                choice=sc.nextLine();
                System.out.println();
              

            if(choice.isEmpty() && !false)  // check to see if the entry is empty
                {

                     System.out.println("Error! Entry is required. Try again.");
                     System.out.println();
                     continue;
                }
                
            else if(choice.equalsIgnoreCase("y")) 
                {
                  isValid=true;  
                 // sc.nextLine(); 
                  continue;
                }
            else if (choice.equalsIgnoreCase("n"))

                {
                int objectCount = cl.getObjectCount(); // assign the value that has been counted using "getObjectCount" method
                System.out.println("Goodbye. You created " +objectCount+ " Circle object(s)." ); // Display the Message
                isValid=true;  
                break;
                }
                
            else
                {
                    System.out.println("Please enter  \"y\" or \"n\".");
                    System.out.println();
                }
           
             
            }

        }
      
    } //main

    
}//Project72AshenafiGichamo
