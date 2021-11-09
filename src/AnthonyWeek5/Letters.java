package AnthonyWeek5;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Letters extends JPanel {
    static Letters letters;
    JFrame frame;
    JButton nextButton = new JButton ("Next Screen");
    Border border = new LineBorder(Color.RED, 13);
    static JPanel dynamicLetters;
    static JPanel dynamicLetters2;

    public void letters() {
        frame = new JFrame("BattleShip v2- available letters");
        frame.setVisible(true);
        frame.setSize(390, 300);
        frame.setLocation(5,10);
        dynamicLetters = new JPanel();
        dynamicLetters2 = new JPanel();
        dynamicLetters.setBounds(5, 10, 390, 300);
        dynamicLetters2.setBounds(5, 10, 390, 300);
        dynamicLetters.setBackground(Color.YELLOW);
        dynamicLetters.setForeground(Color.BLACK);
        dynamicLetters.setFont(new Font("Arial", Font.PLAIN, 38));
        dynamicLetters2.setBackground(Color.YELLOW);
        dynamicLetters2.setForeground(Color.BLACK);
        dynamicLetters2.setFont(new Font("Arial", Font.PLAIN, 38));

        setLayout(new GridLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(dynamicLetters);
        frame.add(dynamicLetters2);
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
    }

}
