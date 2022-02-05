import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        getBackground().setColor(new Color(135, 206, 235));
        getBackground().fill();
        
        showText("Little Insect World", 300, 50);
        
        start_button start = new start_button();
        addObject(start, 300, 150);
        
        showText("START", 300, 150);
        
        quit_button quit = new quit_button();
        addObject(quit, 300, 300);
        
        showText("QUIT", 300, 300);
    }
}
