import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blob here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blob extends player
{
    
    public Blob()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 28, image.getHeight() - 32);
        setImage(image);
    }
    
    public void act()
    {
        move(10);
        if(isAtEdge() == true)
        {
            getWorld().removeObject(this);
        }
    }
}
