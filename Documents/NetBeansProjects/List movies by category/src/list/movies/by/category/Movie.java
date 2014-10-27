/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.movies.by.category;

/**
 *
 * @author agichamo
 */
public class Movie {
    
    public String title;
    public String category;
    
    public Movie()
    {
        
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
