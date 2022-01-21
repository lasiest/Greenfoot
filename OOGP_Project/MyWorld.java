import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true);
        
        getBackground().setColor(new Color(135, 206, 235));
        getBackground().fill();
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,55,288);
        platform platform = new platform();
        addObject(platform,291,392);
        player.setLocation(62,264);
    }
    
    public void act()
    {
        counter++;
        enemy_1 ant = new enemy_1();
        if(counter == 80)
        {
            GreenfootImage ant_image = ant.getImage();
            addObject(ant, 610, 300);
            counter = 0;
        }
    }
}
