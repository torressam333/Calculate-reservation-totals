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
public class SortListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
       
        System.out.println("Welcome to the Student Scores Application."+"\n");
        Scanner sc = new Scanner(System.in);   // Instantiate Scanner Object
        System.out.print("Enter number of students to enter: ");
       int numberofStudent = sc.nextInt();
       

    
       Student[] s = new Student[numberofStudent]; //An array to store Student Name and Score
       
   
        
        int y=0;
        for( int i=1;i<=numberofStudent;i++)
        {
            
            System.out.println("");// Print newline
            String StudentFirstName = Validator.fName(sc , "Student "+i+ " First name:"); // pass an argument to a fName() method 
            String studentLastName = Validator.fName(sc , "Student "+i+ " Last  name: ");// pass an argument to a fName() method 
            int studentScore= Validator.vScore(sc,"Student "+i+ " score : ");// pass an argument to a vScore() method 
          
            
            // Stores student information in an array
            s[y] = new Student(StudentFirstName, studentLastName , studentScore);
            
           
            y=y+1; // increament the array index
   
        }
        
   
        System.out.println(""); // Print New line 
        
        Arrays.sort(s,0,numberofStudent); // Sort the stored data
        for(Student i: s)
        
          System.out.println(i.getlName()+", "+i.getfName()+": "+i.getScore()); //Print the sorted list
        
        
      }   
   
    
}
