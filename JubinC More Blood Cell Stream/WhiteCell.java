import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is a white blood cell. This kind of cell has the job to catch bacteria and
 * remove them from the blood.
 */
public class WhiteCell extends Actor {
    
    public static int score = 0;
    
    /**
     * Act: move up and down when cursor keys are pressed.
     */
    public void act() {
        checkKeyPress();
        checkCollision();
   }
   
   public static void addToScore(int points) {
      // score is the variable that keeps track of the user score
      score = score + points;
    }
   
    /**
     * Check whether a keyboard key has been pressed and react if it has.
     */
    private void checkKeyPress() {
        if (Greenfoot.isKeyDown("up") == true) {
            turnTowards(83, 0);
            move(4);
        }        
        if (Greenfoot.isKeyDown("down") == true) {
            turnTowards(83, 360);
            move(4);
        }      

    }
    
    /**
     * Check whether we are touching a bacterium or virus. Remove bacteria.
     * Game over if we hit a virus.
     */
    private void checkCollision() {
        if (isTouching(Bacteria.class) == true) {
            removeTouching(Bacteria.class);
            score = score + 100;
            Greenfoot.playSound("slurp.wav");
        }
        
        getWorld().showText("Score: " + score, 60, 50);

        
        
        
        /*
         * ADD YOUR CODE HERE
         * If the player comes in contact with a bacteria,
         * play the slurp.wav sound file, remove the bacteria,
         * and increase the score by 100 points.  Also print the
         * score to the screen.
         * 
         * If the player comes in contact with a virus,
         * play the game-over.wav sound file,
         * print a game over message to the screen, and end the game.
         * 
         * Use the Greenfoot.playSound(nameOfSoundFile) and
         * Greenfoot.stop() methods to play a sound file and
         * stop the game.
         */
    }
}
