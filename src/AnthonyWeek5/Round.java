package AnthonyWeek5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Round {

    static String userName;
    static int score;
    static Letters letterClass;
    static int gamesWon;
    static int newScore;
    static int newGamesWonTotal;

    public void round(String userNamed ){
        this.userName = userNamed;
        this.score = score;
        this.gamesWon = gamesWon;
    }

    public static void returnPlayer(String userNamed){
        userName = userNamed;
        System.out.println("checking the GuestBooks ... " );
        File file = new File("src/AnthonyWeek5/HighScore.txt");
        try{
            List cachedName = Files.readAllLines(Paths.get("src/AnthonyWeek5/UserName.txt"));
//            System.out.println(cachedName.get(0));
//            System.out.println(cachedName.getClass().getSimpleName());
//            System.out.println(userNamed);
            String name = (String) cachedName.get(0);
            if(!name.equals(userNamed)){
                try{
                    BufferedWriter resetScore = new BufferedWriter(new FileWriter(file));
                    resetScore.write(String.valueOf(0));
                    resetScore.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                try{
                    BufferedWriter resetGamesTotal = new BufferedWriter(new FileWriter("src/AnthonyWeek5/GamesWon.txt"));
                    resetGamesTotal.write(String.valueOf(0));
                    resetGamesTotal.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
                try{
                    BufferedWriter resetName = new BufferedWriter(new FileWriter("src/AnthonyWeek5/UserName.txt"));
                    resetName.write(userNamed);
                    resetName.close();
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        }catch(IOException e){
            e.printStackTrace();
        }
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
                            letterClass.chosenLetter(letter);
                            isCorrect = true;
                            --lettersLeft;
                            if (lettersLeft == 0) {
                                System.out.println("Congratulations!");
                                saveUserScore();
                                System.exit(0);
                            }
                        }
                    }
                    if (!isCorrect) {
                        --lives;
                        letterClass.chosenLetter(letter);
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
                                letterClass.chosenLetter(letter);
                                System.out.println(letters);
                                System.out.println(" ");
                                isCorrect = true;
                                --lettersLeft;
                            }
                        }
                        if (!isCorrect) {
                            --lives;
                            letterClass.chosenLetter(letter);
                            System.out.println(letters);
                            System.out.println(" ");
                        }
                    } else {
                        System.out.println("GOODBYE!");
                        System.exit(0);
                    }
                }
            } catch (Exception e) {
                System.exit(0);
            }
            if (lives == 0) {
                System.out.println("Out of guesses.");
                System.exit(0);
            }
        }
    }
    public static void saveUserScore() throws IOException {
        int wordLength = HangMan2.line32.length();
       int roundScore = wordLength*50;
        String stringNewTotal = "";
        try {
            BufferedReader getScore = new BufferedReader(new FileReader("src/AnthonyWeek5/HighScore.txt"));
            int scoreGotten = Integer.parseInt(getScore.readLine());
            System.out.println("Current Total Points: " + scoreGotten);
            System.out.println("Points This Round: " + roundScore);
            int newTotal = scoreGotten+roundScore;
            System.out.println("New Total Points: " + newTotal);
            stringNewTotal = String.valueOf(newTotal);
            getScore.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            BufferedWriter setScore = new BufferedWriter(new FileWriter("src/AnthonyWeek5/HighScore.txt"));
            setScore.write(stringNewTotal);
            setScore.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        totalGamesWon();
    }

    public static void totalGamesWon() throws IOException {
        String winningStreakString = "";
        try{
            BufferedReader getGames = new BufferedReader(new FileReader("src/AnthonyWeek5/GamesWon.txt"));
            int gamesGotten = Integer.parseInt(getGames.readLine());
            System.out.println("===============");
            gamesGotten+=1;
            System.out.println("Current Winning Streak: " + gamesGotten);
            winningStreakString = String.valueOf(gamesGotten);
            getGames.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            BufferedWriter setWinningStreak = new BufferedWriter(new FileWriter("src/AnthonyWeek5/GamesWon.txt"));
            setWinningStreak.write(winningStreakString);
            setWinningStreak.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
