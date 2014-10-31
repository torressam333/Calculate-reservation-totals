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
public class Movie {
    
    public String title;
    public String category;
    
     Movie(String mTitle, String mCategory)
    {
        this.category=mCategory;
        this.title=mTitle;
        
    }

    Movie() {
    }
    
    public  void SortByCAtegory(String c)
    {
        if (category==c)
        {
            int i =0;
             ArrayList<String> movies = new ArrayList<>();
             movies.add(i, category);
             movies.add(i, title);
             System.out.println(movies);
             i++;
        }
        else
        {
            
        }
       
    }
    private void setTitle(String t)
    {
        this.title=t;
    }
    private String getTitle()
    {
        return title;
    }
    
    private void setCatagory(String c)
    {
        this.category=c;
    }
    
    
    
}
