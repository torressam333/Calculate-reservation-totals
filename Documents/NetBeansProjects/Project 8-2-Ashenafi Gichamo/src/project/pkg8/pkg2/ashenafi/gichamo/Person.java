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
public class Person 
{
    private String name;
    private String email;
    
    
    // Person Constractor with no-argument 
    public Person()
    {
    
    }
    
    public void setName(String name)
    {
        this.name= name;
    }
    
    public String getName()
    {
        return name;
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
        return "Name:   "+name+ "\n" +
                "E-Mail:"+email+ "\n" + "\n";
    }
    
    //returns a string
    public String getDisplayText()
    {
        
    }
}
