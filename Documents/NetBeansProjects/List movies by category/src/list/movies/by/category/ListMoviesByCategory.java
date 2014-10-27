/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.movies.by.category;

import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class ListMoviesByCategory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in); 
       System.out.println("Welcome to the Movie List Application."+"\n");
       
       System.out.println("There are 100 movies in the list."+"\n");
       
       String choice ="y";
       
       while (choice.equalsIgnoreCase("y"))
       {
           System.out.println("01: Animated ");
           System.out.println("02: Drama ");
           System.out.println("03: Horror ");
           System.out.println("04: Scifi "+"\n");
           System.out.print("What category are you interested in? ");
           int MovieC = sc.nextInt();
           
           
           
           
           
           
           
           
           
           System.out.print("Continue? (y/n): ");
           choice = sc.next();
       }
    }
    
}
