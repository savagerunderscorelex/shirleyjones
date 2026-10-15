import java.util.*;

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
            Dialogues.printCurrentNPCDetails();

        } else if(globalVariables.chosenLocation.equals("3")) {
            // David
            Dialogues.davidBakeryDescription();
            globalVariables.currentNPC = Suspects.david;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if(globalVariables.chosenLocation.equals("4")) {
            // Layla
            Dialogues.laylaStoreDescription();
            globalVariables.currentNPC = Suspects.layla;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if(globalVariables.chosenLocation.equals("5")) {
            // Jason
            Dialogues.jasonHomeDescription();
            globalVariables.currentNPC = Suspects.jason;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if(globalVariables.chosenLocation.equals("6")) {
            // Daria
            Dialogues.dariaFlowerDescription();
            globalVariables.currentNPC = Suspects.daria;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();
        
        } else if(globalVariables.chosenLocation.equals("7")) {
            // Ember
            Dialogues.emberCommunityDescription();
            globalVariables.currentNPC = Suspects.ember;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if (globalVariables.chosenLocation.equals("8")){
            // Vivienne
            Dialogues.vivienneMoreauMansionDescription();
            globalVariables.currentNPC = Suspects.vivienne;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if (globalVariables.chosenLocation.equals("9")){
            // Emmanuella
            Dialogues.emmanuellaSkateParkDescription();
            globalVariables.currentNPC = Suspects.emmanuella;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if (globalVariables.chosenLocation.equals("10")){
            // Sade
            Dialogues.sadePhotoDescription();
            globalVariables.currentNPC = Suspects.sade;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else if (globalVariables.chosenLocation.equals("11")){
            // Matyas
            Dialogues.matyasEventVenue();
            globalVariables.currentNPC = Suspects.matyas;
            globalVariables.userPlayer.location = globalVariables.currentNPC.questioningLocation;
            Dialogues.printCurrentNPCDetails();

        } else {
            System.out.println("Invalid input. Try again.");
            InputFunctions.locationInputMethod();
        }
    }

    static void enterGame() {
        System.out.print("Welcome to Shirley Jones, a murder mystery game where you have to find out who killed the beloved star, Cimani. Press the enter key to play.");
        Scanner enterKey = new Scanner(System.in);
        String enterGameResponse = enterKey.nextLine();
        if (enterGameResponse.equals("")){
            System.out.println("You have entered the game.");
        } else {
            System.out.println("Invalid input. Try again.");
            InputFunctions.enterGame();
        }
    }
    static void officeInputMethod() {
        Scanner officeInput = new Scanner(System.in);
        System.out.print("What do you want to do? 1) Review Clues List, 2) Declare Who's Guilty, 3) Leave Your Office: ");
        System.out.println(" ");
        String officeChoice = officeInput.nextLine();
        if (officeChoice.equals("1")){
            Dialogues.printCluesList();
            InputFunctions.officeInputMethod();
        } else if (officeChoice.equals("2")){
            
        } else if (officeChoice.equals("3")){
            System.out.println("You leave your office. \n");
            InputFunctions.locationInputMethod();
        } else {
            System.out.println("Invalid input. \n");
            InputFunctions.officeInputMethod();
        }


    }
}
