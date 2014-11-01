/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.movies.by.category;

import java.util.ArrayList;

/**
 *
 * @author agichamo
 */
public class Movie extends MovieIO   {
    
    
    public static String title;
    public static String category;
    
     Movie(String mTitle, String mCategory)
    {
        this.category=mCategory;
        this.title=mTitle;
        
    }

    Movie() {
    }
    
    
    
    
    
    public  String  storeInArray()
    {       
         return title+" "+category;  
    }
    
    public String getcategory()
    {
         return category;
    }
    
 
    public String getTitle()
    {
        return title;
    }
    
    //public String storeArrayList()
   // {
          
   // }


    /*@Override
    public int compareTo(Object t)
    {
      
    }*/
    
    
    
}
