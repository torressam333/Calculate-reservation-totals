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
    
    public Customer()
    {
      
    }
    // get Customer Number
    public void setNumber(String CNumber)
    {
        this.cNumber = CNumber;
    }
    //get customr number
    
    public String getNumber()
    {
        return cNumber;
    }
    
    @Override
    public String getDisplayText()
    {
        // Should be getDisplayText()
        return super.toString() +"Customer Number: " + cNumber+"\n";
    }
}
