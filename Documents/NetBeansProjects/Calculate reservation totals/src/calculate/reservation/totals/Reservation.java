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
    
    private String arrivalDate="";
    private String departureDate="";
    public static final double nightlyRate = 115.00;
    
    
    private Reservation()
    {
        
    }
    private void setArrivalDate(String arrive)
    {
        this.arrivalDate=arrive;
    }
    private String getArrivalDate()
    {
        return arrivalDate;
    }
    
    private void setDepartureDate(String departure)
    {
        this.departureDate=departure;
    }
    
    private String calculateNumberofNight()
    {
        return arrivalDate-departureDate;
    }
    private double calculateTotalPrice()
    {
        
    }
    
    private String  toString()
    {
        
    }
}
