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
public class Validator {
    
      
    public static int getDouble(Scanner sc,String prompt)
    {
        double i = 0;
        boolean isValid = false;
        
        while(isValid==false)
        {
            
            System.out.print(prompt);
            if(sc.hasNextDouble())
                {
                    i=sc.nextDouble();
                    isValid = true;

                }
            
              else 
                {
                    System.out.println("Error! Invalid integer value.Try again.");
                }
                sc.nextLine(); 
        }
        return (int) i;
    }
    

}
