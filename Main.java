import java.util.Random;
import java.util.Scanner;

class Game{
    int storeNum;
    int numOfGuesses;
    int userInput;
    int score;
    boolean isCorrect = false;

    Game(){
        Random random = new Random();
        storeNum =random.nextInt(100);
        numOfGuesses = 0;
    }

    void takeUserInput(){
        System.out.print("Enter a number: ");
        Scanner In = new Scanner(System.in);
        userInput = In.nextInt();
        numOfGuesses++;
    }

    boolean isNumberCorrect(){
        if (storeNum==userInput){
            System.out.println("Correct! You guessed it right.");
            return true;
        }
        else if (storeNum>userInput){
            System.out.println("Too low!");
            return false;
        }
        else if (storeNum<userInput){
            System.out.println("Too high!");
            return false;
        }
        else{
            System.out.println("Invalid input!");
            return false;
        }
    }

    int getNoOfGuesses(){
        return numOfGuesses;
    }

    int gameScore(){
        score = 100-getNoOfGuesses()*10;
        return score;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        char playAgain;
        System.out.println("===Guess the Number===");
        System.out.println("A random number is selected between 0 to 100 by the Computer." +
                "\nGuess the number within 10 tries.");
        do {
            Game game = new Game();
            System.out.println("\n---New Game---");
            while (!game.isCorrect && game.getNoOfGuesses() < 10) {
                game.takeUserInput();
                game.isCorrect = game.isNumberCorrect();
            }
            if (game.isCorrect) {
                System.out.println("You guessed in " + game.getNoOfGuesses() + " tries.");
                System.out.println("Your score: " + game.gameScore());
            }
            else {
                System.out.println("Sorry! You've used all 10 tries. The number was: " + game.storeNum);
            }
            System.out.print("Do you want to play again (yes/no): ");
            playAgain = In.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
    }
}