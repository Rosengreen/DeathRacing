import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends SmoothMover
{
    private final int AMOUNT_OF_POWER_UPS = 4;
    private final int BOUNCE_TIMER = 2;
    private GreenfootImage image1;
    private boolean canBounce;
    private int timer;
<<<<<<< HEAD
    private int currentPowerUp;
    private PowerUp[] powerUpArray;
    private int player;
   
=======
>>>>>>> origin/GamePad

    /**
     * Create a player and initialize its image.
     */
    public Player(String keyUp, String keyDown, String keyLeft, String keyRight, String image, int player)
    {        
        super(keyUp,keyDown,keyLeft,keyRight);
        this.player = player;
        setImage(image);
        canBounce = true;
        currentPowerUp = 0;
        powerUpArray = new PowerUp[AMOUNT_OF_POWER_UPS];
    }

    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        smoothMove();
        checkKeypress();
        collisionWall();
        timerOn();
        collisionPowerUp();
    }

    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeypress()
    {

        if (Greenfoot.isKeyDown(keyLeft) && super.speed > 0) 
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown(keyRight)&& super.speed > 0) 
        {
            turn(3);
        }
    }

    /**
     * 
     */
    public void collisionWall()
    {
        Wall wall = (Wall) getOneObjectAtOffset(0, 0, Wall.class);
        if(wall != null)
        {
            if(canBounce)
            {
                if(getSpeed() > 0)
                {
                    setSpeed(-1);                    
                }
                else if(getSpeed() < 0)
                {
                    setSpeed(1);
                }
                else
                {
                    setSpeed(-2);
                }
                canBounce = false;
            }            
        }
    }

    /**
     * When the player can't bounce, starts a timer, when the timer reaches BOUNCE_TIMER. Set canBounce = true and reset timer.
     */
    private void timerOn()
    {
        if(!canBounce)
        {
            timer++;
        }
        if(timer > BOUNCE_TIMER)
        {
            canBounce = true;
            timer = 0;
        }
    }        
<<<<<<< HEAD
    
    private void collisionPowerUp()
    {
        PowerUp powerUp = (PowerUp) getOneObjectAtOffset(0, 0, PowerUp.class);
        if(powerUp != null)
        {
            currentPowerUp = powerUp.getKindOfPowerUp();
            getWorld().removeObject(powerUp);
        }
    }
    
    public void setWeapon(int weapon)
    {
        for(int i = 0; i < powerUpArray.length; i++)
        {
            if(weapon == 1)
            {
                
            }
        }
        
    }
    
=======
    /*
    private String gamepad()
    {
    final GamePad pad1 = GamePad.getGamePads()[0];
    if (pad1.isDown(GamePad.Button.R2))
    {return "triggerR2";}
    if (pad1.isDown(GamePad.Button.L2))
    {return "triggerL2";}
    final GamePad pad2 = GamePad.getGamePads()[1];
    final GamePad pad3 = GamePad.getGamePads()[2];
    final GamePad pad4 = GamePad.getGamePads()[3];
    return null;
    }*/
>>>>>>> origin/GamePad
}
