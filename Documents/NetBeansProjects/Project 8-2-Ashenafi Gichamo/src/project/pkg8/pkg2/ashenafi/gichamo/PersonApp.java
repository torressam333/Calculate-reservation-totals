/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg8.pkg2.ashenafi.gichamo;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author agichamo
 */
public class PersonApp   {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        System.out.print("Welcome to the Person Tester application"+"\n");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in); // Scanner Object instantiation 
        String choice ="";
        String CM = "";
       
    
            
     do
     {
        
        CM = Validator.getCorE(sc,"Create customer or employee? (c/e):"); // calls getCorE method from Validator class
      
        if(CM.equalsIgnoreCase("c"))
        {
            Customer c =  new Customer();  // Customer class object
            //Prompt the user to enter FIRST NAME
            System.out.println("");// New line
            System.out.print("Enter first name: ");
            String fName = sc.next();
            c.setfirstName(fName);
            
            // Prompt the user to enter his/her Last Name
            System.out.print("Enter last name: ");
            String lName = sc.next();
            c.setlastName(lName);
            
            
            // Prompt the USER to enter Email Address
             String email=Validator.getEmail(sc,"Enter email address: ");
             c.setEmail(email);
            
            // Prompt the Customer to enter Customer Number
            System.out.print("Customer number: ");
            String cN = sc.next();
            System.out.println("");
            c.setNumber(cN);
            // Display the User Data
            System.out.println("You entered:"+"\n"+ c.getDisplayText());
        
        
        
        
        }
        else if(CM.equalsIgnoreCase("e"))
        {
            Employee e = new Employee(); // employee object 
            System.out.println("");
            // Prompt the user to enter first Name
            System.out.print("Enter first name: ");
            String fName = sc.next(); // asign the data to fName variable
            sc.nextLine();
            e.setfirstName(fName);
            // Prompt the user to enter Lase  Name
            System.out.print("Enter last name: ");
            String lName = sc.next();
            e.setlastName(lName);

            // Prompt the USER to enter Email Address
            
            String email = Validator.getEmail(sc, "Enter email address: ");
            e.setEmail(email);
            
            
            System.out.print("");
            String SSNumber = Validator.validateSSN(sc,"Social security number:");
            e.setSSN(SSNumber);
            System.out.println("");
            // Prompt the Customer to enter Customer Number
           System.out.println("You entered: "+"\n" + e.getDisplayText());
            
           
        }
      
        choice= Validator.getYesorNO(sc,"Continue? (y/n): "); // prompts the user to continue or not.
       }while(choice.equalsIgnoreCase("y"));
         
      
          
        
    }
    
    
}
