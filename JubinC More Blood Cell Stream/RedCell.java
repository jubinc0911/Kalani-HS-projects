import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedCell here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedCell extends Actor
{
    /**
     * Act - do whatever the RedCell wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int currentX = getX();
        int currentY = getY();
        int newX = currentX - 2;
        setLocation(newX, currentY);
        turn(1);
        
        if (newX <= 0) {
            getWorld().removeObject(this);
        }
        
    }
}