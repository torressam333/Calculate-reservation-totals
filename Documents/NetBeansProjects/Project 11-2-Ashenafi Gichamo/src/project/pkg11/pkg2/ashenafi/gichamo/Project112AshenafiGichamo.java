/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg11.pkg2.ashenafi.gichamo;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class Project112AshenafiGichamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
        // TODO code application logic here
        System.out.println("Welcome to the Student Scores Application."+"\n");
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter number of students to enter: ");
      
        int numberofStudent = sc.nextInt();
       //Student sud = new Student();
       Student[] s = new Student[numberofStudent];
       
       Validate v= new Validate();
        //String [] [] name = new String [numberofStudent][2];
      //  String  [] fName = new String[numberofStudent];
       // String  [] lname = new String [numberofStudent];
      //  int     [] score = new int[numberofStudent];
        
       
        for( int i=1;i<=numberofStudent;i++)
        {
            int y=0;
            System.out.println("");
            String StudentFirstName = v.vName(sc,"Student "+i+ " First name:");
           
            String studentLastName =v.vName(sc,"Student "+i+ " Last  name: ");
      
            int studentScore= v.vScore(sc,"Student "+i+ " score : ");
          
            
            
            s[y] = new Student(StudentFirstName, studentLastName , studentScore);
            
             y++;
             System.out.println(y);
            
             
             
        }
   
        //System.out.println(s[]);
        
        Arrays.sort(s);
        for(Student i: s)
        
        //    System.out.println(i.getlName()+","+i.getfName()+":"+i.getScore());
        
        
        
    }
    
}
