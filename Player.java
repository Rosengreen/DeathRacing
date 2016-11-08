import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends SmoothMover
{

    private final int BOUNCE_TIMER = 2;
    private GreenfootImage image1;
    private boolean canBounce;
    private int timer;
   

    /**
     * Create a player and initialize its image.
     */
    public Player(String keyUp, String keyDown, String keyLeft, String keyRight, String image)
    {
        super(keyUp,keyDown,keyLeft,keyRight);
        setImage(image);
        canBounce = true;
    }
  
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        smoothMove();
        checkKeypress();
        collisionWall();
        timerOn();
    }
    
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        
        if (Greenfoot.isKeyDown(keyLeft) && super.speed > 0) 
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown(keyRight)&& super.speed > 0) 
        {
            turn(3);
        }
    }
    
    /**
     * 
     */
    public void collisionWall()
    {
        Wall wall = (Wall) getOneObjectAtOffset(0, 0, Wall.class);
        if(wall != null)
        {
            if(canBounce)
            {
                if(getSpeed() > 0)
                {
                    setSpeed(-1);                    
                }
                else if(getSpeed() < 0)
                {
                    setSpeed(1);
                }
                else
                {
                    setSpeed(-2);
                }
                canBounce = false;
            }            
        }
    }
    
    /**
     * When the player can't bounce, starts a timer, when the timer reaches BOUNCE_TIMER. Set canBounce = true and reset timer.
     */
    private void timerOn()
    {
        if(!canBounce)
        {
            timer++;
        }
        if(timer > BOUNCE_TIMER)
        {
            canBounce = true;
            timer = 0;
        }
    }        
}
