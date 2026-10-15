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

}
    










