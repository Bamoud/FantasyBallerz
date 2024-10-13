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
    private ArrayList<Integer> playerStats = new ArrayList<Integer>();
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
    public myplayer(String name, int rating, double height, double weight, String ability) {
        this.name = name;
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
    public String getPosition(){
        return this.position;
    }

    /**
     * Abstract method to set the position of the player. 
     * This must be implemented by subclasses.
     * 
     * @return The position of the player.
     */
    public void setPosition(String position){
        this.position = position;
    }

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

    public void setPlayerStats(){
        stats currentStats = new stats();
        playerStats.add(currentStats.getPoints());
        playerStats.add(currentStats.getAssists());
        playerStats.add(currentStats.getBlocks());
        playerStats.add(currentStats.getRebounds());
        playerStats.add(currentStats.getSteals());
    }
}

