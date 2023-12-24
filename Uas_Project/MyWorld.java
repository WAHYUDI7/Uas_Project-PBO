import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage image = getBackground();
        
        image.scale(image.getWidth()-1200, image.getHeight()-800);
        setBackground(image);
        
        Greenfoot.playSound("awal.mp3");
        prepare();
    }
    
    private void prepare()
    {
        start Start = new start();
        addObject(Start,230,250);
        info Info = new info();
        addObject(Info,367,250);
    }
}
