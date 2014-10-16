/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg9.pkg1.ashenafi.gichamo;



/**
 *
 * @author Host
 */
public class CountTestApp extends CountUtil {
    
    public static void main(String args[]) throws CloneNotSupportedException
    {
        // Count alligators
        System.out.println("Counting alligators...");
        Countable a = new Alligator();
       //CountUtil x = CountUtil();
        count(a,3);
        
        //Count sheep
        System.out.println();
        System.out.println("Counting sheep...");
        
        
        Countable s = new Sheep();
        Sheep s1 =  new Sheep();
        s1.resetCount(); // reset count to zero
        s1.setSheepName("Blackie"); // set Sheep Name
        count(s1,2);
      
        System.out.println("");
        
        // clone sheep object
        Sheep s2 = (Sheep) s1.clone();
        s2.resetCount(); // reset count to zero
        s2.setSheepName("Dolly"); // set Sheep Name
        count(s2,3); 
        
        System.out.println("");
        
        s1.resetCount(); //// reset count to zero
        s1.setSheepName("Blackie"); // Set sheep Name
        count(s1,1);
        
        System.out.println();
  
        
        
    }
    
}
