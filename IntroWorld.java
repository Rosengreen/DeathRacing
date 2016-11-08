import greenfoot.*;
import java.awt.Color;

/**
 * Intro World for Death Race.
 * 
 * @author Group 3 
 * @version version 1
 */
public class IntroWorld extends World
{
    private static final int WORLD_WIDTH = 1280;
    private static final int WORLD_HEIGHT = 600;
    private int backCounter = 0;
    //GreenfootSound knight = new GreenfootSound("KnightRider.mp3");
    /**
     * Constructor for objects of class IntroWorld.
     */
    public IntroWorld()
    {
        super(WORLD_WIDTH, WORLD_HEIGHT, 1);
        setBackground("StartPage0000.png");
        backCounter = 0;

    }

    /*
    public void playTheme()
    {
    knight.playLoop();
    }
     */

    public void act()
    {
        switchImage();
        String key = Greenfoot.getKey();
        final GamePad pad1 = GamePad.getGamePads()[0];
        
        if (key != null && key.equals("enter"))
        {
            Greenfoot.setWorld(new DeathRaceWorld(true));
        }
        if (pad1.isDown(GamePad.Button.ACTION_RIGHT))
        {
            Greenfoot.setWorld(new DeathRaceWorld(true));
        }
        backCounter++;
        //playTheme();
    }

    /**
     * Alternate the crab's image between image1 and image2.
     */
    public void switchImage()
    {
        if (backCounter <= 5)
        {
            setBackground ("StartPage0000.png");
        }
        else if (backCounter >= 0)
        {
            setBackground ("StartPage0000.png");
        }
        if (backCounter == 10)
        {
            backCounter = 0;
        }
    }

}
