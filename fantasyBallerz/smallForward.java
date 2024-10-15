package fantasyBallerz;

import java.util.Random;

public class smallForward extends myplayer {


    public smallForward() {
        super();
        setPosition("smallForward");
    }


public int getRebounds(){
    Random random = new Random();
    int rebounds = 0;
    if (getWeight() > 225 && getHeight() > 6.9 || getAbility().equalsIgnoreCase("glass cleaner")  || getAbility().equalsIgnoreCase("rim protector")) {
        rebounds = random.nextInt(6, 13);
    }
    else if(getWeight() >= 200 && getHeight() >= 6.5 && getAbility().equalsIgnoreCase("glass cleaner") ) {
        rebounds = random.nextInt(4, 8);
    }
    else {
       rebounds = random.nextInt(3, 6);
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
    if (getWeight() > 225 && getAbility().equalsIgnoreCase("shot creator") || getAbility().equalsIgnoreCase("Slasher")){
        points = (random.nextInt(20, 51));
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
    if (getWeight() > 225 && getHeight() > 6.9 || getAbility().equalsIgnoreCase("rim protetor") || getAbility().equalsIgnoreCase("glass cleaner") ) {
        blocks = random.nextInt(5, 10);
    }
    else if(getWeight() >= 200 && getHeight() >= 6.6 && getAbility().equalsIgnoreCase("rim protector") || getAbility().equalsIgnoreCase("rim protetor") ) {
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
        steals = random.nextInt(4, 8);
    }
  
    else {
        steals = random.nextInt(0, 5);

}
    return steals;
}



}