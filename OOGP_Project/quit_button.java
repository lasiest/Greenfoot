import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quit_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class quit_button extends Actor
{
    /**
     * Act - do whatever the quit_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mousePressed(this))
        {
            System.out.println("Quitter");
            Greenfoot.stop();
        }
    }
}
