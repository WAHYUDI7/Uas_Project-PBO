import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Players
{
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player1()
    {
        GreenfootImage info = getImage();
        int tinggi = (int)info.getHeight()*1/6;
        int lebar = (int)info.getWidth()*1/6;
        
        info.scale(lebar,tinggi); 
    }
    public void act() 
    {
        checkKeyPress ("left", "right", "s", "w");
        lookingForCherry();
        lookingForBananas();
        lookingForBomb();
        lookingForApel();
        getScore();
       // Add your action code here.
    }    
}
