import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class forminfo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class forminfo extends World
{

    /**
     * Constructor for objects of class forminfo.
     * 
     */
    public forminfo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage image = getBackground();
        
        image.scale(image.getWidth()-1200, image.getHeight()-800);
        setBackground(image);
        
        prepare();
    }
    private void prepare()
    {
        back Back = new back();
        addObject(Back,40,40);
    }
}
