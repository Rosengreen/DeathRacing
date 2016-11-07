import greenfoot.*;
import java.awt.Color;

/**
 * The Death Race is starting, fasten your seatbelts.
 * 
 * @author Group 3 
 * @version 1
 */
public class DeathRaceWorld extends World
{
    private static final int WORLD_WIDTH =1280;
    private static final int WORLD_HEIGHT = 600;
    private int gameBackCounter;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;

    public DeathRaceWorld()
    { 
        // calling the other constructor with gameStarted = false.
        this(false);    
        //setPaintOrder(Paddle.class, Ball.class, SecondaryPaddle.class);
        Greenfoot.setSpeed(50);
        gameBackCounter = 0;
        image1 = new GreenfootImage("Back10000.png");
        image2 = new GreenfootImage("Back10000.png");
        image3 = new GreenfootImage("Back10000.png");
        image4 = new GreenfootImage("Back10000.png");
    }
    
    /**
     * Constructor for objects of class DeathRaceWorld.
     */
    public DeathRaceWorld(boolean gameStarted)
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1, false); 
        if (gameStarted)
        {
          
            GreenfootImage background = getBackground();
            background.setColor(Color.black);
            // Create a new world with WORLD_WIDTHxWORLD_HEIGHT cells with a cell size of 1x1 pixels.
            //addObject(new Ball(), WORLD_WIDTH/2, WORLD_HEIGHT/2);
            addObject(new Player("w","s","a","d"), 873, WORLD_HEIGHT - 43);
         addObject(new Player("up","down","left","right"), 873, WORLD_HEIGHT - 23);
            //addObject(new SecondaryPaddle(100, 20), this.getWidth(), Greenfoot.getRandomNumber(WORLD_HEIGHT/2));
            
        }
        else
        {
            Greenfoot.setWorld(new IntroWorld());
        }
    }
    
    public void act()
    {
        changeImage();
        gameBackCounter++;
    }
    
    /**
     * Change the image on runtime to give the idea of motion.
     */
    public void changeImage()
    {
        // Switching on the gameBackCounter to perform image changes.
        switch (gameBackCounter)
        {
            case 1: setBackground ("Back10000.png");
                    break;                    
            case 20: setBackground ("Back10000.png");
                    break;                   
            case 40: setBackground ("Back10000.png");
                    break;                     
            case 60: setBackground ("Back10000.png");
                    break;                     
            case 80: setBackground ("Back10000.png");
                    break;                                                               
            case 100: setBackground ("Back10000.png");
                    break;
            case 120: gameBackCounter = 0;
                    break;
        }
        
    }

}
