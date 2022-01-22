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
    private boolean rightButton;
    private boolean leftButton;

    
    public player()
    {
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
    
    public void act()
    {
        
        setLocation(getX(), (int)(getY()+dy));
        
        if(isTouching(platform.class)){
            dy = 0;
        }else{
            dy += gravity;
        }
       
        if(!rightButton && Greenfoot.isKeyDown("right")){
            rightButton = true;
            fireRight();
        }else if(!leftButton && Greenfoot.isKeyDown("left")){
            leftButton = true;
            fireLeft();
        }
        
        if(rightButton && !Greenfoot.isKeyDown("right")){
            rightButton = false;
        }else if(leftButton && !Greenfoot.isKeyDown("left")){
            leftButton = false;
        }
        
        if(isTouching(rock.class)){
            dy += gravity;
        }
        
        if(Greenfoot.isKeyDown("w") && isTouching(platform.class) && dy == 0){
            dy = -15;
        }
        
        if(Greenfoot.isKeyDown("a")){
            move(-3);
        }else if(Greenfoot.isKeyDown("d")){
            move(3);
        }
        
        if(getOneIntersectingObject(enemy_1.class) != null)
        {
            System.out.println("Game Over");
            Greenfoot.stop();
            Greenfoot.setWorld(new MyWorld());
        }
    }
    
    private void fireRight(){
        Blob blob = new Blob();
        getWorld().addObject(blob, getX(), getY());
    }
    
    private void fireLeft(){
        Blob2 blob2 = new Blob2();
        getWorld().addObject(blob2, getX(), getY());
    }
}
