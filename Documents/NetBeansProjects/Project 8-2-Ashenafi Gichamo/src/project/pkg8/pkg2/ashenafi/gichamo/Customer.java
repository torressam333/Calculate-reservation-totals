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
// customer is a sub class of Person class
public class Customer extends Person{
    
    private String cNumber; //cNumber= Customer Number
    
    // Custmer class constractor
   
    public Customer()
    {
   
        this.cNumber="";
   
    }
    
    // get Customer Number
    public void setNumber(String setNumber)
    {
        this.cNumber = setNumber; // set customer number
    }
   
    public String getNumber()
    {
        return cNumber; // return customer number
    }
    @Override
    public String toString()
    {
        // return customer number
        return "Customer Number: " + cNumber+"\n";
    }
    
   @Override
    public String getDisplayText()// implement the abstract method
    {
        //return customer number and  super class toString 
        return super.toString() +"Customer Number: " + cNumber+"\n";
    }
}
