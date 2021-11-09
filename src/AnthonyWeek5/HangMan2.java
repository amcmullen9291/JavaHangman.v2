package AnthonyWeek5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class HangMan2 {
    static String line32;
    static Letters letters = new Letters();
    static Round round;

    public static void main(String[] args) throws IOException {
        greeting();
        FileReader fileReader;
        BufferedReader reader;

        try {
//            Scanner s = new Scanner(new File("src/AnthonyWeek5/Words.txt"));
//            ArrayList<String> statesList = new ArrayList<String>();
            Random r = new Random();
            int low = 1;
            int high = 20;
            int randomState = r.nextInt(high-low) + low;
            letters.letters();
            fileReader = new FileReader("src/AnthonyWeek5/Words.txt");
            reader = new BufferedReader(fileReader);
            String lineIn = reader.readLine();
            line32 = Files.readAllLines(Paths.get("src/AnthonyWeek5/Words.txt")).get(randomState);
            reader.close();
            System.out.println(line32); // safety check
            letters.availableLetters(line32);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void greeting() throws IOException {
        System.out.println("Java HangMan v2");
        System.out.println();
        System.out.println("Enter your name to begin.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String userName = userInput.substring(0, 1).toUpperCase() + userInput.substring(1);
        System.out.println("Hello, " + userName);
        round.returnPlayer(userName);
        round.retrieveScore(userName);
    }

}

