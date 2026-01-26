import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playertwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playertwo extends Actor{

    protected int livesP2 = 5;
    
    private int doublejump = 1;
    private int ydisplace = 0;
    public int directions = 0;
    private int clock = 50;
    public static final int maxFallSpeed = 12;
    public void act()
    {
        setLocation(getX(),getY()+ydisplace);
        if (Greenfoot.isKeyDown("left")){
            move(-4);
            directions = 1;
        }
        if (Greenfoot.isKeyDown("right")){
            move(4);
            directions = 2;
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
        if (Greenfoot.isKeyDown("#") && clock >= 50)
        {
            World world = getWorld();
            
            world.addObject(new projectile2(), getX(), getY());
            
            clock = 0;
            
        }
        if (getY() > 390){
            Scoreboard2 scoreboard = getWorld().getObjects(Scoreboard2.class).get(0);
            this.setLocation(369,56);
            livesP2--;
            scoreboard.setValues(livesP2);
            
        }// Add your action code here.
        if(livesP2 <= 0)
        {
            getWorld().removeObject(this);
            Greenfoot.stop();
        }
        clock++;
    }
}
