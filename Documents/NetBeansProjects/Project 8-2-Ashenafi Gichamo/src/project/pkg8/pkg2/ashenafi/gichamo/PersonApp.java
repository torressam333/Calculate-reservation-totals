/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg8.pkg2.ashenafi.gichamo;

import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class PersonApp   {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to the Person Tester application");
        System.out.println();
        
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        Customer cust = new Customer();
        
        String choice ="y";
       
      //  do{
            
     while(choice.equalsIgnoreCase("y"))  
     {
        System.out.println("Create customer or employee? (c/e): ");
        String CE =sc.next();
        if(CE.equalsIgnoreCase("c"))
        {
            Customer c =  new Customer(); 
            //Prompt the user to enter FIRST NAME
            System.out.print("Enter first name: ");
            String fName = sc.next();
            
            c.setfirstName(fName);
            
            //get Customer First Name

            
            

            // Prompt the user to enter LAST NAME 
            System.out.print("Enter last name: ");
            String lName = sc.next();
            c.setlastName(lName);
            
            
            // Prompt the USER to enter Email Address
            System.out.print("Enter email address: ");
            String email = sc.next();
            c.setEmail(email);
            
            // Prompt the Customer to enter Customer Number
            System.out.print("Customer number: ");
            String cN = sc.next();
            c.setNumber(cN);
            System.out.println("You entered:"+"\n" + c.getDisplayText());
        
        
        
        
        }
        else if(CE.equalsIgnoreCase("e"))
        {
            Employee e = new Employee();
            System.out.print("Enter first name: ");
            String fName = sc.next();
            sc.nextLine();
            e.setfirstName(fName);
            
            System.out.print("Enter last name: ");
            String lName = sc.next();
            e.setlastName(lName);

            // Prompt the USER to enter Email Address
            System.out.print("Enter email address: ");
            String email = sc.next();
            e.setEmail(email);
            
            
            System.out.print("Social security number: ");
            String SSNumber = sc.next();
            e.setSSN(SSNumber);
            System.out.println("You entered:"+"\n" + e.toString());
            // Prompt the Customer to enter Customer Number
           
            
           
        }
      
        
      
        System.out.print("Continue? (y/n): ");
        choice= sc.next();
                 }
         
      
          
        
    }
    
}
