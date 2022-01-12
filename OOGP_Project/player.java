import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class player extends Actor
{
    double dy = 1;
    double gravity = 1;
    
    public void act()
    {
        
        setLocation(getX(), (int)(getY()+dy));
        
        if(isTouching(platform.class)){
            dy = 0;
        }else{
            dy += gravity;
        }
        
        if(Greenfoot.isKeyDown("up") && isTouching(platform.class)){
            dy = -10;
        }
        
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }else if(Greenfoot.isKeyDown("right")){
            move(3);
        }
        
    }
}
