/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg11.pkg2.ashenafi.gichamo;

/**
 *
 * @author agichamo
 */
public class Student implements Comparable {
    
    private String fName="";
    private String lName="";
    private int score=0;
    

    @Override
    public int compareTo(Object t)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        
    }
    
    public void setfName(String fn)
    {
        this.fName=fn;
    }
    
    public String getfName()
    {
      return fName;  
    }
    
    public void setlName(String ln)
    {
        this.lName=ln;
    }
    
    public String getlName()
    {
        return lName;
    }
    
    public void setScore(int s)
    {
        this.score=s;
    }
    
    public int getScore()
    {
        return score;
    }
    
    
}
