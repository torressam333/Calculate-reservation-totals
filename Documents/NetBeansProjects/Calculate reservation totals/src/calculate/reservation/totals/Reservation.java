/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculate.reservation.totals;

import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author agichamo
 */
public class Reservation {
    
    private  Date arrivalDate;
    private  Date departureDate;
    private  long elapsedDays;
    private  long TotalPrice;
    public static final long nightlyRate = (long) 115.00;
    
    
     public void Reservation(Date aDate, Date dDate)
    {
        this.arrivalDate=aDate;
        this.departureDate=dDate;
        
        
    }

    Reservation() {
    }
 
    public  long  calculateNumberofNight()
    {
      long  arrivalDateTime =  arrivalDate.getTime();
      long departureDateTime = departureDate.getTime();
      long elapse = departureDateTime-arrivalDateTime;
      elapsedDays = elapse/(24*60*60*1000);
      return elapsedDays;
    }
    
    public long getNumberofNight()
    {
        this.calculateNumberofNight();
        return elapsedDays;
    }
    public long   calculateTotalPrice()
    { 
        long  arrivalDateTime =  arrivalDate.getTime();
      long departureDateTime = departureDate.getTime();
      long elapse = departureDateTime-arrivalDateTime;
      elapsedDays = elapse/(24*60*60*1000);
         TotalPrice =  elapsedDays *nightlyRate;
        return TotalPrice;
    }
    
    public  long getTotalPrice()
   {
       this.calculateTotalPrice();
        return TotalPrice;
    }
    
    // format Arrival Date
    public String getFormattedArrivalDate()
    {
  
            DateFormat adateFormat = DateFormat.getDateInstance(DateFormat.FULL);
            String formattedArrivalDate =adateFormat.format(arrivalDate);
            return formattedArrivalDate;
    }
    // format departure date
    public String getFormattedDepartureDate()
    {
  
            DateFormat adateFormat = DateFormat.getDateInstance(DateFormat.FULL);
            String formattedArrivalDate =adateFormat.format(departureDate);
            return formattedArrivalDate;
    }

  /* @Override
    public String toString()
    {
       return formattedArrivalDate;
    }*/

}
   

    
