import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    private GreenfootImage image1;
    
    /**
     * Create a player and initialize its image.
     */
    public Player1()
    {
        image1 = new GreenfootImage("Player10000.png");
        setImage(image1);
    }
    
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
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
        if (Greenfoot.isKeyDown("up")) 
        {
            move(2);
        }
        if (Greenfoot.isKeyDown("down")) 
        {
            move(-1);
        }
        if (Greenfoot.isKeyDown("left") && Greenfoot.isKeyDown("up")) 
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right") && Greenfoot.isKeyDown("up")) 
        {
            turn(3);
        }
    }
}
