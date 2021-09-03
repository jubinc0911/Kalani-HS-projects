import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hunter extends Actor
{   
    
    public boolean joinPlayer = false;
    public static boolean changeImage = false;
    
    /**
     * Act - do whatever the Hunter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (changeImage == true) {
            setImage("Hunter.png");
            changeImage = false;
        }
        if (isTouching(Player.class) == true)   {
            joinPlayer = true;
            setImage("Pheromone.png");
        }
        if (isTouching(Teleport.class) == true) {
            joinPlayer = false;
            
        }
        

        
    }    
    
    public void followPlayer()  {

        if (joinPlayer == true) {


        }
    }
    }