import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Powerup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    private int theKindOfPowerUp;
    private String imageOfPowerUp;
    private String[] visualsOfPowerUps = {"minePowerUp.png", "oilPowerUp.png", "missilePowerUp.png"};
    
    public PowerUp()
    {
        theKindOfPowerUp = Greenfoot.getRandomNumber(visualsOfPowerUps.length);
    }
    
    /**
     * Act - do whatever the Powerup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    
    /**
     * Return the kind of PowerUp.
     */
    public int getKindOfPowerUp()
    {
        return theKindOfPowerUp;
    }
    
    /**
     * Gets the name of the png for the PowerUp.
     */
    public String getVisualOfPowerUp()
    {
        String nameOfVisual = visualsOfPowerUps[theKindOfPowerUp];
        return nameOfVisual;
    }
}
