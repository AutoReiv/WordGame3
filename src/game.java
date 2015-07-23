import java.util.Random;
import java.util.Scanner;

public class game {

	 //declaring variables
    int lives , secretNumber, playerGuess;
    String playerName;
    Scanner inputScanner;
    
    
    game() { // constructor
        lives = 3; //Initializing Life count to 3
    }
    
    //Method to get the player's Name
    public void getPlayerName(){
        System.out.print("Enter your name : ");
        inputScanner = new Scanner(System.in); //Scanner to take input from user
        String playerName = inputScanner.nextLine(); //take player's name
        System.out.println("Welcome "+playerName); //Greet the player
        System.out.println("Current Life Count: "+lives); //print current life count
    }
    
    //Method to generate a random number
    public void  generateRandomNumber(){
        Random randomGenerator = new Random(); //Java's in built Random object
        secretNumber = randomGenerator.nextInt(9)+1; //Assign random number (1-9)
    }
    
    //Method to get player's guess
    public void getPlayerGuess(){
        
        System.out.print("Please Enter your guess (1-9) : ");
        playerGuess = inputScanner.nextInt(); // ask player's guess
        
        System.out.println(); //new blank line
        
        
        //check if the guess is right or wrong
        if (secretNumber==playerGuess) { //if player's guess is equal to computer's guess
            System.out.println("Such Guess, Much talent, Wow");
            //show the number guessed by the computer
            System.out.println("Computer guessed the number: "+secretNumber);
            //show what player guessed
            System.out.println("You guessed the number: "+playerGuess);
            System.out.println("Current Life Count: "+lives); //print current life count
        }else{
            System.out.println("LOL, Nope");
            //show the number guessed by the computer
            System.out.println("Computer guessed the number: "+secretNumber);
            //show what player guessed
            System.out.println("You guessed the number: "+playerGuess);
            lives = lives - 1; // When guess is wrong, decrease life count by 1
            System.out.println("Current Life Count: "+lives); //print current life count
            }
        
        if (lives==0) { //check if life count is equal to zero
            System.out.println("GAME OVER... GG ");
        }
    }
    
    //<ethod to create a game loop
    public void gameLoop(){
        while (lives > 0) { //while loop to repeat game until life becomes zero
            generateRandomNumber(); //perform random number generation 
            System.out.println(); //put a new line
            getPlayerGuess(); //perform asking player for guess
        }
    }
    
    public static void main(String[] args) {
        game day5 = new game(); //initialize the object
        day5.getPlayerName(); //call the getPlayerName method to ask player's name
        day5.gameLoop(); //perform game loop
 
    }
 
}