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
        
        
        
       Scanner sc = new Scanner(System.in);  // Scanner object instantiation
       
       
       
       System.out.println("Welcome to the Movie List Application."+"\n");
       
       System.out.println("There are 100 movies in the list."+"\n");
       
       String choice ="y";
       Movie m = new Movie();
       MovieIO mIO = new MovieIO();
       
       
       while (choice.equalsIgnoreCase("y")) // check if the user enter Y or y
       {
           // Array list object Instantiation 
           ArrayList<String> movies = new ArrayList<>();
      
          // *****Standardized Manu *******//
           
          String mainMenu = ("***Select a choice from the menu:*** \n\n" 
            + "Enter 1 for Animated\n" 
            + "Enter 2 for Drama\n"
            + "Enter 3 for Horror\n" 
            + "Enter 4 for scifi\n"
            + "Enter 5 for Comedy\n"
            + "Enter 6 for musical\n"
                  
           );

            System.out.println(mainMenu);
            int menuChoice = sc.nextInt();

            while (menuChoice < 1 || menuChoice > 6) {
                System.out.print("\nError! Incorrect choice.\n");
                System.out.println(mainMenu);
                menuChoice = sc.nextInt();
                System.out.println("");
                
            }
            
            
           //** Store the Movie list in the Array List **//   
          int index=0;    
          for(int i=1;i<=100;i++)
           {
            
            Movie x=mIO.getMovie(i);
            movies.add(index, m.getTitle()+"  "+m.getcategory());
            index=index+1;
           
           }
      
            // List movie by Title (animated)
            if(menuChoice==1)
            {
                
                int x=1;
                String userChoice1 = "animated";
                String movieCategory=""; 
                for (String s : movies)
                    {
                       movieCategory= getMovie(x).getcategory();
                    if (movieCategory==userChoice1)
                    {
                        
                     // get movie by title
                     System.out.println(getMovie(x).getTitle());
                     x++;
                     
                        
                    }
                    else{
                        x++;
                        
                        
                    }
                    }
                  System.out.println("");

           
                
            }
            // List movie by Title (drama)
            else if(menuChoice==2)
            {
                int x=1;
                String userChoice1 = "drama";
                String movieCategory=""; 
               for (String s : movies)
                    {
                       movieCategory= getMovie(x).getcategory();
                    if (movieCategory==userChoice1)
                    {
                     // get movie by title   
                     System.out.println(getMovie(x).getTitle());

                     x++;
                     
                    }
                    else{
                        x++;
                        
                        
                    }
                    }
               
               
                 System.out.println("");

                
            }
            
            // List movie by Title (horror)

            else if(menuChoice==3)
            {
                 
                int x=1;
                String userChoice1 = "horror";
                String movieCategory=""; 
                for (String s : movies)
                    {
                       movieCategory= getMovie(x).getcategory();
                    if (movieCategory==userChoice1)
                    {
                        
                     System.out.println(getMovie(x).getTitle());

                     x++;
                     
                    }
                    else{
                        x++;                       
                    }
                    }
                System.out.println("");

                
            }
            
            // List movie by Title (horror)

            else if(menuChoice==4)
            {
                     
                 int x=1;
                String userChoice1 = "scifi";
                String movieCategory=""; 
                for (String s : movies)
                    {
                     movieCategory= getMovie(x).getcategory();
                    if (movieCategory==userChoice1)
                    {
                        
                     System.out.println(getMovie(x).getTitle());

                     x++;                
                    }
                    else{
                        x++;
                        
                        
                    }
                    }
                System.out.println("");

                
            }
            
            else if(menuChoice==5)
            {
                     
                int x=1;
                String userChoice1 = "comedy";
                String movieCategory=""; 
                for (String s : movies)
                    {
                     movieCategory= getMovie(x).getcategory();
                    if (movieCategory==userChoice1)
                    {
                        
                     System.out.println(getMovie(x).getTitle());
              

                     x++;                
                    }
                    else{
                        x++;
                        
                        
                    }
                    }
                       System.out.println("");
                
            }
       
            
            else if(menuChoice==6)
            {
                     
                int x=1;
                String userChoice1 = "musical";
                String movieCategory=""; 
                for (String s : movies)
                    {
                     movieCategory= getMovie(x).getcategory();
                    if (movieCategory==userChoice1)
                    {
                        
                     System.out.println(getMovie(x).getTitle());
              

                     x++;                
                    }
                    else{
                        x++;
                        
                        
                    }
                    }
                       System.out.println("");
                
            }
         // check to  see if the user would like to continue
            
                     System.out.print("Continue? (y/n): ");
         choice = sc.next();
         System.out.println("");
       }
            
    }
    
}
