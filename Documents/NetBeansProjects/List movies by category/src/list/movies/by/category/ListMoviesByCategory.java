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
           //** Store the Movie list in the Array List **//
               ArrayList<String> movies = new ArrayList<>();
      
          
          String mainMenu = ("Select a choice from the menu: \n" 
            + "1. Animated\n" 
            + "2. Drama\n"
            + "3. Horror\n" 
            + "4. scifi\n"
           );

            System.out.println(mainMenu);

            int menuChoice = sc.nextInt();

            while (menuChoice < 1 || menuChoice > 6) {
                System.out.print("\nError! Incorrect choice.\n");
                System.out.println(mainMenu);
                menuChoice = sc.nextInt();
            }
            
            
            
                int index=0;     
          for(int i=1;i<=100;i++)
           {
            
            Movie x=mIO.getMovie(i);
            //System.out.print(x.getcategory());
            movies.add(index, m.getTitle()+"  "+m.getcategory());
            //System.out.println(movies.get(index));
            index=index+1;
           // System.out.println(index);
           }
      
            
            if(menuChoice==1)
            {
                int indexm=0;
                 int x=1;
                String userChoice1 = "animated";
                     String test=""; 
                    boolean y= !userChoice1.equals(mIO.getMovie(x).getcategory());
                    for (String s : movies)
                    {
                       test= getMovie(x).getcategory();
                    if (test==userChoice1)
                    {
                        
                     System.out.println(movies.get(indexm));
                     x++;
                     indexm++;
                          //System.out.println(movies.get(x));  
                    }
                    else{
                        x++;
                        indexm++;
                        
                    }
                    }
           
                
            }
            else if(menuChoice==2)
            {
                     int indexm=0;
                 int x=1;
                String userChoice1 = "drama";
                     String test=""; 
                    boolean y= !userChoice1.equals(mIO.getMovie(x).getcategory());
                    for (String s : movies)
                    {
                       test= getMovie(x).getcategory();
                    if (test==userChoice1)
                    {
                        
                     System.out.println(movies.get(indexm));
                     x++;
                     indexm++;
                          //System.out.println(movies.get(x));  
                    }
                    else{
                        x++;
                        indexm++;
                        
                    }
                    }
                
            }
            
            else if(menuChoice==3)
            {
                 int indexm=0;
                 int x=1;
                String userChoice1 = "horror";
                     String test=""; 
                    boolean y= !userChoice1.equals(mIO.getMovie(x).getcategory());
                    for (String s : movies)
                    {
                       test= getMovie(x).getcategory();
                    if (test==userChoice1)
                    {
                        
                     System.out.println(movies.get(indexm));
                     x++;
                     indexm++;
                          //System.out.println(movies.get(x));  
                    }
                    else{
                        x++;
                        indexm++;
                        
                    }
                    }
                
            }
            
                 else if(menuChoice==4)
            {
                     int indexm=0;
                 int x=1;
                String userChoice1 = "scifi";
                     String test=""; 
                    boolean y= !userChoice1.equals(mIO.getMovie(x).getcategory());
                    for (String s : movies)
                    {
                       test= getMovie(x).getcategory();
                    if (test==userChoice1)
                    {
                        
                     System.out.println(movies.get(indexm));
                     x++;
                     indexm++;
                          //System.out.println(movies.get(x));  
                    }
                    else{
                        x++;
                        indexm++;
                        
                    }
                    }
                
            }
            

            
          /*for(int z=1;z<=100;z++)
           {
          if( MovieC.equals(getMovie(z).getcategory()));
          {
              System.out.print(m.SortByCAtegory());
          }
          
          
          
          
           }*/
         
           
           
          
       }
             System.out.print("Continue? (y/n): ");
           choice = sc.next();
    }
    
}
