/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg9.pkg1.ashenafi.gichamo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agichamo
 */
public class Sheep implements Countable ,Cloneable {
    
    private int countSheep=0;
    private String sheepName;
    
    public void setSheepName(String sheep)
    {
        sheepName =sheep;
    }
    public String getsheeNames()
    {
        return sheepName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
  
            return super.clone();
       
    }
    
    @Override
    public void incrementCount() {
        countSheep=countSheep+1;

    }

    @Override
    public void resetCount() 
    {
        countSheep=0;
    }

    @Override
    public int getCount() {
        return countSheep;
    }

    @Override
    public String getCountString() {
        
        return getCount()+" "+getsheeNames();
        
    }
    
}
