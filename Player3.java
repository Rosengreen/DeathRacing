import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player3 extends Actor
{
    private GreenfootImage image1;
    
    /**
     * Create a player and initialize its image.
     */
    public Player3()
    {
        image1 = new GreenfootImage("Player30000.png");
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Player3 wants to do. This method is called whenever
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
        if (Greenfoot.isKeyDown("T")) 
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("G")) 
        {
            move(-1);
        }
        if (Greenfoot.isKeyDown("F")) 
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("H")) 
        {
            turn(3);
        }
    }
}
