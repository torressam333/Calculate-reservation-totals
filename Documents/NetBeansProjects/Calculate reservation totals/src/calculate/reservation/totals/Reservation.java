/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculate.reservation.totals;

import java.util.Date;
import java.util.GregorianCalendar;
/**
 *
 * @author agichamo
 */
public class Reservation {
    
    private long arrivalDate;
    private long departureDate;
    private long elapsedDays;
    private long TotalPrice;
    public static final double nightlyRate = 115.00;
    
    
    public Reservation()
    {
        
    }
    public  Date setArrivalDate(int yy,int mm, int dd)
    {
      GregorianCalendar aDate = new GregorianCalendar (yy,mm,dd) ;
       Date arrival = aDate.getTime();
        arrivalDate =arrival.getTime();
      return aDate.getTime();
    }
       
     public  Date setDeparture(int yy,int mm, int dd)
    {
         GregorianCalendar dDate = new GregorianCalendar (yy,mm,dd) ;
         Date departure = dDate.getTime();
          departureDate = departure.getTime();
         return dDate.getTime();
    }
    
    private void   calculateNumberofNight()
    {
        
      long NumberofNight =departureDate-arrivalDate;
      long elapsedDays = NumberofNight/(24*60*60*1000);
      
    }
    
    public long getNumberofNight()
    {
        this.calculateNumberofNight();
        return elapsedDays;
    }
    private void   calculateTotalPrice()
    {
        long TotalPrice = (long) (elapsedDays *nightlyRate);
    }
    
    public long getTotalPrice()
    {
        this.calculateTotalPrice();;
        return TotalPrice;
    }
    
    public String  toString()
    {
       return  getTotalPrice();
    }
}
