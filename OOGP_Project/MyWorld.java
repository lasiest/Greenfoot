import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter = 0;
    int score = 0;
    
    SimpleTimer tim = new SimpleTimer();
    Counter timeCount = new Counter();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true);
        
        getBackground().setColor(new Color(135, 206, 235));
        getBackground().fill();
        
        prepare();
        showScore();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        player player = new player();
        addObject(player,300,300);
        platform platform = new platform(600, 100);
        addObject(platform,300,400);

        platform platform2 = new platform(100, 25);
        addObject(platform2,550,280);
        rock rock = new rock(110, 10);
        addObject(rock,550,290);
        
        
        platform platform3 = new platform(100, 25);
        addObject(platform3,50,280);
        
        rock rock2 = new rock(110, 10);
        addObject(rock2,50,290);
        
        addObject(timeCount, 550, 30);
    }
    
    public void act()
    {
        
        timeCount.setValue(tim.millisElapsed() / 1000);
        
        counter++;
        enemy_1 ant = new enemy_1();
        if(counter >= 100 && timeCount.getValue() < 60)
        {
            int num = Greenfoot.getRandomNumber(100);
            num = num % 4;
            if(num == 0)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 260);
                counter = 0;
            }
            else if(num == 1)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 260);
                counter = 0;
            }else if(num == 2)
            {
                 GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 330);
                counter = 0;           
            }else if(num == 3)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 330);
                counter = 0;
            }
        }else if(counter >= 50 && (timeCount.getValue() >= 60 && timeCount.getValue() < 120))
        {
            int num = Greenfoot.getRandomNumber(100);
            num = num % 4;
            if(num == 0)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 260);
                counter = 0;
            }
            else if(num == 1)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 260);
                counter = 0;
            }else if(num == 2)
            {
                 GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 330);
                counter = 0;           
            }else if(num == 3)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 330);
                counter = 0;
            }
        }else if(counter >= 30 && timeCount.getValue() >= 120)
        {
            int num = Greenfoot.getRandomNumber(100);
            num = num % 4;
            if(num == 0)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 260);
                counter = 0;
            }
            else if(num == 1)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 260);
                counter = 0;
            }else if(num == 2)
            {
                 GreenfootImage ant_image = ant.getImage();
                addObject(ant, 600, 330);
                counter = 0;           
            }else if(num == 3)
            {
                GreenfootImage ant_image = ant.getImage();
                addObject(ant, 0, 330);
                counter = 0;
            }
        }
    }
    
    public void showScore()
    {
        showText("Score: "+score, 60, 25);
    }
    
    public void addScore(int points)
    {
        score = score + points;
        showScore();
    }
}
