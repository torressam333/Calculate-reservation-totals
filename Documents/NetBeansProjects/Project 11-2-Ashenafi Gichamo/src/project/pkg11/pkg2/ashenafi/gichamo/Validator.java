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
    
    //******* Validate User Score  entry ******//
    
    public static int vScore(Scanner sc, String prompt)
    {
        int sScore =0;
        boolean isValid=false;
        
        while (isValid==false)
        {
            System.out.print(prompt);
            sScore=sc.nextInt();
            if (sScore>100||sScore<0) // checks to see if the user enter  a
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
    
    //**** Validat the user first Name and last Name****//
    
    public static String fName(Scanner sc, String prompt)
    {
        Scanner input =new Scanner(System.in);
        String  StudentName="";
        boolean isvalid=false;
       

        while (isvalid==false)
        {
          
            System.out.print(prompt);

            StudentName = input.nextLine();//search through the input looking for a line separator

            if (StudentName == null || StudentName.equals(""))// check if the the user input is blank
            {
                System.out.println("First Name can't be empty! Please Enter your Name.");
            }
            
            else 
            {
               isvalid=true;
             
            }
         
        }
        return StudentName; //return studnet  Name
        
    }
    

            
    
}
