package AnthonyWeek5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class HangMan2 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("src/AnthonyWeek5/Words.txt");
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();
            String statesList = new String(data, "UTF-8");
            System.out.println(statesList);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

