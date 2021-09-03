import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bacteria fload along in the bloodstream. They are bad. Best to destroy
 * them if you can.
 */
public class Bacteria extends Actor
{
    /**
     * Constructor. Nothing to do so far.
     */
    public Bacteria() {
        // bacteria are very simple
    }

    /**
     * Float along the bloodstream, slowly rotating.
     */
    public void act() {
        int currentX = getX();
        int currentY = getY();
        int newX = currentX - 2;
        setLocation(newX, currentY);
        turn(1);
        
        if (isTouching(RedCell.class) == true)  {
            removeTouching(RedCell.class);
            WhiteCell.addToScore(-25);
        }
        
        if (newX <= 0) {
            getWorld().removeObject(this);
        }
    }    
}
