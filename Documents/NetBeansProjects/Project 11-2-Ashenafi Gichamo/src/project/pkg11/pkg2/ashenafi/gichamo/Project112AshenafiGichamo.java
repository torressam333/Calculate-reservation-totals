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
       
       Validator v= new Validator();
        //String [] [] name = new String [numberofStudent][2];
      //  String  [] fName = new String[numberofStudent];
       // String  [] lname = new String [numberofStudent];
      //  int     [] score = new int[numberofStudent];
        
        int y=0;
        for( int i=1;i<=numberofStudent;i++)
        {
            
            System.out.println("");
            String StudentFirstName = v.fName(sc,"Student "+i+ " First name:");
            
            String studentLastName = v.fName(sc,"Student "+i+ " Last  name: ");
            int studentScore= v.vScore(sc,"Student "+i+ " score : ");
          
            
            // Store student information in the array
            s[y] = new Student(StudentFirstName, studentLastName , studentScore);
            
            // increament the array type 
            y=y+1;
    
            
             
             
        }
        
   
        System.out.println(""); // New line
        
        Arrays.sort(s,0,numberofStudent);
        for(Student i: s)
        
          System.out.println(i.getlName()+", "+i.getfName()+": "+i.getScore());
        
        
      }   
   
    
}
