package AnthonyWeek5;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class HangMan2 {
    static String line32;
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

            fileReader = new FileReader("src/AnthonyWeek5/Words.txt");
            reader = new BufferedReader(fileReader);
            String lineIn = reader.readLine();
            line32 = Files.readAllLines(Paths.get("src/AnthonyWeek5/Words.txt")).get(randomState);
            reader.close();
            System.out.println(line32); // safety check
            availableLetters(line32);
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
        returnPlayer(userName);
    }

    public static void returnPlayer(String userName) throws IOException {
        System.out.println("checking the GuestBooks ... " );
        System.out.println(userName);
        File file = new File("AnthonyWeek5/HighScore.txt");
//        BufferedWriter newUser = new BufferedWriter(new FileWriter("AnthonyWeek5/HighScore.txt"));
//        BufferedReader returnGuest = new BufferedReader(new FileReader("AnthonyWeek5/HighScore.txt"));
    }

    public static void retrieveScore (String userName){
        //if highScore.contains(userName)
        //.get line #2 of high score
    }

    public static void availableLetters(String stateName){
        Border border = new LineBorder(Color.RED, 13);
        Border border2 = new LineBorder(Color.decode("#03fc98"), 13);

        JFrame instructions = new JFrame();
        JButton theRules = new JButton(stateName);
        theRules.setBorder(border);
        instructions.setVisible(true);
        instructions.setLocation(0,0);
        instructions.setSize(390, 300);
        theRules.setBackground(Color.BLUE);
        theRules.setForeground(Color.WHITE);
        theRules.setBounds(5, 5, 50, 30);
        theRules.setFont(new Font("Arial", Font.PLAIN, 16));
        instructions.add(theRules);
        instructions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instructions.setExtendedState(JFrame.ICONIFIED);
    }

}

