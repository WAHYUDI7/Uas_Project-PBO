import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class info extends Actor
{
    /**
     * Act - do whatever the info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public info()
    {
         GreenfootImage info = getImage();
        int tinggi = (int)info.getHeight()*1/3;
        int lebar = (int)info.getWidth()*1/3;
        
        info.scale(lebar,tinggi); 
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new forminfo());
        }  
    }    
}
