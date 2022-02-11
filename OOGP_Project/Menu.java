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
        
        //getBackground().setColor(new Color(135, 206, 235));
        //getBackground().fill();
        
        start_button start = new start_button();
        addObject(start, 435, 175);
        
        showText("START", 435, 175);
        
        quit_button quit = new quit_button();
        addObject(quit, 435, 275);
        
        showText("QUIT", 435, 275);
    }
}
