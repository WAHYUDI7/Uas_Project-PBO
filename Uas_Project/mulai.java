import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mulai extends World
{
    private int timer;
    
    Player1 player1 = new Player1();

    /**
     * Constructor for objects of class mulai.
     * 
     */
    public mulai()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage go = getBackground();
        
        go.scale(go.getWidth()+440, go.getHeight()+240);
        setBackground(go);
        
        prepare();
        Greenfoot.playSound("mulai.mp3");
        timer = 0;
        showScore();
    }
    public void act()
    {
        countTime();
        randomSpawn();
        showScore();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        
        
        addObject(player1,102,320);
       
    }
    
    /**
     * Game timer. Increments the timer variable by 1
     * each act method.
     */
    public void countTime()
    {
        timer = timer + 1;
        showTime();
        if(timer == 2000)
        {
            showText("Time's Up!", 300 ,150);
            player1.getScore();          
            {
            
            showText("Score: " + player1.getScore(),550,50);
            Greenfoot.setWorld(new GameOver());
            }
            
            {
            
            showText("Score: " + player1.getScore(),550,50);
            Greenfoot.setWorld(new GameOver1());   
            }
        }
        
    }
    
    /**
     * Show the remaining game time one screen
     */
    public void showTime()
    {
        showText("Time: " + timer, 500, 25);
    }
    
    /**
     * Random spawn
     */
    public void randomSpawn()
    {
        if (Greenfoot.getRandomNumber(500) < 7)
        {
            Cherry cherry = new Cherry();
            addObject(cherry, Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1));
            
            Bananas bananas = new Bananas();
            addObject(bananas,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1)); 
            
            Apel apel = new Apel();
            addObject(apel,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1)); 
            
            
        }
        if(Greenfoot.getRandomNumber(500)< 3)
        {
            Bomb bomb = new Bomb();
            addObject(bomb,Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(1)); 
        
        }
    }
    
    /**
     * Show score
     */
    public void showScore()
    {
        
        showText("Score: " + player1.getScore(),50,50);
    }
}
