import java.util.Scanner;
import java.util.List;

// Comments...
// Overview: This project is a command line mystery game. You play as a detective named Shirley Jones who lives in Old Yap City.

/*
Notes:


*/
// To do: Figure out how to randomize which NPC is a suspect during every play.

public class ShirleyJones {
    public static void main(String[] args){
        // Initializations
        Clue firstClue = new Clue("This is the first Clue.");
        Clue secondClue = new Clue("This is the second Clue");
        Clue thirdClue = new Clue("This is the third Clue.");
        Clue fourthClue = new Clue("This is the fourth Clue.");

        Player userPlayer = new Player("Your Office", 100, 0);
        Clue[] cluesList = {firstClue, secondClue, thirdClue, fourthClue};

        // Actual Code

        // Scanners
        

        // Tests
        System.out.println(userPlayer.health); // Prints Player Health (checks if I properly set up the player class)
        System.out.println(cluesList[0].clueDesc); // Prints the first clue's description (makes sure that I can access the description through using the index of the clue + a method)
        InputFunctions.locationInputMethod(); // Creates a scanner, gets the input, and stores it in the variable globalVariables.chosenLocation
        validationFunctions.checkLocationInput(); // This checks the globalVariables.chosenLocation variable and prints a statement depending on that location number

    }


    // Classes

    public class globalVariables { // Global Variables Class: General Variables that I don't know where to put
        static String chosenLocation; // Where the chosenLocation gets stored
    }

    // Dialogues Class

    public class Dialogues {
        static void playerDescription() { // Description of Shirley Jones
            System.out.println("Your name is Shirley Jones. You are a detective from Old Yap City. You are investigating a murder that occurred a couple of days ago.");
        }
        static void printLocations() { // 7 Current Locations out of 11
            System.out.println("Where do you want to go? Enter the number for the location you want to go to. 1) Your Office, 2) Martha's House, 3) David's Bakery, 4) Layla's Corner Store, 5) Officer Jason's Home, 6) Daria's Flower Shop, 7) Community Center: ");
        }

        static void printNewClue() { // When the player gets a new clue, print this
            System.out.println("You got a new clue! Go to your office to look over your list of clues.");
        }

        static void officeDescription() {
            System.out.println("You enter your office. Now you can review your list of gathered clues in peace.");
        }
    }

    public class InputFunctions {
        static void locationInputMethod() {
            Scanner inputLocation = new Scanner(System.in);
            globalVariables.chosenLocation = inputLocation.nextLine();
        }
    }

    public class validationFunctions{
        static void checkLocationInput(){
            if (globalVariables.chosenLocation.equals("1")){
                Dialogues.officeDescription();
            }
        }
    }
    // Player Class
    static class Player {
        String location;
        int health;
        int numberOfClues;

        public Player(String location, int health, int numberOfClues){
            this.location = location;
            this.health = health;
            this.numberOfClues = numberOfClues;
        }
    }

    // Clue Class

    static class Clue {
        String clueDesc;

        public Clue(String clueDesc){
            this.clueDesc = clueDesc;
        }
    }

    // NPC Class

    static class NPC {
        String name;
        boolean isKiller;
        int age;
        String address;

        public NPC(String name, boolean isKiller, int age, String address){
            this.name = name;
            this.isKiller = isKiller;
            this.age = age;
            this.address = address;
        }
    }










}