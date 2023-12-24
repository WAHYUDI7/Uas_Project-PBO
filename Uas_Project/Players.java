import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Players here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Players extends Actor implements iniinterface
{
    /**
     * Act - do whatever the Players wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int DELAY = 10;
    private boolean markForDeletion = false;
    
    public void act() 
    {
        // Add your action code here.
        lookingForCherry();
        lookingForBomb();
        lookingForBananas();
        lookingForApel();
    }  
    
    /**
     * Check whether a contral key on the keyboard has been pressed.
     * If it has, react accordingly.
     */
    public void checkKeyPress (String left, String right, String down, String up)
    {
     
        if(Greenfoot.isKeyDown(left))
        {
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown(right))
        {
            setLocation(getX()+3, getY());
        }
        if(Greenfoot.isKeyDown(down))
        {
            setLocation(getX(), getY()+3);
        }
        if(Greenfoot.isKeyDown(up))
        {
            setLocation(getX(), getY()-3);
        }
   
    }

    public int score=0;
    
    /**
     * Return score.
     */
    public int getScore()
    {
        return score;
    }
    
    public void lookingForCherry()
    {
        if( isTouching(Cherry.class) )
        {
            removeTouching(Cherry.class);
            score = score +25;
            
        }
    }
    
    public void lookingForBomb()
    {
        if( isTouching(Bomb.class) )
        {
            removeTouching(Bomb.class);
            score = score -25;
            Greenfoot.playSound("Explosion.wav");
            meledak();
        }
    }
    
    public void lookingForBananas()
    {
        if( isTouching(Bananas.class) )
        {
            removeTouching(Bananas.class);
            score = score +50;
        }
    }
    
    public void lookingForApel()
    {
        if( isTouching(Apel.class) )
        {
            removeTouching(Apel.class);
            score = score +30;
        }
    }
    
    public void meledak(){
        World world = getWorld();
        world.addObject(new Duar(), getX(), getY());
    }
    
}
