import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    private boolean immune;
    
    public Weapon()
    {
        immune = true;
    }
    
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    /**
     * Sets the immune boolean.
     */
    public void setImmune(boolean immune)
    {
        this.immune = immune;
    }
    
    /**
     * Returns the immune boolean.
     */
    public boolean getImmune()
    {
        return immune;
    }
}
