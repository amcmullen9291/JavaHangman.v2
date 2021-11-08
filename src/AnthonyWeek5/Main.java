package AnthonyWeek5;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        final Date accountOpen = new Date();
        System.out.println(accountOpen);
        System.out.println("Your Budget Manager");
        Scanner signInOption = new Scanner(System.in);
        String response = signInOption.nextLine();
        String patternString = ".*[A-Za-z]{1}.*";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(response);
        boolean matches = matcher.matches();
        if(matches && response.length() == 1){ // need ot either 1 or 2
            // if statement
            // code for sign in prompt
            //code for accepting user input >> encoded Hash to send to txt file0
        }
//        sign in uses .contains to find existing member
    }
}

//if you want, have an admin option to search for existing customers
// to more represent real life


// customers can search for transaction history by date
