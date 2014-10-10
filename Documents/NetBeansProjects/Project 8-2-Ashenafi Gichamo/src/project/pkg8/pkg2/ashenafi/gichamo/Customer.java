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
        this.cNumber = setNumber;
    }
    //get customr number
    
    public String getNumber()
    {
        return cNumber;
    }
    @Override
    public String toString()
    {
        return "Customer Number: " + cNumber+"\n";
    }
    
   @Override
    public String getDisplayText()// implement the abstract method
    {
        // Should be getDisplayText()
        //return toString();
        return super.toString() +"Customer Number: " + cNumber+"\n";
    }
}
