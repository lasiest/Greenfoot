import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndScene here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScene extends World
{

    /**
     * Constructor for objects of class EndScene.
     * 
     */
    
    int finalScore = MyWorld.score + (MyWorld.timeCount.getValue() * 10);
    
    public EndScene()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        getBackground().setColor(new Color(135, 206, 235));
        getBackground().fill();
        
        showText("your defeating enemy score is: "+MyWorld.score+" points", 300, 50);
        showText("your survival time score is : "+MyWorld.timeCount.getValue()+" seconds * 10", 300, 70);
        showText("your final score is: "+finalScore+" points", 300, 90);
        
        start_button start = new start_button();
        addObject(start, 200, 300);
        
        showText("RESTART", 200, 300);
        
        quit_button quit = new quit_button();
        addObject(quit, 400, 300);
        
        showText("QUIT", 400, 300);
        
        MyWorld.score = 0;
    }
}
