/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.movies.by.category;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author agichamo
 */
public class ListMoviesByCategory extends Movie{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in); 
       System.out.println("Welcome to the Movie List Application."+"\n");
       
       System.out.println("There are 100 movies in the list."+"\n");
       
       String choice ="y";
       Movie m = new Movie();
       MovieIO mIO = new MovieIO();
       while (choice.equalsIgnoreCase("y"))
       {
           System.out.println("01: Animated: ");
  
           System.out.println("02: Drama ");

           System.out.println("03: Horror ");
    
           System.out.println("04: Scifi "+"\n");
           
           System.out.print("What category are you interested in? ");
           String MovieC = sc.next();
           
           
           
         
           
           
          
           
           for(int i=1;i<=100;i++)
           {
              Movie x= mIO.getMovie(i);
                m.SortByCAtegory(MovieC);
             
           }
           
           
           
           System.out.print("Continue? (y/n): ");
           choice = sc.next();
       }
    }
    
}
