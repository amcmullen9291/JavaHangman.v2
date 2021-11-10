package AnthonyWeek5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Letters extends JPanel {
    static Letters letters;
    static JFrame frame;
    static JPanel dynamicLetters;
    static JPanel dynamicLetters2;
    static JPanel solution;


    public void letters() {
//        frame = new JFrame("BattleShip v2- available letters");
////        frame.setVisible(true);
//        frame.setSize(390, 300);
//        frame.setLocation(5,10);
        dynamicLetters = new JPanel();
        dynamicLetters2 = new JPanel();
        solution = new JPanel();
        dynamicLetters.setBounds(5, 10, 390, 150);
        dynamicLetters2.setBounds(5, 100, 390, 100);
        solution.setBounds(5, 250, 390, 50);

        dynamicLetters.setBackground(Color.WHITE);
        dynamicLetters.setForeground(Color.WHITE);
        dynamicLetters.setFont(new Font("Arial", Font.PLAIN, 38));
        dynamicLetters2.setBackground(Color.WHITE);
        dynamicLetters2.setForeground(Color.WHITE);
        dynamicLetters2.setFont(new Font("Arial", Font.PLAIN, 38));
        solution.setBackground(Color.YELLOW);

        setLayout(new GridLayout());

        JFrame frame2 = new JFrame("HangMan v2 - available letters");
        frame2.setVisible(true);
        frame2.setSize(400, 300);
        frame2.setResizable(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(Color.GREEN);
        frame2.add(panel);
        panel.add(dynamicLetters);
        panel.add(dynamicLetters2);
        panel.add(solution);
        frame2.setVisible(true);
    }

    public static void availableLetters(String stateName){
        System.out.println("Its working; your state is: " + stateName);
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"A"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"B"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"C"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"D"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"E"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"F"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"G"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"H"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"I"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"J"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"K"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"L"+"</span></html>"));
        dynamicLetters.add(new JLabel("<html><span style='font-size:20px'>"+"M"+"</span></html>"));
 //@ get second row started
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"N"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"O"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"P"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"Q"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"R"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"S"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"T"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"U"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"V"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"W"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"X"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"Y"+"</span></html>"));
        dynamicLetters2.add(new JLabel("<html><span style='font-size:20px'>"+"Z"+"</span></html>"));
        solution.add(new JLabel("<html><c>"+"Your word has: "+ stateName.length() +" letters"+"</c></html>"));

    }

}
