import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob2 extends player
{
    public Blob2()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 15, image.getHeight() - 15);
        setImage(image);
    }
    public void act()
    {
        move(-10);
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
}
