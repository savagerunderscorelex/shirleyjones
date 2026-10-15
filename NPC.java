public class NPC {
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