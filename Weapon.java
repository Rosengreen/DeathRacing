import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Weapon extends Actor
{
    private final int READY_TO_ACTIVATE = 5;
    private boolean activated;
    private int timer;
        
    public Weapon()
    {
        activated = false;
        timer = 0;
    }
    
    /**
     * Act - do whatever the Weapon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        controlTimer();
    }
    
    /**
     * Sets the activated boolean.
     */
    public void setActivate(boolean activate)
    {
        this.activated = activate;
    }
    
    /**
     * Returns the activated boolean.
     */
    public boolean getActivated()
    {
        return activated;
    }
    
    /**
     * If the weapon is not activated, then the timer counts up until the weapon is ready to be activated and activates it.
     */
    private void controlTimer()
    {
        if(!activated)
        {
            timer++;
        }
        if(timer == READY_TO_ACTIVATE)
        {
            activated = true;
        }
    }
}
