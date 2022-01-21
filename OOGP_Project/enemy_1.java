import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy_1 extends Actor
{
    /**
     * Act - do whatever the enemy_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int flag = 0;
        if(flag == 0)
        {
            move(-2);
            if(getX() == 0)
            {
                flag = 1;
            }
        }
        if(flag == 1)
        {
            turn(180);
            move(2);
            flag = 0;
        }
    }
}
