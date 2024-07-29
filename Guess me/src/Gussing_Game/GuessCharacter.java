package Gussing_Game;
import java.util.Scanner;
import java.util.Random;

public class GuessCharacter extends Game{
    static Scanner in = new Scanner(System.in);
    public char inputChar(String message){
        System.out.print(message);
        return in.next().charAt(0);
    }

    public void start(){
        System.out.println("Guess the character game started");
    }
    
    public void guess(){
        System.out.println("Guess the character");
        char character = (char)(new Random().nextInt(26) + 'a');
        char guess = ' ';
        while (guess != character){
            guess = inputChar("Enter your guess(0 to exit): ");
            if (guess == '0'){
                System.out.println(character + " was the character :<");
                break;
            }
            if (guess == character){
                System.out.println("Hurray!! You finally found the character");
                break;
            }
            else if (character - 1 == guess){
                System.out.println("Close to the character but behind");
            }
            else if (character + 1 == guess){
                System.out.println("Close to the character but ahead");
            }
            else{
                System.out.println("Character is eternal far");
            }
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        GuessCharacter guessCharacter = new GuessCharacter();
        guessCharacter.start();
    }
}
