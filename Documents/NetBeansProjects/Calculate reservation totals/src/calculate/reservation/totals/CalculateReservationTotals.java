/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.reservation.totals;

import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class CalculateReservationTotals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Welcome to the Reservation Calculator.");
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter the arrival month (1-12): ");
            
            System.out.print("Enter the arrival day (1-31): ");
            System.out.print("Enter the arrival year:  ");
            
            System.out.println("");
            
            System.out.print("Enter the departure month (1-12):  ");
            System.out.print("Enter the departure day (1-31):  ");
            System.out.print("Enter the departure year:   ");
            
            System.out.println("");
            
            
            System.out.println("Another reservation? (y/n): ");
            choice=sc.next();
        }
        
        
    }
    
}
