import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        platform platform = new platform();
        addObject(platform,300,150);
        platform platform2 = new platform();
        addObject(platform2,330,150);
        platform platform3 = new platform();
        addObject(platform3,360,150);
        platform platform4 = new platform();
        addObject(platform4,390,150);
        platform platform5 = new platform();
        addObject(platform5,270,150);
        platform platform6 = new platform();
        addObject(platform6,240,150);
        platform platform7 = new platform();
        addObject(platform7,210,150);

        platform platform8 = new platform();
        addObject(platform8,120,270);
        platform platform9 = new platform();
        addObject(platform9,150,270);
        platform platform10 = new platform();
        addObject(platform10,180,270);
        platform platform11 = new platform();
        addObject(platform11,210,270);
        platform platform12 = new platform();
        addObject(platform12,240,270);

        platform platform13 = new platform();
        addObject(platform13,360,270);
        platform platform14 = new platform();
        addObject(platform14,390,270);
        platform platform15 = new platform();
        addObject(platform15,420,270);
        platform platform16 = new platform();
        addObject(platform16,450,270);
        platform platform17 = new platform();
        addObject(platform17,480,270);

        
        playerone playerone = new playerone();
        addObject(playerone,241,56);
        playertwo playertwo = new playertwo();
        addObject(playertwo,369,51);
        Scoreboard2 scoreboard2 = new Scoreboard2();
        addObject(scoreboard2,420,400);
        scoreboard2.setValues(5);

        Scoreboard1 scoreboard1 = new Scoreboard1();
        addObject(scoreboard1,180,400);
        scoreboard1.setValues(5);
        
 
    }
}
