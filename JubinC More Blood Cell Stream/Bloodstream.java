import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The bloodstream is the setting for our White Blood Cell scenario. It's a place
 * where blood cells, bacteria and viruses float around.
 */
public class Bloodstream extends World {

    /**
     * Constructor: Set up the staring objects.
     */
    public Bloodstream() {
        
        // set up the basic world
        super(780, 360, 1); 
        
        // prepare the background and actors
        prepare();
    }

    /**
     * Create new floating objects at irregular intervals.
     * The act() method is called continuously as the game runs.
     */
    public void act() {
        if (Greenfoot.getRandomNumber(100) < 3) {
            addObject(new Bacteria(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Lining(), 779, 0);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Lining(), 779, 359);
        }
        
        if (Greenfoot.getRandomNumber(100) < 1) {
            addObject(new Virus(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if (Greenfoot.getRandomNumber(100) < 4) {
            addObject(new RedCell(), 779, Greenfoot.getRandomNumber(360));
        }
    }
    
    /**
     * Prepare the world for the start of the program. In this case: Create
     * a white blood cell and the lining at the edge of the blood stream.
     */
    private void prepare() {
        // create the player
        WhiteCell whitecellPlayer = new WhiteCell();
        addObject(whitecellPlayer, 83, 179);
        // create the walls of the blood vessel
        Lining lining = new Lining();
        addObject(lining, 126, 1);
        Lining lining2 = new Lining();
        addObject(lining2, 342, 5);
        Lining lining3 = new Lining();
        addObject(lining3, 589, 2);
        Lining lining4 = new Lining();
        addObject(lining4, 695, 5);
        Lining lining5 = new Lining();
        addObject(lining5, 114, 359);
        Lining lining6 = new Lining();
        Lining lining7 = new Lining();
        addObject(lining7, 295, 353);
        Lining lining8 = new Lining();
        Lining lining9 = new Lining();
        Lining lining10 = new Lining();
        addObject(lining10, 480, 358);
        Lining lining11 = new Lining();
        addObject(lining11, 596, 359);
        Lining lining12 = new Lining();
        addObject(lining12, 740, 354);
    }
}
