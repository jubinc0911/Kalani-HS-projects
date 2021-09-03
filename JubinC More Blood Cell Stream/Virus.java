import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Virus floats through the blood stream. It is bad, but this virus is too strong
 * for our white blood cell: our kind of white blood cell cannot destroy it. In fact,
 * this virus destroys the white blood cell! Stay away from it.
 */
public class Virus extends Actor
{
    /**
     * Float along, slowly rotating.
     */
    public void act() {
        int currentX = getX();
        int currentY = getY();
        int newX = currentX - 4;
        setLocation(newX, currentY);
        turn(-1);
        
        if (isTouching(WhiteCell.class) == true) {
            removeTouching(WhiteCell.class);
            Greenfoot.playSound("game-over.wav");
            getWorld().showText("Game Over", 390, 180);
            Greenfoot.stop();
        }
        //remove the virus when it reaches the left
        // edge of the world
        if (newX <= 0) {
            getWorld().removeObject(this);
        }
    }    
}
