import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player4 extends Actor
{
    private GreenfootImage image1;
    
    /**
     * Create a player and initialize its image.
     */
    public Player4()
    {
        image1 = new GreenfootImage("Player40000.png");
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Player4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeypress();
    }
    
    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {
        if (Greenfoot.isKeyDown("I")) 
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("K")) 
        {
            move(-1);
        }
        if (Greenfoot.isKeyDown("J")) 
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("L")) 
        {
            turn(3);
        }
    }
}
