package AnthonyWeek5;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    public static void beginGame(String secretWord){
        System.out.println("Your Word:");
        char[] letters = new char[secretWord.length()];
        Arrays.fill(letters, '_');
        System.out.println(letters);

        int lives = 5;
        int lettersLeft = secretWord.length();
        String usersGuess = "";

        Scanner scanner = new Scanner(System.in);
        while (lives > 0 && lettersLeft > 0) {
            System.out.print("Guesses remaining: ");
            for (int i = 0; i < lives; i++) {
                System.out.print("X");
            }

            System.out.println();

            System.out.println("Guess a letter.");
            System.out.println("The secret word is: " + secretWord);
            try {
                usersGuess = scanner.nextLine();
            }catch(Exception e){
                System.out.println("An error occurred.");
            }

            String patternString = ".*[A-Za-z]{1}.*";
            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(usersGuess);
            boolean matches = matcher.matches();
            boolean isCorrect = false;
            try {
                if (matches && usersGuess.length() == 1) {
                    char letter = Character.toLowerCase(usersGuess.charAt(0));
                    System.out.println("You chose: " + letter); // case test
                    for (int x = 0; x < secretWord.length(); x++) {
                        if (secretWord.charAt(x) == letter) {
                            letters[x] = letter;
                            System.out.println(letters);
                            System.out.println(" ");
                            isCorrect = true;
                            --lettersLeft;
                            if (lettersLeft == 0) {
                                System.out.println("Congratulations!");
                                System.exit(0);
                            }
                        }
                    }
                    if (!isCorrect) {
                        --lives;
                        System.out.println(letters);
                        System.out.println(" ");
                    }
                } else {
                    System.out.println("That was not a letter. Please select one letter, A-Z.");
                    usersGuess = scanner.nextLine();
                    Matcher matcher2 = pattern.matcher(usersGuess);
                    boolean matches2 = matcher2.matches();
                    if (matches2 && usersGuess.length() == 1) {
                        char letter = Character.toLowerCase(usersGuess.charAt(0));
                        System.out.println("You chose: " + letter); //case check
                        for (int x = 0; x < secretWord.length(); x++) {
                            if (secretWord.charAt(x) == letter) {
                                letters[x] = letter;
                                System.out.println(letters);
                                System.out.println(" ");
                                isCorrect = true;
                                --lettersLeft;
                            }
                        }
                        if (!isCorrect) {
                            --lives;
                            System.out.println(letters);
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("GOODBYE!");
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.out.println("Error loading... ");
            }
            if (lives == 0) {
                System.out.println("Out of guesses.");
            }
            System.out.println("Exiting Hangman...");
        }
    }

}
