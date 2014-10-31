/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.reservation.totals;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
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
        
        
       System.out.println("Welcome to the Reservation Calculator."+"\n");
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
            
            //reserve.setArrivalDate(aYY,aMM,aMMaMM);
            
            GregorianCalendar aDate = new GregorianCalendar (aYY,aMM,aDD) ;
            aDate.getTime();
            Date arrival = aDate.getTime();
        
            // Prompt the user to enter the departure Month ,Day and Year
            System.out.print("Enter the departure month (1-12):  ");
            int dMM = sc.nextInt();
            System.out.print("Enter the departure day (1-31):  ");
            int dDD = sc.nextInt();
            System.out.print("Enter the departure year:   ");
            int dYY = sc.nextInt();
            
            // instantiate GregorianCalendar object
            GregorianCalendar dDate = new GregorianCalendar (dYY,dMM,dDD);
          
            //  convert the GregorianCalendar to date object
            Date departure = dDate.getTime();
            
            // pass the arrival and departure date object to reserveation class
            reserve.Reservation(arrival,departure);
           
            
            
            System.out.println("");
            
            /**   displays the arrival date, 
            the departure date, the room rate, 
            the total price, and the number of nights.**/
            System.out.println("");
            System.out.println("Arrival Date: " + reserve.getFormattedArrivalDate()  );
            System.out.println("Departure Date: "+reserve.getFormattedDepartureDate()   );
            System.out.println("Price: " +nightlyRate+" per night");
            System.out.println("Total price: " + reserve.getTotalPrice()+" for " +reserve.getNumberofNight()+ " nights ");
            
            
            
            
            
            System.out.print("\n"+"Another reservation? (y/n): ");
            choice=sc.next();
            
           
        }
        
        
    }

  
}
