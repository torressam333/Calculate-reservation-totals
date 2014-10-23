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
public class Student implements Comparable  {
    
    private String fName="";
    private String lName="";
    private int score=0;

    public Student(String fn, String ln, int s)
    
    {
        this.fName=fn;
        this.lName=ln;
        this.score=s;
    }

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public int compareTo(Object t)
    {
        
        Student s =(Student) t;
        
        int result =this.fName.compareTo(s.fName);
        
        
        if (result>10 )
            return -1;
        if (result<0)
            return 1;
        return 0;
    }
    
   
    
    public String getfName()
    {
      return fName;  
    }
    
   
    
    public String getlName()
    {
        return lName;
    }
    
   
    
    public int getScore()
    {
        return score;
    }
    
    public String  toString()
    {
        return getlName()+getfName()+getScore();
    }
    
    
}
