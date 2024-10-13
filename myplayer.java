//package fantasyBallerz;

import java.util.*;

import java.util.Scanner;

/**
 * Abstract class representing a player with basic attributes like name, position, 
 * rating, height, weight, and ability. This class also contains a nested class `stats` 
 * to store performance statistics.
 */
abstract class myplayer {
    // Player's name
    private String name;
    // Player's position on the team
    private String position;
    // Player's rating (e.g., skill level)
    private int rating;
    // Player's height
    private double height;
    // Player's weight
    private double weight;
    // Player's special ability
    private String ability;

    /**
     * Default constructor initializing fields with default values.
     */
    public myplayer() {
        this.name = null;
        this.position = null;
        this.rating = -1;
        this.height = -1.0;
        this.weight = -1.0;
        this.ability = null;
    }

    /**
     * Parameterized constructor to initialize player attributes.
     * 
     * @param name     Name of the player.
     * @param position Position of the player on the team.
     * @param rating   Player's skill rating.
     * @param height   Player's height.
     * @param weight   Player's weight.
     * @param ability  Player's special ability.
     */
    public myplayer(String name, String position, int rating, double height, double weight, String ability) {
        this.name = name;
        this.position = position;
        this.rating = rating;
        this.height = height;
        this.weight = weight;
        this.ability = ability;
    }

    /**
     * Getter method for the player's name.
     * 
     * @return The player's name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for the player's name.
     * 
     * @param name The player's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Abstract method to get the position of the player. 
     * This must be implemented by subclasses.
     * 
     * @return The position of the player.
     */
    abstract String getPosition();

    /**
     * Abstract method to set the position of the player. 
     * This must be implemented by subclasses.
     * 
     * @return The position of the player.
     */
    abstract String setPosition();

    /**
     * Getter method for the player's rating.
     * 
     * @return The player's rating.
     */
    public int getRating() {
        return this.rating;
    }
    
    /**
     * Setter method for the player's rating.
     * 
     * @param rating The player's rating.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * Getter method for the player's height.
     * 
     * @return The player's height.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Setter method for the player's height.
     * 
     * @param height The player's height.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Getter method for the player's weight.
     * 
     * @return The player's weight.
     */
    public double getWeight() {
        return this.weight;
    }

    /**
     * Setter method for the player's weight.
     * 
     * @param weight The player's weight.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Getter method for the player's special ability.
     * 
     * @return The player's special ability.
     */
    public String getAbility() {
        return this.ability;
    }

    /**
     * Setter method for the player's special ability.
     * 
     * @param ability The player's special ability.
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }

    /**
     * Method to allow the player to make a choice by inputting a string.
     * 
     * @return True if the input is "yes" (case-insensitive), otherwise false.
     */
    public boolean makeChoice() {
        Scanner input = new Scanner(System.in); // Create a Scanner for user input
        String choice = input.nextLine(); // Read the input string
        input.close(); // Close the scanner to prevent resource leak
        return choice.toLowerCase().equals("yes"); // Compare input to "yes"
    }

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
}

