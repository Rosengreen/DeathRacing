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
    
    public PowerUp(String image)
    {
        theKindOfPowerUp = Greenfoot.getRandomNumber(4) +1;
        imageOfPowerUp = image;
        setImage(image);
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
     * Return the kind of powerUp.
     */
    public int getKindOfPowerUp()
    {
        return theKindOfPowerUp;
    }
    
    public GreenfootImage getImage()
    {
        return null;
    }
}
