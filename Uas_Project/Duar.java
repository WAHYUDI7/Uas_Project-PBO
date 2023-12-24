import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Duar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duar extends Actor
{
    /**
     * Act - do whatever the Duar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final int DELAY = 5;
    public int explodeCounter = 0;
    ArrayList<GreenfootImage> listImage = new ArrayList<GreenfootImage>();
    int currentIndex = 0;
    public Duar() 
    {
        listImage.add(new GreenfootImage("tile001.png"));
        listImage.add(new GreenfootImage("tile003.png"));
        listImage.add(new GreenfootImage("tile005.png"));
        listImage.add(new GreenfootImage("tile007.png"));
        listImage.add(new GreenfootImage("tile009.png"));
        listImage.add(new GreenfootImage("tile011.png"));
        listImage.add(new GreenfootImage("tile013.png"));
        listImage.add(new GreenfootImage("tile015.png"));
        listImage.add(new GreenfootImage("tile017.png"));
        listImage.add(new GreenfootImage("tile019.png"));
        listImage.add(new GreenfootImage("tile021.png"));
        listImage.add(new GreenfootImage("tile023.png"));
        listImage.add(new GreenfootImage("tile024.png"));// Add your action code here.
    }    
    
    public void act() 
    {
        if(explodeCounter >= DELAY){
            setImage(listImage.get(currentIndex));
            currentIndex++;
            explodeCounter = 0;
        }
        explodeCounter++;
        
        if(currentIndex >= listImage.size()){
            World world = getWorld();
            world.removeObject(this);
        }
        // Add your action code here.
    }    
}
