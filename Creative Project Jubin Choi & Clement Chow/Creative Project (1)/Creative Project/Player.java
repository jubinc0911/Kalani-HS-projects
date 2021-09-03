import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
     
    public boolean joinHunter = false;
    public boolean atWall = false;
    Color A = new Color(0, 204, 51);

    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
     {
        // Add your action code here.
        checkKeyPress();
        checkCollision();
        
        
       
     }
    
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("up") == true && atWall == false) {
            setLocation(getX(), getY()-2);
        }        
        if (Greenfoot.isKeyDown("down") == true && atWall == false) {
            setLocation(getX(), getY()+2);
        }      
        if (Greenfoot.isKeyDown("left") == true && atWall == false) {
            move(-2);
        }      
        if (Greenfoot.isKeyDown("right") == true && atWall == false) {
            move(2);
        }     
        
     }

    public void checkCollision()
    {
        
        
        
        if (isTouching(Trap.class) == true) {
            removeTouching(Trap.class);
            randomPlace();
        }
        if (isTouching(Teleport.class) == true)  {

            removeTouching(Teleport.class);
            setLocation(15, 485);
            joinHunter = false;
            Hunter.changeImage = true;
            
        }
        if (isTouching(Treasure.class) == true) {
            if (joinHunter == true)  {
                removeTouching(Treasure.class);
                setLocation(15, 500);
                getWorld().showText("Success", 300, 300);
                Greenfoot.stop();
            }
            else    {
                
            }
        }
        if (isTouching(Hunter.class) == true)   {
            
            setImage("Player and Hunter.png");
            joinHunter = true;
        }
        
        
        if (getWorld().getBackground().getColorAt(getX(), getY()).equals(A))
            {
                atWall = true;

            }
        else {
            atWall = false;
        }
        
        
        if (joinHunter == true) {
            setImage("Player and Hunter.png");
        }
        else {
            setImage("Player.png");
        }
        
        
   }
    
    private void randomPlace()
    {
        int a = Greenfoot.getRandomNumber(100);
        if (a < 25) {
            setLocation(50, 400);
        }
        if (a >= 25 && a < 50) {
            setLocation(500, 550);
        }
        if (a  >= 50 && a < 75) {
            setLocation(500, 120);
        }
        if (a >= 75) {
            setLocation(400, 560);
        }
    }
    
    
    
}
