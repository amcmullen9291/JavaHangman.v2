package AnthonyWeek5;

import java.io.File;

public class Round {

    static String userName;
    static int score;

    public void round(String userName, int score ){
        this.userName = userName;
        this.score = 0;
    }

    public static void returnPlayer(String userName){
        System.out.println("checking the GuestBooks ... " );
        System.out.println(userName);
        File file = new File("AnthonyWeek5/HighScore.txt");
//       BufferedWriter newUser = new BufferedWriter(new FileWriter("AnthonyWeek5/HighScore.txt"));
//       BufferedReader returnGuest = new BufferedReader(new FileReader("AnthonyWeek5/HighScore.txt"));

    }

        public static void retrieveScore (String userName){
        //if highScore.contains(userName)
        //.get line #2 of high score
            System.out.println("Checking the score too.");
    }

}
