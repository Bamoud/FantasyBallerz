package fantasyBallerz;

import java.util.Random;

public class shootingGuard extends myplayer {


    public shootingGuard() {
        super();
        setPosition("shooting guard");
    }


public int getRebounds(){
    Random random = new Random();
    int rebounds = 0;
    if (getWeight() > 225 && getHeight() > 6.6 || getAbility().equalsIgnoreCase("Slasher") ) {
        rebounds = random.nextInt(5, 9);
    }
    else if(getWeight() >= 200 && getHeight() >= 6.3 && getAbility().equalsIgnoreCase("Slasher") ) {
        rebounds = random.nextInt(1, 6);
    }
    else {
       rebounds = random.nextInt(0, 3);
}
    return rebounds;
}

public int getAssists(){
    Random random = new Random();
    int assists = 0;
    if (getAbility().equalsIgnoreCase("shot creator") ) {
        assists = random.nextInt(5, 11);
    }
    else{
        assists = random.nextInt(1, 5);
    }
    return assists;
}

public int getPoints(){
    Random random = new Random();
    int points=0;
    if (getWeight() > 185 && getAbility().equalsIgnoreCase("shot creator") || getAbility().equalsIgnoreCase("Sharpshooter")){
        points = (random.nextInt(20, 51));
    }
    if (getWeight() > 185 && getAbility().equalsIgnoreCase("shot creator") || getAbility().equalsIgnoreCase("Slasher")){
        points = random.nextInt(15, 36);
    }
    else {
        points = random.nextInt(5, 20);
    }
    return points;
}

public int getBlocks(){
    int blocks = 0;
    Random random = new Random();
    if (getWeight() > 225 && getHeight() > 6.6 || getAbility().equalsIgnoreCase("rim protetor") || getAbility().equalsIgnoreCase("glass cleaner") ) {
        blocks = random.nextInt(2, 5);
    }
    else if(getWeight() >= 200 && getHeight() >= 6.3 && getAbility().equalsIgnoreCase("Slasher") ) {
       blocks = random.nextInt(1, 4);
    }
    else {
       blocks = random.nextInt(0, 3);
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
        steals = random.nextInt(3, 7);
    }
  
    else {
        steals = random.nextInt(0, 4);

}
    return steals;
}



}