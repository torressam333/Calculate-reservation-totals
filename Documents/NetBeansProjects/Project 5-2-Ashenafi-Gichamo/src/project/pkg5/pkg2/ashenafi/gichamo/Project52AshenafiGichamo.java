/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg5.pkg2.ashenafi.gichamo;
//package imports
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.*;
/**
 *
 * @author agichamo
 */
public class Project52AshenafiGichamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // Instantiate a Scanner object
        
        Scanner sc = new Scanner(System.in);
         String choice ="y";
        
        System.out.println("Welcome to the Loan Calculator");
        System.out.println("");
        System.out.println("DATA ENTRY");
        while(choice.equalsIgnoreCase("Y"))
        {
        

          //DATA ENTRY    
          System.out.print("");         
          double loanAmount =getDoublewithinRange(sc,"Enter loan amount: " ,0,1000000);
          double interestRate =getDoublewithinRange(sc,"Enter yearly interest rate:  " ,0,20);
          int numberofYears = getIntWithinRange(sc,"Enter Number of Years: ",0,100);   
             
                 
       //get the total month 
        double months = numberofYears*12;
       
        double interestRateConversion =interestRate/12/100;
        double interestConversion = interestRate/100;
        
        // Calculate  Monthly Payment
        double monthlyPayment = 
                loanAmount * interestRateConversion/
                (1-1/Math.pow(1+interestRateConversion, months));
            
             
        
        // FORMATTED RESULTS
        System.out.println("");
        System.out.println("FORMATTED RESULTS");
        
        //Number Format 
        NumberFormat dollar = NumberFormat.getCurrencyInstance();
        NumberFormat percentage = NumberFormat.getPercentInstance();
        percentage.setMaximumFractionDigits(1);
        dollar.setMaximumFractionDigits(2);
        
      
        //FORMATTED RESULTS
        
        System.out.println("Loan Amount:         "+dollar.format(loanAmount));  
        System.out.println("Yearly Interest Rate:" +percentage.format(interestConversion));
        System.out.println("Number Of Years:     "+numberofYears);  
        System.out.println("Monthly Payment:     "+dollar.format(monthlyPayment));
        
        
  
        
        
        // Prompt the user to continue or not
        boolean  isValid=false;
        while(isValid==false)
            
        {
            System.out.print("Continue? (y/n): ");
            choice=sc.nextLine();
            //sc.nextLine();

            if(choice.isEmpty() && !false) {
               
                 System.out.println("Error! Entry is required. Try again.");
                 continue;}
            else if(choice.equals("y"))
            {
              isValid=true;  
            continue;
            }
            else if (choice.equals("n"))
                         
            {
            break;
            }
           
             else if(!choice.equals("n"))
            {
               System.out.println("Error! Entry must be 'y' or 'n'. Try again");
               continue;

            }
 
        }
                
        }
      
    }
    
    // Double Validation
    
    public static double getDoublewithinRange(Scanner sc, String prompt,double min, double max)
            
    {
        boolean isValid =false;
        double loanAmount =0;
      
        
        while(isValid==false)
        {
                loanAmount = getDouble(sc,prompt);


            if (loanAmount <=min)
            {
            System.out.println("Error! Number must be greater than "+min);
            isValid=false;
            }

            else if (loanAmount>=max)
            {
               System.out.println("Error! Number must be less than "+max);
               isValid=false;
            }
            else
                isValid= true;
        }
        return loanAmount;
    }
    
    //getDouble Method Validate the user input 
    
    public static double getDouble(Scanner sc, String Prompt)
    {
        double d =0;
        boolean isValid = false;
        
        while(isValid==false)
        {
            System.out.print(Prompt);
            if (sc.hasNextDouble())
            {
            d=sc.nextDouble();
            isValid=true;
            }
            
            else
            {
            System.out.println("Error! Invalid decimal value. Try again.");
            }
            sc.nextLine(); //Discard any other data entered on the line
        }
        
        return d;
   
    }
    
    // getIntWithinRange Method Validate the user intput 
    
    public static int getIntWithinRange(Scanner sc, String prompt, int min, int max)
            
    {
        boolean isValid =false;
        int numberofYears = 0;
        
        while(isValid==false)
            
        {
           numberofYears= getInt(sc,prompt);
                if (numberofYears<=min)
                {
                  System.out.println("Error! Number must be greater than "+min);
                  isValid=false;
                  continue; //jump to the the upper loop
                }
                
                else if (numberofYears>=max)
                {
                  // display the error message and prompt the user enter again
                  System.out.println("Error! Number must be less than "+max);
                  isValid=false;
                  continue;
                }
          isValid =true;
        }
     return numberofYears;
    }
    
    // getInt Method  
    public static int getInt(Scanner sc,String Prompt)
    {
        int i =0;
        boolean isValid= false;
        
        while(isValid==false)
        {
         System.out.print(Prompt);
         if(sc.hasNextInt())
         {
         i =sc.nextInt();
         isValid = true;
        }
        
        else
         {
        System.out.println("Error! Invalid decimal value. Try again.");
         }
         sc.nextLine();
       }

      return i;
    
    }
    
    
 

}


