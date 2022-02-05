import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_1 extends Actor
{
    double dy = 1;
    double gravity = 1;
    
    int flag = 0;
    
    public void act()
    {
        
        setLocation(getX(), (int)(getY()+dy));
        
        
        if(isTouching(platform.class)){
            dy = 0;
        }else{
            dy += gravity;
        }
        
            if(flag == 0)
            {
                move(-2);
                if(getX() == 0 || getX() == 599)
                {
                    flag = 1;
                }
            }
            else if(flag == 1)
            {
                turn(180);
                flag = 0;
            }
    }
    
}
