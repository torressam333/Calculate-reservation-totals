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

//abstract Person class
public abstract class Person 
{
    // person class private attributes
    private String firstName;
    private String lastName;
    private String email;
        
    
    // Person Constractor with no-argument 
    public Person()
    {
        this.firstName="";
        this.lastName="";
        this.email="";
    }

    
    public void setfirstName(String fname)
    {
        this.firstName=fname;
    }
    
    public String getfirstName()
    {
        return firstName;
    }
    
    public void setlastName(String lname)
    {
        this.lastName=lname;
    }
    
    public String getlastName()
    {
        return lastName;
    }
    
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    public String getEmail()
    {
        return email;
        
    }
    
    
    @Override
    public String toString()
    {
        return "Name:"+firstName+" "+lastName+ "\n"+
               "E-Mail:"+email+ "\n";
    }
    
      //abstract method    
    abstract String getDisplayText();
    
}
