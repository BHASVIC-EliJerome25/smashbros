import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard1 extends Actor
{
    protected GreenfootImage background = null;
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    
    }
    public Scoreboard1()
    {
        background = new GreenfootImage(100,100);
        background.setColor(Color.WHITE);
        background.fillRect(0,0,100,40);
        setImage(background);
    }
    
    
    public void setValues(int lives)
    {
        GreenfootImage img = new GreenfootImage(background);
        img.setColor(Color.BLACK);
        img.drawString("P1 Lives: "+ lives, 10, 20);
        
        setImage(img);
    }
}
