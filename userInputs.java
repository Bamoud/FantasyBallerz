//package fantasyBallerz;

import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that extends `myplayer` and implements `storyLine`. 
 * This class contains functionality to simulate a player's career by taking user input and running a game loop.
 */
public class userInputs extends myplayer implements storyLine {
    // List of NBA teams for random selection
    private final String[] NBA_TEAMS = {
        "Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets", "Chicago Bulls",
        "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons", 
        "Golden State Warriors", "Houston Rockets", "Indiana Pacers", 
        "Los Angeles Clippers", "Los Angeles Lakers", "Memphis Grizzlies", 
        "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", 
        "New Orleans Pelicans", "New York Knicks", "Oklahoma City Thunder", 
        "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns", 
        "Portland Trail Blazers", "Sacramento Kings", "San Antonio Spurs", 
        "Toronto Raptors", "Utah Jazz", "Washington Wizards"
    };

    /**
     * Constructor to initialize user input fields for a player.
     *
     * @param name    The player's name.
     * @param rating  The player's rating.
     * @param height  The player's height in feet.
     * @param weight  The player's weight in pounds.
     * @param ability The player's special ability.
     */
    public userInputs(String name, int rating, double height, double weight, String ability) {
        super(name, rating, height, weight, ability); // Call superclass constructor
    }

    /**
     * Main game loop that drives the player's career simulation.
     */
    public void gameLoop() {
        Scanner scanner = new Scanner(System.in);
        boolean keepPlaying = true;

        // Gathering input for the player’s attributes
        System.out.println("Enter player's name: ");
        String name = scanner.nextLine();

        System.out.println("Enter player's height (in feet): ");
        double height = scanner.nextDouble();

        System.out.println("Enter player's weight (in pounds): ");
        int weight = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        System.out.println("Enter player's ability (rim protector, post player, glass cleaner, slasher, sharpshooter, shot creator): ");
        String ability = scanner.nextLine();

        // Determine player position based on attributes
        playerPos(height, weight, ability);
        System.out.println("Player's position: " + getPosition());

        // Initialize the player object
        userInputs player = new userInputs(name, 0, height, weight, ability);

        // Check if a valid position was assigned
        if (!player.getPosition().equals("")) {
            System.out.println("Enter your player's Diet (Good, Moderate, Bad): ");
            String diet = scanner.nextLine();

            System.out.println("How many days a week does the player go to the gym? ");
            int gymVisits = scanner.nextInt();

            // Calculate the player's rating level based on input
            ratingLvL(gymVisits, diet);
            System.out.println("Your player's skill level is: " + getRating());

            System.out.println("Do you want to enter the draft? (yes/no)");
            String enterDraft = scanner.next();

            for (int year = 1; year <= 15 && keepPlaying; year++) {
                System.out.println("Year " + year + ":");

                if (enterDraft.equalsIgnoreCase("yes")) {
                    System.out.println("Congratulations! You've entered the draft.");
                    int draftpick = draftPick(getRating());
                    String draftedTeam = player.chooseNBATeam();

                    System.out.println("Projected draft pick: " + draftpick + " to the " + draftedTeam);

                    // Generate and display player statistics for the year
                    PlayerStatistics playerStats = new PlayerStatistics();
                    System.out.println("Your Stats for this year:");
                    System.out.println("Points scored: " + playerStats.generatePoints());
                    System.out.println("Assists made: " + playerStats.generateAssists());
                    System.out.println("Blocks made: " + playerStats.generateBlocks());
                    System.out.println("Steals made: " + playerStats.generateSteals());
                } else {
                    System.out.println("Maybe next time! Goodbye.");
                }

                if (year < 15) {
                    System.out.println("Do you want to keep playing? (yes/no)");
                    String continuePlaying = scanner.next();
                    if (!continuePlaying.equalsIgnoreCase("yes")) {
                        keepPlaying = false;
                        System.out.print("Goodbye");
                    }
                }
            }
        }
    }

    /**
     * Determines the player's position based on height, weight, and ability.
     * 
     * @param height  Player's height.
     * @param weight  Player's weight.
     * @param ability Player's special ability.
     */
    public void playerPos(double height, int weight, String ability) {
        if (height >= 7.0 && (ability.equalsIgnoreCase("rim protector") || ability.equalsIgnoreCase("post player"))) {
            setPosition("Center");
        } else if (height >= 6.8 && weight >= 230 && 
                   (ability.equalsIgnoreCase("glass cleaner") || ability.equalsIgnoreCase("slasher"))) {
            setPosition("Power Forward");
        } else if (height >= 6.5 && weight >= 185) {
            setPosition("Small Forward");
        } else if (height >= 6.3 && (ability.equalsIgnoreCase("sharpshooter") || ability.equalsIgnoreCase("shot creator"))) {
            setPosition("Shooting Guard");
        } else {
            setPosition("Point Guard");
        }
    }

    /**
     * Determines the player's rating level based on gym visits and diet.
     * 
     * @param gymVisits Number of gym visits per week.
     * @param diet      Player's diet quality.
     */
    public void ratingLvL(int gymVisits, String diet) {
        int lvl = 0;
        Random random = new Random();

        if (gymVisits > 5 && diet.equalsIgnoreCase("good")) {
            lvl = random.nextInt(4) + 1;
        } else if (gymVisits >= 3 && diet.equalsIgnoreCase("good")) {
            lvl = random.nextInt(10) + 5;
        } else if (gymVisits >= 3 && diet.equalsIgnoreCase("moderate")) {
            lvl = random.nextInt(13) + 7;
        } else if (gymVisits <= 3 && diet.equalsIgnoreCase("bad")) {
            lvl = 15;
        }

        setRating(lvl);
    }

    /**
     * Determines the draft pick number based on the player's skill level.
     * 
     * @param skillLevel Player's skill level.
     * @return The draft pick number.
     */
    public int draftPick(int skillLevel) {
        Random random = new Random();
        int draftPick = random.nextInt(60) + 1;

        if (skillLevel <= 5) {
            draftPick += random.nextInt(5);
        } else if (skillLevel <= 7) {
            draftPick += random.nextInt(20) + 10;
        } else if (skillLevel <= 10) {
            draftPick += random.nextInt(35) + 20;
        } else if (skillLevel <= 12) {
            draftPick += random.nextInt(50) + 36;
        } else {
            draftPick += random.nextInt(60) + 51;
        }

        return Math.min(Math.max(draftPick, 1), 60);
    }

    /**
     * Randomly selects an NBA team from the predefined list.
     * 
     * @return The name of the selected NBA team.
     */
    public String chooseNBATeam() {
        Random random = new Random();
        return NBA_TEAMS[random.nextInt(NBA_TEAMS.length)];
    }
}

