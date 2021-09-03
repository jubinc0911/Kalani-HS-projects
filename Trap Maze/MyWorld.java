import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    public static final int SIZE = 600;
    private GreenfootImage map;
    Color green = new Color (0, 204, 51);
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(SIZE, SIZE, 1); 
        setup();
        
    }
    
    
    
    public void setup()
    {
        map = new GreenfootImage("Map.png");
        addObject(new Wall(), 300, 300);
        addObject(new Treasure(), SIZE/2, SIZE/2);
        addObject(new Player(), 15, 500);
        addObject(new Trap(), 215, 185);
        addObject(new Trap(), 130, 555);
        addObject(new Trap(), 500, 380);
        addObject(new Teleport(), 40, 140);
        addObject(new Teleport(), 550, 550);
        addObject(new Teleport(), 355, 210);
        addObject(new Hunter(), 385, 270);

        
    }
}
