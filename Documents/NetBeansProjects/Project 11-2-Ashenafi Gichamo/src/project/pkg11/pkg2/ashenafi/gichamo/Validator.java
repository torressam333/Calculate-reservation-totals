/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg11.pkg2.ashenafi.gichamo;

import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class Validator {
    
    public static int vScore(Scanner sc, String prompt)
    {
        int sScore =0;
        boolean isValid=false;
        
        while (isValid==false)
        {
            System.out.print(prompt);
            sScore=sc.nextInt();
            if (sScore>100||sScore<0)
            {
                System.out.println("Please Enter a score that is between 0 to 100");
            }
            else
            {
                isValid=true;
            }
            
        }
        return sScore;
        
    }
    
    public static String fName(Scanner sc, String prompt)
    {
        
        String fname = null;
        boolean isvalid=false;
       
        while (isvalid==false)
        {
          
            System.out.print(prompt);
            fname= sc.next();
      
            if (!(fname.equals("")))
            {
              
                 isvalid=true;
            }
       
      
            else 
            {
                  System.out.println("First Name can't be empty! Please Enter your Name.");
               
                    
             }
         //   sc.nextLine();
           
            
        }
        return fname;
        
    }
    

            
    
}
