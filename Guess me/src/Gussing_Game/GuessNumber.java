package Gussing_Game;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber extends Game{
    static Scanner in = new Scanner(System.in);
    public int inputInt(String message){
        System.out.print(message);
        return in.nextInt();
    }

    public void start(){
        System.out.println("Guess the number game started");
    }

    public void guess(){
        System.out.println("Guess the number");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess = 0;
        while (guess != number){
            guess = inputInt("Enter your guess(0 to exit): ");
            if (guess == 0){
                System.out.println(number + " was the number :<");
                break;
            }
            if (guess == number){
                System.out.println("Hurray!! You finally found the number");
                break;
            }
            else if (number - 10 < guess && guess < number){
                System.out.println("Close to the number but behind");
            }
            else if (number < guess && guess < number + 10){
                System.out.println("Close to the number but ahead");
            }
            else if (number - 20 < guess && guess < number + 20){
                System.out.println("Far from the number");
            }
            else if (number - 30 < guess && guess < number + 30){
                System.out.println("Too Far from the number");
            }
            else{
                System.out.println("Number is eternal far");
            }
        }
        
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        GuessNumber guessNumber = new GuessNumber();
        guessNumber.guess();
    }
}
