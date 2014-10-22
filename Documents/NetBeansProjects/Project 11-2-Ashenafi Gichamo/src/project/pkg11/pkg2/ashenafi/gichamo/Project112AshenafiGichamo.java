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
        
       Student s = new Student();
       Validate v= new Validate();
        
        String  [] fName = new String[numberofStudent];
        String  [] lname = new String [numberofStudent];
        int     [] score = new int[numberofStudent];
        
       
        for( int i=0;i<=numberofStudent;i++)
        {
            String fn = v.vName(sc,"Student "+"i"+ "First name:");
            fName[i]=sc.next();
            s.setlName(fName[i]);
            
            System.out.println("Student "+"i"+ "First name: ");
            lname[i]= sc.next();
            s.setfName(lname[i]);
            
            System.out.println("Student "+"i"+ "last name: ");
            lname[i]= sc.next();
            s.setScore(score[i]);
             i++;
        }
        
        
    }
    
}
