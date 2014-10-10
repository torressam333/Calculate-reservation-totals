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
public class Employee extends Person {
    private String ssn;
    
    public Employee()
    {
     
        this.ssn="";
     
    }
    public void setSSN(String setSSN)
    {
        this.ssn=setSSN;
    }
    public String getSSN()
    {
        return ssn;
    }
    @Override
    public String toString()
    {
           return "Social security number: "+ssn+"\n"; 
    }
    @Override
    public String getDisplayText()
    {
      return super.toString()+"Social security number: "+ssn+"\n";
    }
}
