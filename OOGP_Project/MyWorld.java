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
        addObject(player,100,288);
        platform platform = new platform(600, 100);
        addObject(platform,291,392);
        platform.setLocation(300,400);
        player.setLocation(55,311);

        platform platform2 = new platform(100, 25);
        addObject(platform2,550,300);

        rock rock = new rock(110, 10);
        addObject(rock,329,240);
        rock.setLocation(550,310);
    }
    
    public void act()
    {
        counter++;
        enemy_1 ant = new enemy_1();
        if(counter == 100)
        {
            int num = Greenfoot.getRandomNumber(100);
            if(num % 2 == 0)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 275);
                counter = 0;
            }
            else
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 320);
                counter = 0;
            }
        }
    }
}
