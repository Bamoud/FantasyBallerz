//package fantasyBallerz;

import java.util.*;

import java.util.Scanner;

/**
 * Abstract class representing a player with basic attributes like name, position, 
 * and rating. This class also contains a nested class `stats` to store performance statistics.
 */
abstract class myplayer {
    // Player's name
    private String name;
    // Player's position on the team
    private String position;
    // Player's rating (e.g., skill level)
    private int rating;

    /**
     * Default constructor initializing fields with default values.
     */
    public myplayer() {
        this.name = null;
        this.position = null;
        this.rating = -1;
    }

    /**
     * Parameterized constructor to initialize player attributes.
     * 
     * @param name     Name of the player.
     * @param position Position of the player on the team.
     * @param rating   Player's skill rating.
     */
    public myplayer(String name, String position, int rating) {
        this.name = name;
        this.position = position;
        this.rating = rating;
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
     * Abstract method to get the position of the player. 
     * This must be implemented by subclasses.
     * 
     * @return The position of the player.
     */
    abstract String getPosition();

    /**
     * Getter method for the player's rating.
     * 
     * @return The player's rating.
     */
    public int getRating() {
        return this.rating;
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
        return choice.toLowerCase().equals( "yes"); // Compare input to "yes" (incorrect comparison)
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
         * Getter method for rebounds collected.
         * 
         * @return The rebounds collected by the player.
         */
        public int getRebounds() {
            return this.rebounds;
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
         * Getter method for blocks performed.
         * 
         * @return The blocks performed by the player.
         */
        public int getBlocks() {
            return this.blocks;
        }

        /**
         * Getter method for assists made.
         * 
         * @return The assists made by the player.
         */
        public int getAssists() {
            return this.assists;
        }
    }
}
