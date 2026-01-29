import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class projectile2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectile2 extends attacks
{
    private int ball = 0;
    /**
     * Act - do whatever the projectile2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        playertwo player = getWorld().getObjects(playertwo.class).get(0);
        
        
        if (player.directions == 1 && ball == 0)
        {
            setRotation(180);
            ball = 1;
        }
        else
        {
            ball = 1;
        }
        
        checkHit();
        if(getX() <= 1 || getX() >= 599)
        {
            getWorld().removeObject(this);
        }
        move(5);    
       
    }
    public void checkHit()
    {
        Actor player = getOneIntersectingObject(playerone.class);
        if (player != null)
        {   
            if (getRotation() == 0)
            {
                player.move(4);
            }
            else
            {
                player.move(-4);
            }
        }
    }
}
