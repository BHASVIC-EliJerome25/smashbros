import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playerone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playerone extends Actor
{
    private int ydisplace = 0;
    private int doublejump = 1;
    public static final int maxFallSpeed = 12;
    /**
     * Act - do whatever the playerone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int livesP1 = 5;
    
    public void act()
    {
        setLocation(getX(),getY()+ydisplace);
        if (Greenfoot.isKeyDown("a")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("d")){
            move(4);
        }
        if (getOneIntersectingObject(platform.class) == null){
            if (ydisplace < maxFallSpeed){
                ydisplace = ydisplace + 1;
                if (Greenfoot.isKeyDown("w") == false && doublejump == 1){
                    doublejump = 2;
                }
            }
        }
        else {
            if (Greenfoot.isKeyDown("w")){
                ydisplace = -12;
            }
            else {
                ydisplace = 0;
                doublejump = 1;
            }
        }
        if (doublejump == 2 && Greenfoot.isKeyDown("w")){
            ydisplace = -12;
            doublejump = 0;
        }
        if (getY() > 390){
            World world = getWorld();
            this.setLocation(241,56);          
            
        }
    }
        
}
