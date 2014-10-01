/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project.pkg3.pkg3.gichamo.ashenafi;

/**
 *
 * @author agichamo
 */

import java.text.NumberFormat;
import java.util.Scanner;
import java.math.*;
import java.math.RoundingMode;

public class Project33GichamoAshenafi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String choice = "y";           
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Welcome to the Interest Calculator!");
       
        while(choice.equalsIgnoreCase("y")){
            System.out.println();
                             
            // Enter Loan amount and Interest rate
            System.out.print("Enter Loan Amount:   ");
            double loan = sc.nextDouble();
            BigDecimal loanAmount = new BigDecimal(Double.toString(loan));
            loanAmount = loanAmount.setScale(2, RoundingMode.HALF_UP);
           
            // Formatting  Loan Amount  
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String loanString =currency.format(loanAmount);
            
            
            //Asking  the user to enter the Interest rate
            System.out.print("Enter interest rate:  ");
            double interestRate =sc.nextDouble();
            
            //Convert interestRate to BigDecimal
             BigDecimal decimalInterest = new BigDecimal(Double.toString(interestRate));
                      
            // Formatting  Interest Rate 
            NumberFormat percentage =NumberFormat.getPercentInstance();
            
            percentage.setMaximumFractionDigits(3);
            
            String interestRateString= percentage.format(interestRate);
            
            // Print a blank line
            System.out.println();
            
            //Calculate the Interest 
            BigDecimal interestCalculation = loanAmount.multiply(decimalInterest);
            interestCalculation = interestCalculation.setScale(3, RoundingMode.HALF_UP);
            String interestString =  currency.format(interestCalculation);
            
            // Display the result
            System.out.println("Loan amount:    "+loanString);
            System.out.println("Interest rate:  "+interestRateString);
            System.out.println("Interest:       "+interestString);
            
            // Checking  to see if the user would like to continue or not
            System.out.print("Continue? (y/n): ");
            choice=sc.next();
                           
                                 
                  
        }
            
    }
    
}
