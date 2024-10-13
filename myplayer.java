package fantasyBallerz;

import java.util.*;

abstract class myplayer {
    private String name;
    private String position;
    private int rating;

    public myplayer(){
        this.name = null;
        this.position =null;
        this.rating = -1;
    }

    public myplayer(String name, String position, int rating){
        this.name = name;
        this.position =position;
        this.rating = rating;
    }

    public String getName(){
        return this.name;
    }

    abstract String getPosition();

    public int getRating(){
        return this.rating;
    }

    public boolean makeChoice(){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        input.close();
        return choice.toLowerCase() == "yes";
    }

    class stats{
        private int points;
        private int rebounds;
        private int steals;
        private int blocks;
        private int assists;

        public stats(){
            this.points = -1;
            this.rebounds = -1;
            this.steals = -1;
            this.blocks = -1;
            this.assists = -1;
        }

        public stats(int points, int rebounds, int steals, int blocks, int assists){
            this.points = points;
            this.rebounds = rebounds;
            this.steals = steals;
            this.blocks = blocks;
            this.assists = assists;
        }

        public int getPoints(){
            return this.points;
        }

        public int getRebounds(){
            return this.rebounds;
        }

        public int getSteals(){
            return this.steals;
        }

        public int getBlocks(){
            return this.blocks;
        }

        public int getAssists(){
            return this.assists;
        }
    }
}