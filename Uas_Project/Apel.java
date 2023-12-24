import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apel extends Actor
{
    /**
     * Act - do whatever the Apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+3);
        removeAtEdge();// Add your action code here.
    }    
     public void removeAtEdge()
    {
        if( isAtEdge() )
        {
            getWorld().removeObject(this);
        }
    }
}
