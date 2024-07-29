package Gussing_Game;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static int choice = 0;
    public static void main(String args[])
    {
        while(choice != 99){
            System.out.println("--------------Menu---------------");
            System.out.println("1. Guess the Number");
            System.out.println("2. Guess the Character");
            System.out.println("3. Guess the word");
            System.out.println("99. Exit");
            System.out.println("---------------------------------");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    GuessNumber guessNumber = new GuessNumber();
                    guessNumber.start();
                    guessNumber.guess();
                    break;
                case 2:
                    GuessCharacter guessCharacter = new GuessCharacter();
                    guessCharacter.start();
                    guessCharacter.guess();
                    break;
                case 3:
                    GuessWord guessWord = new GuessWord();
                    guessWord.start();
                    guessWord.guess();
                    break;
                case 99:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
