//package fantasyBallerz;
/**
 * Inner class representing player statistics like points, rebounds, and assists.
 */
class stats {
    // Player's points scored
    private int points;
    // Player's rebounds collected
    private int rebounds;
    // Player's steals made
    private int steals;
    // Player's blocks performed
    private int blocks;
    // Player's assists made
    private int assists;

    /**
     * Default constructor initializing stats with default values.
     */
    public stats() {
        this.points = -1;
        this.rebounds = -1;
        this.steals = -1;
        this.blocks = -1;
        this.assists = -1;
    }

    /**
     * Parameterized constructor to initialize player statistics.
     * 
     * @param points   Points scored by the player.
     * @param rebounds Rebounds collected by the player.
     * @param steals   Steals made by the player.
     * @param blocks   Blocks performed by the player.
     * @param assists  Assists made by the player.
     */
    public stats(int points, int rebounds, int steals, int blocks, int assists) {
        this.points = points;
        this.rebounds = rebounds;
        this.steals = steals;
        this.blocks = blocks;
        this.assists = assists;
    }

    /**
     * Getter method for points scored.
     * 
     * @return The points scored by the player.
     */
    public int getPoints() {
        return this.points;
    }

    /**
     * Setter method for points scored.
     * 
     * @param points The points scored by the player.
     */
    public void setPoints(int points) {
        this.points = points;
    }

    /**
     * Getter method for rebounds collected.
     * 
     * @return The rebounds collected by the player.
     */
    public int getRebounds() {
        return this.rebounds;
    }

    /**
     * Setter method for rebounds collected.
     * 
     * @param rebounds The rebounds collected by the player.
     */
    public void setRebounds(int rebounds) {
        this.rebounds = rebounds;
    }

    /**
     * Getter method for steals made.
     * 
     * @return The steals made by the player.
     */
    public int getSteals() {
        return this.steals;
    }

    /**
     * Setter method for steals made.
     * 
     * @param steals The steals made by the player.
     */
    public void setSteals(int steals) {
        this.steals = steals;
    }

    /**
     * Getter method for blocks performed.
     * 
     * @return The blocks performed by the player.
     */
    public int getBlocks() {
        return this.blocks;
    }

    /**
     * Setter method for blocks performed.
     * 
     * @param blocks The blocks performed by the player.
     */
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    /**
     * Getter method for assists made.
     * 
     * @return The assists made by the player.
     */
    public int getAssists() {
        return this.assists;
    }

    /**
     * Setter method for assists made.
     * 
     * @param assists The assists made by the player.
     */
    public void setAssists(int assists) {
        this.assists = assists;
    }
}