import java.util.*;
import java.io.*;
import java.lang.Math;


/* Bashir Amoud 
 * This code will make all of the functions with the game,
 *  ex (asking user impurts, calculating all stats averages etc 
 * and coming up with in game senarios and choosing them based off of specific senerios)
 * it will build the charactor and its attributes
 *save all the data to a file 

 */
 
 public class originalfunctions {
     private double height;
     private int weight;
     private String ability;
     private String skillLevel;
     private static final String[] NBA_TEAMS = { "Atlanta Hawks", "Boston Celtics", "Brooklyn Nets", "Charlotte Hornets","Chicago Bulls",
         "Cleveland Cavaliers", "Dallas Mavericks", "Denver Nuggets", "Detroit Pistons", "Golden State Warriors",
         "Houston Rockets", "Indiana Pacers", "Los Angeles Clippers", "Los Angeles Lakers", "Memphis Grizzlies",
         "Miami Heat", "Milwaukee Bucks", "Minnesota Timberwolves", "New Orleans Pelicans", "New York Knicks",
         "Oklahoma City Thunder", "Orlando Magic", "Philadelphia 76ers", "Phoenix Suns", "Portland Trail Blazers",
         "Sacramento Kings", "San Antonio Spurs", "Toronto Raptors", "Utah Jazz", "Washington Wizards"
     };
 
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         boolean keepPlaying = true;
 
         System.out.println("Enter player's height (in feet): ");
         double height = scanner.nextDouble();
 
         System.out.println("Enter player's weight (in pounds): ");
         int weight = scanner.nextInt();
 
         System.out.println("Enter player's ability (rim protector, post player, glass cleaner, slasher, sharpshooter, shot creator): ");
         String ability = scanner.next();
         scanner.nextLine();
 
         originalfunctions player = new originalfunctions();
         String position = player.playerPos(height, weight, ability);
         
         System.out.println("Player's position: " + position);
         
         if (!position.equals("")) {
         System.out.println("Enter your player's Diet (Good, Moderate, Bad): ");
         String diet = scanner.nextLine();
 
         System.out.println("How many days a week does the player go to the gym? ");
         int gymVisits = scanner.nextInt();
 
         int skillLevel = originalfunctions.skillLvL(gymVisits, diet);
 
         System.out.println("Your player's skill level is: " + skillLevel);
         
          System.out.println("Do you want to enter the draft? (yes/no)");
             String enterDraft = scanner.next();
             
         for (int year = 1; year <= 15 && keepPlaying; year++) {
             System.out.println("Year " + year + ":");
             
         if (enterDraft.equalsIgnoreCase("yes")) {
            System.out.println("Congratulations! You've entered the draft.");
            int draftpick = draftPick(skillLevel);
            String draftedTeam = player.chooseNBATeam();
         
            System.out.println("Projected draft pick: " + draftpick + " to the " + draftedTeam);
            
              PlayerStatistics playerStats = new PlayerStatistics();
                 System.out.println("Your Stats for this year:");
                 System.out.println("Points scored: " + playerStats.generatePoints());
                 System.out.println("Assists made: " + playerStats.generateAssists());
                 System.out.println("Blocks made: " + playerStats.generateBlocks());
                 System.out.println("Steals made: " + playerStats.generateSteals());
                 saveStatisticsToFile(year);
             } else {
                 System.out.println("Maybe next time! goodbye");
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
      * this method decides the players position based of hieght weight and ability.
      * @param double height is the players height
      * @param int weight is the players weight
      * @param String ability is the players abiity.
      * @return String position returns the players position.
      */
 
     public static String playerPos(double height, int weight, String ability) {
 
         String position = "";
 
         if (height >= 7.0 && (ability.equalsIgnoreCase("rim protector") || ability.equalsIgnoreCase("post player"))) {
             position = "Center";
         }
         else if (height >= 6.8 && weight >= 230 && (ability.equalsIgnoreCase("glass cleaner") || ability.equalsIgnoreCase("slasher"))) {
             position = "Power Forward";
         } 
         else if (height >= 6.5 && weight >= 185) {
             position = "Small Forward";
         }
         else if (height >= 6.3 && (ability.equalsIgnoreCase("sharpshooter") || ability.equalsIgnoreCase("shot creator"))) {
             position = "Shooting Guard";
         }
         else if (height < 6.3) {
             position = "Point Guard";
         }
 
         return position;
     }
     /**
      * this method decides the skill level based on diet and gym visits. 1 being the best and 15 being the lowest.
      * @param gymVisits int is the amount of gym visits the player makes a week.
      * @param diet is how good the players diet is.
      * @return int lvl returns the skill level 
      */
 
     public static int skillLvL(int gymVisits, String diet) {
 
         // 1 is the highest skill level 15 is lowest
         int lvl = 0;
         if (gymVisits > 5 && diet.equalsIgnoreCase("good")) {
             Random num1 = new Random();
             lvl = num1.nextInt(4) + 1;} 
         else if (gymVisits >= 3 && diet.equalsIgnoreCase("good")) {
             Random num1 = new Random();
             lvl = num1.nextInt(10 ) + 5;} 
         else if (gymVisits >= 3 && diet.equalsIgnoreCase("moderate")) {
             Random num1 = new Random();
             lvl = num1.nextInt(13) + 7; }
         else if (gymVisits <= 3 && diet.equalsIgnoreCase("bad")) {
             lvl = 15;}
         
         
         return lvl;
     }
     /**
      * this method uses the skill level to determine the draft pick.
      * @param int skilllevel is the skill level from the previous method.
      * @raturn returns the draft pick number
      */
     public static int draftPick(int skillLevel) {
         Random random = new Random();
         int draftPick = random.nextInt(60) + 1;
        
         if (skillLevel <= 5) {
             draftPick += random.nextInt(5);  } 
         else if (skillLevel <=7 && skillLevel >= 3 ) {
             draftPick += random.nextInt(20) + 10;  } 
         else if (skillLevel <= 10 && skillLevel > 5) {
           draftPick += random.nextInt(35) + 20; }
         else if (skillLevel <= 12 && skillLevel >= 10) {
           draftPick += random.nextInt(50) + 36; }
         else if(skillLevel <= 15 && skillLevel > 13) { draftPick += random.nextInt(60) + 51; }
 
        
         if (draftPick < 1) {
             draftPick = 1;
         } else if (draftPick > 60) {
             draftPick = 60; }
 
         return draftPick;
    
    
 }
        public String chooseNBATeam() {
        Random random = new Random();
        int index = random.nextInt(NBA_TEAMS.length);
        return NBA_TEAMS[index];
        }
     /** 
       * this method saves yeach years stats to file.
       * @param year int gets the year for the stats.
       */
     public static void saveStatisticsToFile(int year) {
        
         try {
         FileWriter writer = new FileWriter("Player_stats.txt");
         writer.write("Statistics for Year " + year + ":\n");
         
         PlayerStatistics playerStats = new PlayerStatistics();
         writer.write("Points scored: " + playerStats.generatePoints() + "\n");
         writer.write("Assists made: " + playerStats.generateAssists() + "\n");
         writer.write("Blocks made: " + playerStats.generateBlocks() + "\n");
         writer.write("Steals made: " + playerStats.generateSteals() + "\n");
         
         writer.close();
     } catch (IOException e) {
         e.printStackTrace();
     }
 }
 }
 
 
 /** this class randomizes stats with a max and a min
   */
    class PlayerStatistics {
     private Random random;
 /** this meathod holds the random method
   */
     public PlayerStatistics() {
         random = new Random();
     }
 /** this method gets and returns the points per game
   */
     public int generatePoints() {
         return random.nextInt(31);
     }
 /** this method gets and returns the assists per game.
   */
     public int generateAssists() {
         return random.nextInt(16); 
     }
 /** this method gets and returns the blocks per game
   */
     public int generateBlocks() {
         return random.nextInt(6); 
     }
 /** this method gets and returns the steals per game
   */
     public int generateSteals() {
         return random.nextInt(6); 
     }
     
 }
