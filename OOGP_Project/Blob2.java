import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob2 extends player
{
    /**
     * Act - do whatever the Blob2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
        else if(isTouching(enemy_1.class))
        {
            removeTouching(enemy_1.class);
            getWorld().removeObject(this);
        }
    }
}
