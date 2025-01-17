import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MapParts extends Actor {
    /**
     * Act - do whatever the MapParts wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
    }
    
    protected boolean isCharacterOnTop(Characters character) {
        int characterTop = character.getY() - character.getImage().getHeight() / 2;
        int platformBottom = getY() + getImage().getHeight() / 2;
        
        //check if character is on top
        return characterTop >= platformBottom - 5 && characterTop <= platformBottom;

    }
}
