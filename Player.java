import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends SmoothMover
{

    /**
     * Create a player and initialize its image.
     */
    public Player(String keyUp, String keyDown, String keyLeft, String keyRight, String image)
    {
        super(keyUp,keyDown,keyLeft,keyRight);
        setImage(image);
        
    }
  
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        smoothMove();
        checkKeypress();
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
}
