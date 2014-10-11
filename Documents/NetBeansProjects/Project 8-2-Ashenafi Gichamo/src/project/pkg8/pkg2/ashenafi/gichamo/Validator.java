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
public class Validator {
    
    // Check if the user enter valid letter 
    public static String getYesorNO(Scanner sc , String prompt)
    {
      String answer = "";
      boolean isValid = false;
      while(isValid==false)
      {
          System.out.print(prompt);
          answer = sc.next();
           System.out.println("");
          if (answer.equals("y")|| answer.equals("Y")|| answer.equalsIgnoreCase("n"))
          {
              isValid= true;
              
          }
          else
          {
              System.out.println("Error! please eneter y or n. Try again");
              
          }
      }
      return answer;
    }
    
    // Checks if the user enter c or E
    public static String getCorE(Scanner sc, String prompt)
    {
        String answer="";
        boolean isValid=false;
        while (isValid==false)
        {
            System.out.print(prompt);
            answer=sc.next();
            if(answer.equals("c")||answer.equals("C")|| answer.equals("e")||answer.equals("E"))
            {
                isValid=true;
                
            }
            else
            {
                System.out.println("Error! Please Enter c/e.");
            }
            
            
        }
        return answer;
    }
    
    // get Email checks if he user enter data 
    public static String getEmail(Scanner sc, String prompt)
    {
        String answer = null;
        boolean isValid = false;
        while(isValid==false)
        {
            System.out.print(prompt);
            answer=sc.next();
            
        
            if (!answer.isEmpty())
            {
                isValid= true;
            }
            else
            {
                System.out.println("Error! Please enter valid email address.");
            }
        
        }
         return answer;
    }
    
    // checks if the user enter data
    public static String validateSSN(Scanner sc, String prompt)
    {
        String answer = null;
        boolean isValid =false;
        
        while (isValid==false)
        {
            System.out.print(prompt);
            answer=sc.next();
            if(!answer.isEmpty())
            {
                isValid=true;
            }
            else
            {
                System.out.println("Error! Please enter valid social security no:");
                
            }
        }
        return answer;
    }
    
    
   
    

}
