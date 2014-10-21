/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg11.pkg2.ashenafi.gichamo;

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
        System.out.println("Welcome to the Student Scores Application.");
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter number of students to enter: ");
        int numberofStudent = sc.nextInt();
        
       // Student s = new Student();
        
        Student [] stud = new Student[numberofStudent];
        int i=0;
        for(Student s : stud )
        {
            System.out.println("Student "+"i"+ "last name: ");
            stud[i]=sc.next();
            s.setlName(stud[1]);
            i++;
            System.out.println("Student "+"i"+ "First name: ");
            stud[i]= sc.next();
            s.setfName(stud[i]);
            
            System.out.println("Student "+"i"+ "last name: ");
            stud[i]= sc.next();
            s.setScore(stud[i]);
             i++;
        }
        
        
    }
    
}
