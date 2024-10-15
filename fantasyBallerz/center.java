package fantasyBallerz;

import java.util.Random;

public class center extends myplayer {


    public center(String name, int rating, double height, double weight, String ability) {
        super(name, rating, height, weight, ability);
        setPosition("center");
    }


public int getRebounds(){
    Random random = new Random();
    int rebounds = 0;
    if (getWeight() > 250 && getHeight() > 7.0 || getAbility().equalsIgnoreCase("glass cleaner")  || getAbility().equalsIgnoreCase("rim protector")) {
        rebounds = random.nextInt(7, 16);
    }
    else if(getWeight() >= 225 && getHeight() >= 6.5 && getAbility().equalsIgnoreCase("glass cleaner") ) {
        rebounds = random.nextInt(4, 11);
    }
    else {
       rebounds = random.nextInt(3, 8);
}
    return rebounds;
}

public int getAssists(){
    Random random = new Random();
    int assists = 0;
    if (getAbility().equalsIgnoreCase("shot creator") ) {
        assists = random.nextInt(3, 7);
    }
    else{
        assists = random.nextInt(1, 5);
    }
    return assists;
}

public int getPoints(){
    Random random = new Random();
    int points=0;
    if (getWeight() > 225 && getAbility().equalsIgnoreCase("shot creator") || getAbility().equalsIgnoreCase("Slasher")){
        points = (random.nextInt(20, 46));
    }
    if (getWeight() > 200 && getAbility().equalsIgnoreCase("shot creator") || getAbility().equalsIgnoreCase("Slasher")){
        points = random.nextInt(14, 36);
    }
    else {
        points = random.nextInt(5, 21);
    }
    return points;
}

public int getBlocks(){
    int blocks = 0;
    Random random = new Random();
    if (getWeight() > 225 && getHeight() > 7.0 || getAbility().equalsIgnoreCase("rim protetor") || getAbility().equalsIgnoreCase("glass cleaner") ) {
        blocks = random.nextInt(5, 10);
    }
    else if(getWeight() >= 200 && getHeight() >= 6.7 && getAbility().equalsIgnoreCase("rim protector") || getAbility().equalsIgnoreCase("rim protetor") ) {
       blocks = random.nextInt(3, 8);
    }
    else {
       blocks = random.nextInt(1, 4);
}
    return blocks;
}

/**
 * @return
 */
public int getSteals(){
    int steals = 0;
    Random random = new Random();
    if (getAbility().equalsIgnoreCase("shot creator") || getAbility().equalsIgnoreCase("Slasher")){
        steals = random.nextInt(2, 5);
    }
  
    else {
        steals = random.nextInt(0, 4);

}
    return steals;
}



}