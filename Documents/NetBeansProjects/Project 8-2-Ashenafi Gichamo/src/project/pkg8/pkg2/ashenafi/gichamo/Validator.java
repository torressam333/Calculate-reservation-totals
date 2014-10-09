/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg8.pkg2.ashenafi.gichamo;

/**
 *
 * @author agichamo
 */
public class Validator {
    
    public static String userInput(String input)
            
    {
        String i= "";
        boolean isValid = false;
        
      //  while(isValid==false)
       // {
           
            if(!input.isEmpty())
                {
                    i=input;
                    isValid = true;

                }
            
              else 
                {
                    System.out.println("Please Enter Again!");
                    
                }
            
      //  }
        return  i;
    }
    
}
