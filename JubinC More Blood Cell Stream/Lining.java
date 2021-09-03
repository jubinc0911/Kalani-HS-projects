import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Lining are objects at the edge of the vein.
 */
public class Lining extends Actor
{
    /**
     * Move the lining along at regular speed.
     */
    public void act() {
        int currentX = getX();
        int currentY = getY();
        int newX = currentX - 1;
        setLocation(newX, currentY);
        
        // remove it once it reaches the left edge of
        // the world
        if (newX <= 0) {
            getWorld().removeObject(this);
        }
    }    
}
