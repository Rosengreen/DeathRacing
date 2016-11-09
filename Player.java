import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends SmoothMover
{
    private final int NO_POWER_UP = 0;
    private final int MINE = 1;
    private final int OIL = 2;
    private final int MISSILE = 3;
    private final int AMOUNT_OF_POWER_UPS = 4;
    private final int BOUNCE_TIMER = 2;
    private final String EMPTY_POWER_UP_FIELD = "emptyPowerUp.png";
    private GreenfootImage image1;
    private boolean canBounce;
    private int timer;
    private int currentPowerUp;
    private PowerUp[] powerUpArray;
    private int player;
    private DisplayPowerUp displayField;
    private String keyShoot;

    /**
     * Create a player and initialize its image.
     */
    public Player(String keyUp, String keyDown, String keyLeft, String keyRight, String keyShoot, String image, int player, DisplayPowerUp display)
    {        
        super(keyUp,keyDown,keyLeft,keyRight);
        this.player = player;
        this.keyShoot = keyShoot;
        displayField = display;
        displayField.setImage(EMPTY_POWER_UP_FIELD);
        setImage(image);
        canBounce = true;
        currentPowerUp = NO_POWER_UP;
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
        useWeapon();
        collisionMissile();
    }

    /**
     * Check whether a control key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    private void checkKeypress()
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
     * Makes the player unable to leave the track.
     */
    private void collisionWall()
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
    
    /**
    *Pick up a powerUp when driving over one.
    */
    private void collisionPowerUp()
    {
        PowerUp powerUp = (PowerUp) getOneObjectAtOffset(0, 0, PowerUp.class);
        if(powerUp != null)
        {
            currentPowerUp = powerUp.getKindOfPowerUp() + 1;
            displayField.setImage(powerUp.getVisualOfPowerUp());
            powerUp.setLocation(-50, -50);
            powerUp.setBeenPickedUp(true);
        }
    }
    
    /**
    *Checks if the player has a weapon. If yes, return a reference to a new weapon of the given type.
    */
    private Weapon getWeapon()
    {
        Weapon weapon;
        if(currentPowerUp != NO_POWER_UP)
        {
            if(currentPowerUp == MINE)
            {
                weapon = new Mine();
            }
            else if(currentPowerUp == OIL)
            {
                weapon = new Oil();
            }
            else
            {
                weapon = new Missile(getRotation());
            }
        }
        else
        {
            weapon = null;
        }
        return weapon;
    }
    
    /**
     * If the player has a powerUp, use it when the shoot key is pressed.
     */
    private void useWeapon()
    {
        Weapon weapon = getWeapon();
        if(weapon != null && Greenfoot.isKeyDown(keyShoot))
        {
            getWorld().addObject(weapon, getX(), getY());
            displayField.setImage(EMPTY_POWER_UP_FIELD);
            currentPowerUp = NO_POWER_UP;
        }
    }
    
    private void collisionMissile()
    {
        Missile missile = (Missile) getOneIntersectingObject(Missile.class);
        if(missile != null && missile.getActivated() == true)
        {
            missile.setExplosionStarted(true);
            getWorld().removeObject(this);
        }
    }
    
    
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
}
