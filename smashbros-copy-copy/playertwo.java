import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playertwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playertwo extends Actor{
    /**
     * Act - do whatever the playertwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int livesP2 = 5;
    
    private int doublejump = 1;
    private int ydisplace = 0;
    public static final int maxFallSpeed = 12;
    public void act()
    {
        setLocation(getX(),getY()+ydisplace);
        if (Greenfoot.isKeyDown("left")){
            move(-4);
        }
        if (Greenfoot.isKeyDown("right")){
            move(4);
        }
        if (getOneIntersectingObject(platform.class) == null){
            if (ydisplace < maxFallSpeed){
                ydisplace = ydisplace + 1;
                if (Greenfoot.isKeyDown("up") == false && doublejump == 1){
                    doublejump = 2;
                }
            }
        }
        else {
            if (Greenfoot.isKeyDown("up")){
                ydisplace = -12;
            }
            else {
                ydisplace = 0;
                doublejump = 1;
            }
        }
        if (doublejump == 2 && Greenfoot.isKeyDown("up")){
            ydisplace = -12;
            doublejump = 0;
        }
        if (getY() > 390){
            getWorld().removeObject(this);
        }// Add your action code here.
    }
}
