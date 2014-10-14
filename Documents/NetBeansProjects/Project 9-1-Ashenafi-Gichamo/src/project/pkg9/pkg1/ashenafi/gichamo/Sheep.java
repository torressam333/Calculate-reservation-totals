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
public class Sheep implements Countable ,Cloneable {
    
    private int countSheep=0;
    private String sheepName="";
    
    public void setSheepName()
    {
        this.sheepName =sheepName;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void resetCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCountString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
