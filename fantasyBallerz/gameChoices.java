package fantasyBallerz;


import java.util.*;

public class gameChoices implements storyLine{
    private String position;
    private String choices;


    @Override
    public String getPosition() {
        return position; 
    }
    @Override
    public String getName(){
        return "test";
    }
    public String getChoice() {
        return choices;  
    }

    public void inGameChoice() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Go for the point");
        System.out.println("2. Pass the ball");
        System.out.println("3. Get shifty and figure it out.");

        System.out.print("Enter your choice (1/2/3): ");
        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case 1:
                choices = "Shot";
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
                break;
            case 2:
                choices = "pass";
                if (random.nextInt(0, 3) == 2){
                System.out.println("you're teammate got the ball and scored");
                }
                else if (random.nextInt(0, 3) == 1){
                    System.out.println("A defender stole the ball and took it cost to cost, LOSER");
                }
                else {
                    System.out.println("You thought the referee was your teamate and threw the ball at him");
                }
                break;
            case 3:
                choices = "Get shifty and figure it out.";
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
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public static void main(String[] args) {
        userInputs test = new userInputs("test", 0, 0, 0, null);
        test.gameLoop();
    }
}




