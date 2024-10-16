package fantasyBallerz;

import java.util.*;

public class gameChoices implements storyLine {
    private String position;
    private String choices;

    public String getName() {
        return "";
    }
    public String getPosition() {
        return position; 
    }

    public String getChoice() {
        return choices;  
    }
    public void takeShot()  {
        Random random = new Random();
        if (random.nextInt(0, 4) == 3){
            System.out.println("you made a three");
        }
        else if (random.nextInt(0, 4) == 2){
            System.out.println("you made a mid range shot");
        }
        else if (random.nextInt(0, 4) == 1){
            System.out.println("you made a layup");
        }
        else {
            System.out.println("you got stripped, LOSER!");
        }
    }
    public void passBall() {
        Random random = new Random();
        if (random.nextInt(0, 3) == 2){
        System.out.println("you're teammate got the ball and scored");
        }
        else if (random.nextInt(0, 3) == 1){
            System.out.println("A defender stole the ball and took it cost to cost, LOSER");
        }
        else {
            System.out.println("You thought the referee was your teamate and threw the ball at him");
        }
    }

    public void getShifty() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4){
            System.out.println("You took your defenders ankles and scored.");
        }
        else if (random.nextInt(0, 5) == 3){
            System.out.println("You took your defenders ankles but missed the shot");
        }
        else if (random.nextInt(0, 5) == 2){
            System.out.println("You were dribbling alot and ended up slipping and looking goofy");
        }
        else if (random.nextInt(0, 5) == 1){
            System.out.println("Your dribbled through the whole team and got a between the legs poster on your defender (probobly on Rudy Gobert's trash ass)");
        }
        else {
            System.out.println("YOU GOT STRIPPED..... LOSER!!!");
        }
    }

    public void diveForBall() {
        Random random = new Random();
        if (random.nextInt(0, 3) == 2){
            System.out.println("You succefully got the ball");
        }
        else if (random.nextInt(0, 3) == 1){
            System.out.println("You tried but ended up looking STUPID");
        }
        else {
            System.out.println("you got it but then lost the ball..... LOSER!!!");
    }

}
    public void blockShot() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4) {
            System.out.println("You blocked the shot and secured the rebound!");
        } else if (random.nextInt(0, 5) == 3) {
            System.out.println("You got a clean block but the other team recovered the ball.");
        } else if (random.nextInt(0, 5) == 2) {
            System.out.println("You fouled the shooter. Free throws coming up.");
        } else if (random.nextInt(0, 5) == 1) {
            System.out.println("You went for the block and ended up on a poster!");
        } else {
            System.out.println("You completely missed the block. Better luck next time!");
        }
    }

    public void stealBall() {
        Random random = new Random();
        if (random.nextInt(0, 4) == 3) {
            System.out.println("You stole the ball cleanly and fast-break for an easy score!");
        } else if (random.nextInt(0, 4) == 2) {
            System.out.println("You poked the ball loose, but the other team recovered.");
        } else if (random.nextInt(0, 4) == 1) {
            System.out.println("You fouled while going for the steal. Two free throws.");
        } else {
            System.out.println("You went for the steal and got crossed over instead. Ouch!");
        }
    }

    public void dunkAttempt() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4) {
            System.out.println("You threw down a monster dunk!");
        } else if (random.nextInt(0, 5) == 3) {
            System.out.println("You went for the dunk but got blocked.");
        } else if (random.nextInt(0, 5) == 2) {
            System.out.println("You attempted a dunk but missed the rim entirely.");
        } else if (random.nextInt(0, 5) == 1) {
            System.out.println("You slipped while going for the dunk and face-planted.");
        } else {
            System.out.println("You lost the ball mid-air. Turnover.");
        }
    }

    public void takeCharge() {
        Random random = new Random();
        if (random.nextInt(0, 3) == 2) {
            System.out.println("You successfully took the charge! Offensive foul.");
        } else if (random.nextInt(0, 3) == 1) {
            System.out.println("You flopped and got called for a blocking foul.");
        } else {
            System.out.println("You hesitated and got run over. No call.");
        }
    }

    public void fullCourtPass() {
        Random random = new Random();
        if (random.nextInt(0, 4) == 3) {
            System.out.println("You made a full-court pass for an easy layup!");
        } else if (random.nextInt(0, 4) == 2) {
            System.out.println("You overthrew the pass, and it went out of bounds.");
        } else if (random.nextInt(0, 4) == 1) {
            System.out.println("You threw a perfect pass, but your teammate missed the dunk.");
        } else {
            System.out.println("You threw the ball straight to the other team. Turnover.");
        }
    }

    public void pickAndRoll() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4) {
            System.out.println("You executed the perfect pick-and-roll and scored.");
        } else if (random.nextInt(0, 5) == 3) {
            System.out.println("You set the screen, but your teammate missed the open shot.");
        } else if (random.nextInt(0, 5) == 2) {
            System.out.println("You set an illegal screen and got called for an offensive foul.");
        } else if (random.nextInt(0, 5) == 1) {
            System.out.println("The defense trapped you after the pick, and you turned it over.");
        } else {
            System.out.println("You fumbled the ball after the pick. Turnover.");
        }
    }
    public void alleyOop() {
        Random random = new Random();
        if (random.nextInt(0, 4) == 3) {
            System.out.println("You threw a perfect alley-oop for a huge slam!");
        } else if (random.nextInt(0, 4) == 2) {
            System.out.println("The pass was a bit off, but your teammate still finished the dunk.");
        } else if (random.nextInt(0, 4) == 1) {
            System.out.println("The alley-oop was intercepted. Turnover.");
        } else {
            System.out.println("You mistimed the pass, and the ball flew out of bounds.");
        }
    }

    public void pullUpJumper() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4) {
            System.out.println("You hit a smooth pull-up jumper from mid-range.");
        } else if (random.nextInt(0, 5) == 3) {
            System.out.println("You pulled up, but the shot rimmed out.");
        } else if (random.nextInt(0, 5) == 2) {
            System.out.println("You got blocked while attempting the jumper.");
        } else if (random.nextInt(0, 5) == 1) {
            System.out.println("You pulled up for a three but airballed it.");
        } else {
            System.out.println("You lost control of the ball mid-shot. Turnover.");
        }
    }

    public void reboundAttempt() {
        Random random = new Random();
        if (random.nextInt(0, 3) == 2) {
            System.out.println("You grabbed the offensive rebound and scored!");
        } else if (random.nextInt(0, 3) == 1) {
            System.out.println("You went for the rebound but got outboxed.");
        } else {
            System.out.println("You mistimed the jump and missed the rebound completely.");
        }
    }

    public void pickPocket() {
        Random random = new Random();
        if (random.nextInt(0, 4) == 3) {
            System.out.println("You picked the defender's pocket and went coast-to-coast for a dunk!");
        } else if (random.nextInt(0, 4) == 2) {
            System.out.println("You poked the ball loose but couldn't recover it.");
        } else if (random.nextInt(0, 4) == 1) {
            System.out.println("You fouled the ball handler while trying to steal.");
        } else {
            System.out.println("You went for the steal and missed, leaving your man wide open.");
        }
    }

    public void driveToBasket() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4) {
            System.out.println("You drove to the basket and finished with a strong layup.");
        } else if (random.nextInt(0, 5) == 3) {
            System.out.println("You drove to the rim but missed the layup.");
        } else if (random.nextInt(0, 5) == 2) {
            System.out.println("You drove hard but got blocked at the rim.");
        } else if (random.nextInt(0, 5) == 1) {
            System.out.println("You drove to the basket but stepped out of bounds.");
        } else {
            System.out.println("You drove and lost the ball before reaching the rim. Turnover.");
        }
    }

    public void setScreen() {
        Random random = new Random();
        if (random.nextInt(0, 3) == 2) {
            System.out.println("You set a perfect screen, and your teammate hit an open shot.");
        } else if (random.nextInt(0, 3) == 1) {
            System.out.println("You set an illegal screen and got called for a foul.");
        } else {
            System.out.println("You set a weak screen, and your defender easily got around it.");
        }
    }

    public void doubleTeam() {
        Random random = new Random();
        if (random.nextInt(0, 4) == 3) {
            System.out.println("You and your teammate trapped the ball handler and forced a turnover!");
        } else if (random.nextInt(0, 4) == 2) {
            System.out.println("You double-teamed, but the ball handler passed out of it.");
        } else if (random.nextInt(0, 4) == 1) {
            System.out.println("The ball handler split the double-team and scored.");
        } else {
            System.out.println("You tried to double-team but ended up fouling the ball handler.");
        }
    }

    public void fullCourtPress() {
        Random random = new Random();
        if (random.nextInt(0, 5) == 4) {
            System.out.println("Your full-court press forced a turnover and an easy score.");
        } else if (random.nextInt(0, 5) == 3) {
            System.out.println("The other team broke the press and scored on the other end.");
        } else if (random.nextInt(0, 5) == 2) {
            System.out.println("You fouled while pressing, and the other team gets free throws.");
        } else if (random.nextInt(0, 5) == 1) {
            System.out.println("The press failed, and your team was out of position on defense.");
        } else {
            System.out.println("The press had no effect, and the other team easily advanced the ball.");
        }
    }
    public void mafia() {
       System.out.println("CONGRATIONS, YOU JOINED THE MAFIA.");

    }

    public void gameOverGang() {
       System.out.println("YOU GOT SHOT 47 TIMES BY A MALE STRIPPER");
    }
    
    public void gangMission() {
        Random random = new Random();
        if (random.nextInt(0, 11) == 1){
            System.out.println("You sucessfully completed and survived ");
        }
        else {
            System.out.println("You got caught lacking by and opp, he shot you 47 times");
        }

    }




    public void gotBallChoice() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Take the Shot");
        System.out.println("2. Pass the ball");
        System.out.println("3. Get shifty and figure it out.");

        System.out.print("Enter your choice (1/2/3): ");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                choices = "Take the Shot";
                takeShot();
                break;
            case 2:
                choices = "Pass the ball";
                passBall();
                break;
            case 3:
                choices = "Get shifty and figure it out";
                getShifty();
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        
    }
}
public void fastBreakChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Take the shot");
    System.out.println("2. Pass the ball");
    System.out.println("3. Get shifty and figure it out");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Take the Shot";
            takeShot();
            break;
        case 2:
            choices = "Pass the Ball";
            passBall();
            break;
        case 3:
            choices = "Get Shifty";
            getShifty();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void defensivePlayChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Steal the ball");
    System.out.println("2. Block the shot");
    System.out.println("3. Take a charge");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Steal the ball";
            stealBall();
            break;
        case 2:
            choices = "Block the shot";
            blockShot();
            break;
        case 3:
            choices = "Take a charge";
            takeCharge();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void reboundChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Go for the rebound");
    System.out.println("2. Dive for the ball");
    System.out.println("3. Box out and let your teammate grab it");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Go for the rebound";
            reboundAttempt();
            break;
        case 2:
            choices = "Dive for the ball";
            diveForBall();
            break;
        case 3:
            choices = "Box out";
            System.out.println("You boxed out and your teammate grabbed the rebound.");
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void offensivePlayChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Pick and roll");
    System.out.println("2. Pull up jumper");
    System.out.println("3. Dunk attempt");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Pick and roll";
            pickAndRoll();
            break;
        case 2:
            choices = "Pull up jumper";
            pullUpJumper();
            break;
        case 3:
            choices = "Dunk attempt";
            dunkAttempt();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void transitionPlayChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Full court pass");
    System.out.println("2. Alley-oop");
    System.out.println("3. Drive to the basket");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Full court pass";
            fullCourtPass();
            break;
        case 2:
            choices = "Alley-oop";
            alleyOop();
            break;
        case 3:
            choices = "Drive to the basket";
            driveToBasket();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}
