/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg9.pkg1.ashenafi.gichamo;

/**
 *
 * @author agichamo
 */
public class Alligator implements Countable  {
    
    private int count;

    @Override
    public void incrementCount() {
     
        count=count+1;
        
    }

    @Override
    public void resetCount() {
        
        count =0;
    }

    @Override
    public int getCount() {
      return count;
        }

    @Override
    public String getCountString() {
        return count+"Alligator";
    }
    
    /*public  String formattedCount()
    {
        
       
        
    }*/
    
}
