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
public class CalculateReservationTotals extends Reservation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        System.out.println("Welcome to the Reservation Calculator.");
        Scanner sc = new Scanner(System.in);
        Reservation reserve = new Reservation();
        
        String choice = "y";
        while(choice.equalsIgnoreCase("y"))
        {
            System.out.print("Enter the arrival month (1-12): ");
            int aMM = sc.nextInt();
           
            System.out.print("Enter the arrival day (1-31): ");
            int aDD = sc.nextInt();
            System.out.print("Enter the arrival year:  ");
            int aYY =sc.nextInt();
            System.out.println("");
            
            reserve.setArrivalDate(aYY,aMM,aDD);
            
            System.out.print("Enter the departure month (1-12):  ");
            int dMM = sc.nextInt();
            System.out.print("Enter the departure day (1-31):  ");
            int dDD = sc.nextInt();
            System.out.print("Enter the departure year:   ");
            int dYY = sc.nextInt();
            
            reserve.setDeparture(dYY, dMM, dDD);
            
            System.out.println("");
            
            /**   displays the arrival date, 
            the departure date, the room rate, 
            the total price, and the number of nights.**/
            
            System.out.println("Arrival Date: "   );
            System.out.println("Departure Date: "   );
            System.out.println("Price: " );
            System.out.println("Total price: " +getTotalPrice());
            
            
            
            
            
            System.out.println("Another reservation? (y/n): ");
            choice=sc.next();
            
           
        }
        
        
    }

  
}
