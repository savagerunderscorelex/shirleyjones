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
        InputFunctions.enterGame();
        System.out.println(userPlayer.health); // Prints Player Health (checks if I properly set up the player class)
        System.out.println(cluesList[0].clueDesc); // Prints the first clue's description (makes sure that I can access the description through using the index of the clue + a method)
        InputFunctions.locationInputMethod(); // Creates a scanner, gets the input, and stores it in the variable globalVariables.chosenLocation
        validationFunctions.checkLocationInput(); // This checks the globalVariables.chosenLocation variable and prints a statement depending on that location number

    }


    // Classes

    public class globalVariables { // Global Variables Class: General Variables that I don't know where to put
        static String chosenLocation; // Where the chosenLocation gets stored
        static String enterGameResponse;
    }

    // Dialogues Class

    public class Dialogues {
        static void playerDescription() { // Description of Shirley Jones
            System.out.println("Your name is Shirley Jones. You are a detective from Old Yap City. You are investigating a murder that occurred a couple of days ago.");
        }
        static void printLocations() { // 7 Current Locations out of 11
            System.out.print("Where do you want to go? Enter the number for the location you want to go to. 1) Your Office, 2) Martha's House, 3) David's Bakery, 4) Layla's Corner Store, 5) Officer Jason's Home, 6) Daria's Flower Shop, 7) Community Center, 8) Moreau Mansion: ");
        }

        static void printNewClue() { // When the player gets a new clue, print this
            System.out.println("You got a new clue! Go to your office to look over your list of clues.");
        }

        static void officeDescription() {
            System.out.println("You enter your office. Now you can review your list of gathered clues in peace.");
        }

        static void marthaHomeDescription() {

        }
        static void davidBakeryDescription() {

        }

        static void laylaStoreDescription() {

        }

        static void jasonHomeDescription() {

        }

        static void dariaFlowerDescription() {

        }

        static void emberCommunityDescription() {

        }

        static void vivienneMoreauMansionDescription() {

        }
        
        static void emmanuellaSkateParkDescription(){

        }

        static void sadePhotoDescription(){

        }
    }

    public class InputFunctions {
        static void locationInputMethod() {
            Scanner inputLocation = new Scanner(System.in);
            Dialogues.printLocations();
            globalVariables.chosenLocation = inputLocation.nextLine();
            if (globalVariables.chosenLocation.equals("1")){
                Dialogues.officeDescription();
            } else if(globalVariables.chosenLocation.equals("2")) {
                Dialogues.marthaHomeDescription();
            } else if(globalVariables.chosenLocation.equals("3")) {
                Dialogues.davidBakeryDescription();
            } else if(globalVariables.chosenLocation.equals("4")) {
                Dialogues.laylaStoreDescription();
            } else if(globalVariables.chosenLocation.equals("5")) {
                Dialogues.jasonHomeDescription();
            } else if(globalVariables.chosenLocation.equals("6")) {
                Dialogues.dariaFlowerDescription();
            } else if(globalVariables.chosenLocation.equals("7")) {
                Dialogues.emberCommunityDescription();
            } else if (globalVariables.chosenLocation.equals("8")){
                Dialogues.vivienneMoreauMansionDescription();
            } else if (globalVariables.chosenLocation.equals("9")){
                Dialogues.emmanuellaSkateParkDescription();
            } else if (globalVariables.chosenLocation.equals("10")){
                Dialogues.sadePhotoDescription();
            }
        }
        static void enterGame() {
            System.out.println("Welcome to Shirley Jones, a murder mystery game where you have to find out who killed the beloved star, Cimani. Press enter to play.");
            Scanner enterKey = new Scanner(System.in);
            globalVariables.enterGameResponse = enterKey.nextLine();
            if (globalVariables.enterGameResponse.equals("")){
                System.out.println("You have entered the game.");
            } else {
                System.out.println("Invalid input. Try again.");
                InputFunctions.enterGame();
            }
        }
    }

    public class validationFunctions{
        static void checkLocationInput(){

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
        String firstName;
        String lastName;
        boolean isKiller;
        int age;
        String address;

        public NPC(String firstName, String lastName, boolean isKiller, int age, String address){
            this.firstName = firstName;
            this.lastName = lastName;
            this.isKiller = isKiller;
            this.age = age;
            this.address = address;
        }
    }










}