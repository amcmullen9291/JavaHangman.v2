package AnthonyWeek5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HangMan2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader;
        BufferedReader reader;

        try {
//            Scanner s = new Scanner(new File("src/AnthonyWeek5/Words.txt"));
//            ArrayList<String> statesList = new ArrayList<String>();
            Random r = new Random();
            int low = 1;
            int high = 50;
            int randomState = r.nextInt(high-low) + low;

            fileReader = new FileReader("src/AnthonyWeek5/Words.txt");
            reader = new BufferedReader(fileReader);
            String lineIn = reader.readLine();
            String line32 = Files.readAllLines(Paths.get("src/AnthonyWeek5/Words.txt")).get(randomState);
            reader.close();
            System.out.println(line32);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

