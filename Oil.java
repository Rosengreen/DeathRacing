import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oil extends Weapon
{
    private final int OIL_NUMBER = 2;
    
    public Oil()
    {
        setImage("oilActive.png");
    }
    
    /**
     * Act - do whatever the Oil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    /**
     * Return the number of the weapon to indentify it.
     */
    public int getNumberOfWeapon()
    {
        return OIL_NUMBER;
    }
}
