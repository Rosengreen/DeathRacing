import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallRotated here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallRotated extends Wall
{
    public WallRotated()
    {
        this.getImage().scale(100, 20);
        this.getImage().rotate(45);
    }
    
    /**
     * Act - do whatever the WallRotated wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
