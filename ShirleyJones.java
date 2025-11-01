import java.util.Scanner;
import java.util.List;


// Comments...
// Overview: This project is a command line mystery game. You play as a detective named\ Shirley Jones who lives in Old Yap City.

/*
Notes:

 */

// TODO: Figure out how to randomize which NPC is a suspect during every play.

public class ShirleyJones {
    public static void main(String[] args){
        // Tests

        // Actual Code

    }


    // Classes

    // Dialogues Class

    public class Dialogues {
        static void playerDescription() {
            System.out.println("Your name is Shirley Jones. You are a detective from Old Yap City. You are investigating a murder that occurred a couple of days ago.");
        }

        static void chooseLocation() {
            System.out.println("Where do you want to go? 1) Your Office, 2) Martha's House, 3) David's Bakery, 4) Layla's Corner Store, 5) Officer Jason's Home, 6) Daria's Flower Shop: ");
            Scanner locationScanner = new Scanner(System.in);
            String choosenLocation = locationScanner.nextLine();
        }
    }

    // Player Class

    public class Player {
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

    public class Clue {
        String clueDesc;

        public Clue(String clueDesc){
            this.clueDesc = clueDesc;
        }
    }

    // NPC Class

    public class NPC {
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