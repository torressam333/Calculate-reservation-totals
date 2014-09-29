/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package project.pkg4.pkg2.gichamo.ashenafi;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class Project42GichamoAshenafi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to the Factorial Calculator");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        String choice="y";
          
        // check the user input choice
        while(choice.equalsIgnoreCase("y"))
        {
         double fact = 1.0; 
         System.out.println();
         System.out.print("Enter an integer that's greater than 0 and less than or equal to 10: ");
         long userInput =sc.nextInt();
        
        // Calculate factorial
         
        for(int i=2; i<=userInput; i++)
        {
                   fact =fact*i;  
        }
        
        // Print the factorial result
                            
        System.out.print("The factorial of "+userInput );
        System.out.println(" is "+fact );
        
        // prompts the user to continue or not.
        
        System.out.println();
        System.out.print("Continue? (y/n): ");
        choice= sc.next();
    }
        
     
    } 
}