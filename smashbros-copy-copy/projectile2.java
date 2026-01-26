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
        
        
        if(getX() <= 1 || getX() >= 599)
        {
            getWorld().removeObject(this);
        }
        move(2);    
        checkHit();
    }
    public void checkHit()
    {
        playerone player = getWorld().getObjects(playerone.class).get(0);
        Scoreboard1 scoreboard = getWorld().getObjects(Scoreboard1.class).get(0);
        if (getOneIntersectingObject(playerone.class) != null)
        {
            player.livesP1--;
            getWorld().removeObject(this);
            scoreboard.setValues(player.livesP1);
        }
    }
}
