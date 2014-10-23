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
public class Validate {
    
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
    
    public static String vName(Scanner sc, String prompt)
    {
        
        String name ="";
        boolean isvalid=false;
        
        while (isvalid==false)
        {
            
            System.out.print(prompt);
            name=sc.next().trim();
            
            if (!(name.length() == 0))
            {
                 isvalid=true;
            }
            else 
            {
               
                System.out.print("Please enter Your Name");
                    
             }
            
        }
        return name;
        
    }
            
    
}
