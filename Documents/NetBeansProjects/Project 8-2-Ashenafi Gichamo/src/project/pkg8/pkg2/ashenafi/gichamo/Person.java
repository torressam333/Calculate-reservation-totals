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
    // private Variables 
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

    // set first Name
    public void setfirstName(String fname)
    {
        this.firstName=fname;
    }
    // return first Name
    public String getfirstName()
    {
        return firstName;
    }
    
    // set Last name
    public void setlastName(String lname)
    {
        this.lastName=lname;
    }
    
    //return Last Name
    public String getlastName()
    {
        return lastName;
    }
    // set Email
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    // return email
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
    abstract String getDisplayText(); // Abstract Method   
    
}