public void pressureDefenseChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Full-court press");
    System.out.println("2. Double team the ball handler");
    System.out.println("3. Try to pick the ball handler's pocket");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Full-court press";
            fullCourtPress();
            break;
        case 2:
            choices = "Double team";
            doubleTeam();
            break;
        case 3:
            choices = "Pick pocket";
            pickPocket();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void defensiveReboundChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Go for the defensive rebound");
    System.out.println("2. Box out aggressively");
    System.out.println("3. Tap the ball to a teammate");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Go for the rebound";
            reboundAttempt();
            break;
        case 2:
            choices = "Box out aggressively";
            System.out.println("You boxed out hard and cleared space for the rebound.");
            break;
        case 3:
            choices = "Tap the ball";
            System.out.println("You tapped the ball to your teammate.");
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void lateGameOffenseChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Pull-up jumper");
    System.out.println("2. Go for a dunk");
    System.out.println("3. Execute a pick-and-roll");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Pull-up jumper";
            pullUpJumper();
            break;
        case 2:
            choices = "Go for a dunk";
            dunkAttempt();
            break;
        case 3:
            choices = "Pick-and-roll";
            pickAndRoll();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void crucialMomentChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Pass the ball");
    System.out.println("2. Take the shot");
    System.out.println("3. Go for an alley-oop");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Pass the ball";
            passBall();
            break;
        case 2:
            choices = "Take the shot";
            takeShot();
            break;
        case 3:
            choices = "Alley-oop";
            alleyOop();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void fastBreakFinishChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Drive to the basket");
    System.out.println("2. Go for an alley-oop");
    System.out.println("3. Pull-up for a jumper");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Drive to the basket";
            driveToBasket();
            break;
        case 2:
            choices = "Alley-oop";
            alleyOop();
            break;
        case 3:
            choices = "Pull-up jumper";
            pullUpJumper();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void hustlePlayChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Dive for the loose ball");
    System.out.println("2. Go for the steal");
    System.out.println("3. Try to block the shot");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Dive for the loose ball";
            diveForBall();
            break;
        case 2:
            choices = "Go for the steal";
            stealBall();
            break;
        case 3:
            choices = "Try to block the shot";
            blockShot();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}

public void pickAndPopChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("1. Set the screen and pop for a jumper");
    System.out.println("2. Set the screen and roll to the basket");
    System.out.println("3. Slip the screen and drive to the basket");

    System.out.print("Enter your choice (1/2/3): ");
    int userChoice = scanner.nextInt();

    switch (userChoice) {
        case 1:
            choices = "Pop for a jumper";
            pullUpJumper();
            break;
        case 2:
            choices = "Roll to the basket";
            driveToBasket();
            break;
        case 3:
            choices = "Slip the screen";
            driveToBasket();
            break;
        default:
            System.out.println("Invalid choice. Try again.");
    }
}
    
    }





