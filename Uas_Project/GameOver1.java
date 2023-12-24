import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver1 extends World
{
    
    Player1 player1 = new Player1();
    /**
     * Constructor for objects of class GameOver1.
     * 
     */
    public GameOver1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         GreenfootImage go = getBackground();
        
        go.scale(go.getWidth()-400, go.getHeight()-600);
        setBackground(go);
        
        Greenfoot.playSound("GameOver.mp3");
        
        prepare();
    }
    
    public void Act()
    {
        showText("Score: " + player1.score,50,50);
    }
    
    private void prepare()
    {
        back Back = new back();
        addObject(Back,40,370);
    }
}
