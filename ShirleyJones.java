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

        // Actual Code
        InputFunctions.enterGame();        
        InputFunctions.locationInputMethod(); // Creates a scanner, gets the input, and stores it in the variable globalVariables.chosenLocation

        // Tests
        Dialogues.printCluesList();

        globalVariables.foundClueOne.clueDesc = globalVariables.firstClue.clueDesc;
        System.out.println(globalVariables.foundClueOne.clueDesc);
    }


    // Classes

    public class globalVariables { // Global Variables Class: General Variables that I don't know where to put
        static String chosenLocation; // Where the chosenLocation gets stored
        static String enterGameResponse;

        // Initializations
        static Clue firstClue = new Clue("This is the first Clue.");
        static Clue secondClue = new Clue("This is the second Clue");
        static Clue thirdClue = new Clue("This is the third Clue.");
        static Clue fourthClue = new Clue("This is the fourth Clue.");
        static Clue fifthClue = new Clue("This is the fifth Clue.");

        static Clue foundClueOne = new Clue("None");
        static Clue foundClueTwo = new Clue("None");
        static Clue foundClueThree = new Clue("None");
        static Clue foundClueFour = new Clue("None");
        static Clue foundClueFive = new Clue("None");


        static Player userPlayer = new Player("Your Office", 0);
        static Clue[] cluesList = {foundClueOne, foundClueTwo, foundClueThree, foundClueFour, foundClueFive};

        static NPC currentNPC = Suspects.martha;

    }

    public class Suspects {
        // NPCs
        static NPC martha = new NPC("Martha", "O'Sullivan", false, 25, "Martha's House", "Red", "Hazel", "5'5");
        static NPC david = new NPC("David", "Alvarez", false, 48, "La Panaderia", "Black", "Brown", "5'8");
        static NPC layla = new NPC("Layla", "Amin", false, 18, "Al'Amin Corner Store", "Black", "Brown", "5'3");
        static NPC jason = new NPC("Jason", "Brith", false, 56, "Jason's Home", "Blond", "Blue", "5'10");
        static NPC daria = new NPC("Daria", "Gillian", false, 33, "Fun and Flowers", "Brown", "Blue-Gray", "5'4");
        static NPC ember = new NPC("Ember", "Huxley", false, 19, "Community Center", "Black", "Brown", "5'9");
        static NPC vivienne = new NPC("Vivienne", "Moreau", false, 22, "Moreau Mansion", "Black", "Hazel", "5'5");
        static NPC emmanuella = new NPC("Emmanuella", "Choi", false, 20, "Yap Square Skate Park", "Brown", "Brown", "5'4");
        static NPC sade = new NPC("Sade", "Adelogun", false, 23, "Studio of the Stars", "Black", "Brown", "5'10");
        static NPC matyas = new NPC("Matyas", "Horvath", false, 43, "5th Avenue Event Center", "Gray", "Blue", "5'8");
    }
    // Dialogues Class

    public class Dialogues {
        static void playerDescription() { // Description of Shirley Jones
            System.out.println("Your name is Shirley Jones. You are a detective from Old Yap City. You are investigating the murder of Cimani, a celebrity who was found dead later last night.");
        }
        static void printLocations() { // 7 Current Locations out of 11
            System.out.print("Where do you want to go? Enter the number for the location you want to go to. 1) Your Office, 2) Martha's House, 3) La Panaderia, 4) Al'Amin Corner Store, 5) Officer Jason's Home, 6) Fun and Flowers, 7) Community Center, 8) Moreau Mansion, 9) Yap Square Skate Park, 10) Studio of the Stars, 11) 5th Street Event Venue: ");
        }

        static void printNewClue() { // When the player gets a new clue, print this
            System.out.println("You got a new clue! Go to your office to look over your list of clues.");
        }

        static void printCluesList() {
            System.out.println("Clue 1: " + globalVariables.cluesList[0].clueDesc);
            System.out.println("Clue 2: " + globalVariables.cluesList[1].clueDesc);
            System.out.println("Clue 3: " + globalVariables.cluesList[2].clueDesc);
            System.out.println("Clue 4: " + globalVariables.cluesList[3].clueDesc);
            System.out.println("Clue 5: " + globalVariables.cluesList[4].clueDesc);
        }

        static void officeDescription() {
            System.out.println("\n");
            System.out.println("You enter your office. Now you can review your list of gathered clues in peace.");
        }

        static void marthaHomeDescription() {
            System.out.println("null");
        }
        static void davidBakeryDescription() {
            System.out.println("null");
        }

        static void laylaStoreDescription() {
            System.out.println("null");
        }

        static void jasonHomeDescription() {
            System.out.println("null");
        }

        static void dariaFlowerDescription() {
            System.out.println("null");
        }

        static void emberCommunityDescription() {
            System.out.println("null");
        }

        static void vivienneMoreauMansionDescription() {

        }
        
        static void emmanuellaSkateParkDescription(){

        }

        static void sadePhotoDescription(){
            System.out.println("You approach a photo studio, a midnight-color building decorated with stars of varying sizes and shapes. The lit sign in the front of the building says \"Studio of the Stars.\"");
        }

        static void matyasEventVenue(){

        }


    }

    public class InputFunctions {
        static void locationInputMethod() {
            Scanner inputLocation = new Scanner(System.in);
            Dialogues.printLocations();
            globalVariables.chosenLocation = inputLocation.nextLine();

            if (globalVariables.chosenLocation.equals("1")){
                // Office
                Dialogues.officeDescription();            
                globalVariables.userPlayer.location = "Your Office";
                globalVariables.currentNPC = null;

            } else if(globalVariables.chosenLocation.equals("2")) { 
                // Martha
                Dialogues.marthaHomeDescription();
                globalVariables.currentNPC = Suspects.martha;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if(globalVariables.chosenLocation.equals("3")) {
                // David
                Dialogues.davidBakeryDescription();
                globalVariables.currentNPC = Suspects.david;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;   

            } else if(globalVariables.chosenLocation.equals("4")) {
                // Layla
                Dialogues.laylaStoreDescription();
                globalVariables.currentNPC = Suspects.layla;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if(globalVariables.chosenLocation.equals("5")) {
                // Jason
                Dialogues.jasonHomeDescription();
                globalVariables.currentNPC = Suspects.jason;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if(globalVariables.chosenLocation.equals("6")) {
                // Daria
                Dialogues.dariaFlowerDescription();
                globalVariables.currentNPC = Suspects.daria;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            
            } else if(globalVariables.chosenLocation.equals("7")) {
                // Ember
                Dialogues.emberCommunityDescription();
                globalVariables.currentNPC = Suspects.ember;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if (globalVariables.chosenLocation.equals("8")){
                // Vivienne
                Dialogues.vivienneMoreauMansionDescription();
                globalVariables.currentNPC = Suspects.vivienne;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if (globalVariables.chosenLocation.equals("9")){
                // Emmanuella
                Dialogues.emmanuellaSkateParkDescription();
                globalVariables.currentNPC = Suspects.emmanuella;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if (globalVariables.chosenLocation.equals("10")){
                // Sade
                Dialogues.sadePhotoDescription();
                globalVariables.currentNPC = Suspects.sade;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else if (globalVariables.chosenLocation.equals("11")){
                // Matyas
                Dialogues.matyasEventVenue();
                globalVariables.currentNPC = Suspects.matyas;
                globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;

            } else {
                System.out.println("Invalid input. Try again.");
                InputFunctions.locationInputMethod();
            }
        }
        static void enterGame() {
            System.out.print("Welcome to Shirley Jones, a murder mystery game where you have to find out who killed the beloved star, Cimani. Press the enter key to play.");
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
        int numberOfClues;

        public Player(String location, int numberOfClues){
            this.location = location;
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
        String questioningLocation;
        String hairColor;
        String eyeColor;
        String height;

        public NPC(String firstName, String lastName, boolean isKiller, int age, String questioningLocation, String hairColor, String eyeColor, String height){
            this.firstName = firstName;
            this.lastName = lastName;
            this.isKiller = isKiller;
            this.age = age;
            this.questioningLocation = questioningLocation;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.height = height;
        }
    }










}