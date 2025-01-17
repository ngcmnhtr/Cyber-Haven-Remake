import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ResumeButton extends MenuButtons
{
    private GreenfootImage resumeImage;
    private GreenfootImage resumeHoverImage;
    private World gameWorld;
    
    /**
     * Constructor - Initialize the button images and sets the default image. 
     */
    public ResumeButton(World gameWorld)
    {
        this.gameWorld = gameWorld;
        resumeImage =  new  GreenfootImage("ResumeButton.png"); 
        resumeHoverImage =  new  GreenfootImage("ResumeHoverButton.png");
        setImage(resumeImage);
    }


    /**
     * Act - Check for mouse interactions with the button. Changes the button image on hover and handles click events.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(resumeHoverImage);
            //Menu menuWorld = (Menu) getWorld(); // Get the Menu world
            //Greenfoot.setWorld(menuWorld.getWorld()); // Transition back to the previous game world
        }
        else if (Greenfoot.mouseMoved(null)) {
            setImage(resumeImage);
        }
        if (Greenfoot.mouseClicked(this)) {
            resumeGame();
            //Greenfoot.playSound("startClick.wav");
        }
    }
    
      
    /**
     * Transition back to the game when the button is clicked.
     */
    public void resumeGame()
    {
        //Transition back to the game when the button is clicked.
        //World startMenu =  new  StartMenu();
        Greenfoot.setWorld(gameWorld);
    }

}
