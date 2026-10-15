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

    static void printCurrentNPCDetails() {
        System.out.println("You look at your notes, describing the suspect in front of you: \n");
        System.out.println(("First Name: " + globalVariables.currentNPC.firstName));
        System.out.println("Last Name: " + globalVariables.currentNPC.lastName);
        System.out.println("Hair Color: " + globalVariables.currentNPC.hairColor);
        System.out.println("Eye Color: " + globalVariables.currentNPC.eyeColor);
        System.out.println("Height: " + globalVariables.currentNPC.height);
        System.out.println("Age: " + globalVariables.currentNPC.age);
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
        System.out.println("Waiting at the front steps is a woman, a friend of Cimani's.");

    }

    static void matyasEventVenue(){

    }


}