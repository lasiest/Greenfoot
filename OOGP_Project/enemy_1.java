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
    int life = 2;
    
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
            getImage().mirrorVertically();
            //getImage().mirrorHorizontally();
            turn(180);
            
            flag = 0;
        }
        
        if(isTouching(Blob.class))
        {
            life--;
            removeTouching(Blob.class);
            if(life == 0)
            {
                Greenfoot.playSound("crush.mp3");
                MyWorld num = (MyWorld)getWorld();
                num.addScore(10);
                getWorld().removeObject(this);
            }
        }
        
        else if(isTouching(Blob2.class))
        {
            life--;
            removeTouching(Blob2.class);
            if(life == 0)
            {
                MyWorld num = (MyWorld)getWorld();
                num.addScore(10);
                getWorld().removeObject(this);
            }
        }
    }
    
}
