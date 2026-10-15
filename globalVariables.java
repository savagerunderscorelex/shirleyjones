    public class globalVariables { // Global Variables Class: General Variables that I don't know where to put
        static String chosenLocation; // Where the chosenLocation gets stored

        // Initializations
        static Clue firstClue = new Clue("The killer runs a business.");
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