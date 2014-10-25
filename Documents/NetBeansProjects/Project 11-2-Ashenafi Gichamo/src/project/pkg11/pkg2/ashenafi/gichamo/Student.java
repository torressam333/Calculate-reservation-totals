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
    
    // Student Class constructor
    public Student(String fn, String ln, int s)
    
    {
        this.fName=fn;
        this.lName=ln;
        this.score=s;
    }

  
    @Override
    public int compareTo(Object t)
    {
        Student s =(Student) t;
   
        // compares the array  and return the result
        if(lName.equals(s.lName))
        {
            return fName.compareToIgnoreCase(s.fName);
        }
        return lName.compareToIgnoreCase(s.lName);
 
    }
    
  
   // returns first Name  
    public String getfName()
    {
      return fName;  
    }
    

    // Returns Last Name
    public String getlName()
    {
        return lName;
    }

    // Returns Student Score
    public int getScore()
    {
        return score;
    }

}
