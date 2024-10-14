package fantasyBallerz;

/**
 * The Storyline interface defines the methods that must be implemented
 * by any class that handles the storyline or narrative flow of a player 
 * in the Fantasy Ballerz game. 
 */
public interface storyLine {

    /**
     * Gets the position of the player based on their attributes and/or choices.
     */
    public String getPosition(); 

    /**
     * Gets the name of the player.
     */
    public String getName(); 

}