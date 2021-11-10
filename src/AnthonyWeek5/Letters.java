package AnthonyWeek5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Letters extends JPanel {
    static Letters letters;
    static JFrame frame;
    static JPanel panel;
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

        panel = new JPanel();
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
        JLabel A = new JLabel("<html><span style='font-size:20px'>"+"A"+"</span></html>");
        dynamicLetters.add(A);
        JLabel B = new JLabel("<html><span style='font-size:20px'>"+"B"+"</span></html>");
        dynamicLetters.add(B);
        JLabel C = new JLabel("<html><span style='font-size:20px'>"+"C"+"</span></html>");
        dynamicLetters.add(C);
        JLabel D = new JLabel("<html><span style='font-size:20px'>"+"D"+"</span></html>");
        dynamicLetters.add(D);
        JLabel E = new JLabel("<html><span style='font-size:20px'>"+"E"+"</span></html>");
        dynamicLetters.add(E);
        JLabel F = new JLabel("<html><span style='font-size:20px'>"+"F"+"</span></html>");
        dynamicLetters.add(F);
        JLabel G = new JLabel("<html><span style='font-size:20px'>"+"G"+"</span></html>");
        dynamicLetters.add(G);
        JLabel H = new JLabel("<html><span style='font-size:20px'>"+"H"+"</span></html>");
        dynamicLetters.add(H);
        JLabel I = new JLabel("<html><span style='font-size:20px'>"+"I"+"</span></html>");
        dynamicLetters.add(I);
        JLabel J = new JLabel("<html><span style='font-size:20px'>"+"J"+"</span></html>");
        dynamicLetters.add(J);
        JLabel K = new JLabel("<html><span style='font-size:20px'>"+"K"+"</span></html>");
        dynamicLetters.add(K);
        JLabel L = new JLabel("<html><span style='font-size:20px'>"+"L"+"</span></html>");
        dynamicLetters.add(L);
        JLabel M = new JLabel("<html><span style='font-size:20px'>"+"M"+"</span></html>");
        dynamicLetters.add(M);
 //@ get second row started
        JLabel N = new JLabel("<html><span style='font-size:20px'>"+"N"+"</span></html>");
        dynamicLetters2.add(N);
        JLabel O = new JLabel("<html><span style='font-size:20px'>"+"O"+"</span></html>");
        dynamicLetters2.add(O);
        JLabel P = new JLabel("<html><span style='font-size:20px'>"+"P"+"</span></html>");
        dynamicLetters2.add(P);
        JLabel Q = new JLabel("<html><span style='font-size:20px'>"+"Q"+"</span></html>");
        dynamicLetters2.add(Q);
        JLabel R = new JLabel("<html><span style='font-size:20px'>"+"R"+"</span></html>");
        dynamicLetters2.add(R);
        JLabel S = new JLabel("<html><span style='font-size:20px'>"+"S"+"</span></html>");
        dynamicLetters2.add(S);
        JLabel T = new JLabel("<html><span style='font-size:20px'>"+"T"+"</span></html>");
        dynamicLetters2.add(T);
        JLabel U = new JLabel("<html><span style='font-size:20px'>"+"U"+"</span></html>");
        dynamicLetters2.add(U);
        JLabel V = new JLabel("<html><span style='font-size:20px'>"+"V"+"</span></html>");
        dynamicLetters2.add(V);
        JLabel W = new JLabel("<html><span style='font-size:20px'>"+"W"+"</span></html>");
        dynamicLetters2.add(W);
        JLabel X = new JLabel("<html><span style='font-size:20px'>"+"X"+"</span></html>");
        dynamicLetters2.add(X);
        JLabel Y = new JLabel("<html><span style='font-size:20px'>"+"Y"+"</span></html>");
        dynamicLetters2.add(Y);
        JLabel Z = new JLabel("<html><span style='font-size:20px'>"+"Z"+"</span></html>");
        dynamicLetters2.add(Z);
        solution.add(new JLabel("<html><c>"+"Your word has: "+ stateName.length() +" letters"+"</c></html>"));

    }

    public static void testPanelRemoval(char chosenLetter){
        // declare each Alphabet JLabel separately so that it has a specific identifier. Then it can be removed
        //then, either label.setText("_"); to leave a space in the list, or,

        //Container parent = label7.getParent();
        //parent.remove(label7);
        //parent.validate();
        //parent.repaint(); to completely remove the letter's position from the shown list

    }

}
