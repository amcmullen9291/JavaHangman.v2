package AnthonyWeek5;

import javax.lang.model.element.Element;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.lang.annotation.ElementType;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Character.toUpperCase;
import static javax.swing.JLabel.*;

public class Round {

    static String userName;
    static int score;
    static Letters lettersClass;
    static JLabel labels;
    static JFrame frames;

    public void round(String userName, int score ){
        this.userName = userName;
        this.score = 0;
    }

    public static void returnPlayer(String userName) throws IOException {
        System.out.println("checking the GuestBooks ... " );
        System.out.println();
        File file = new File("AnthonyWeek5/HighScore.txt");

        try {
            BufferedReader returnGuest = new BufferedReader(new FileReader("src/AnthonyWeek5/HighScore.txt"));
            if (returnGuest.readLine().contains(userName)){
                System.out.println("welcome back, " + userName);
                returnGuest.close();
            }else{
                try{
                    BufferedWriter newUser = new BufferedWriter(new FileWriter("src/AnthonyWeek5/HighScore.txt"));
                    newUser.write(userName);
                    System.out.println("Oh, a first timer, ha ha...");
                    newUser.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }

        public static void retrieveScore (String userName){
        //if highScore.contains(userName)
        //.get line #2 of high score
    }

    public static void beginGame(String secretWord){
        char[] letters = new char[secretWord.length()];

        System.out.println("JAVA - HANGMAN (written by Anthony)");
        System.out.println("Your Word:");

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
//                            lettersClass.chosenLetter(letter);
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
        }
        System.out.println("Exiting Hangman...");
    }

}
