package AnthonyWeek5;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.beans.XMLDecoder;
import java.io.ByteArrayInputStream;
import java.util.HashMap;

public class Letters extends JPanel {
    static Letters letters;
    static JFrame frame;
    static JFrame frame2;
    static JPanel panel;
    static JPanel dynamicLetters;
    static JPanel dynamicLetters2;
    static JPanel solution;
    static JLabel[] sortedLabels = new JLabel[26];
    static HashMap<Character, JLabel> sortedHash = new HashMap<Character, JLabel>();


    public void letters() {
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

        frame2 = new JFrame("HangMan v2 - available letters");
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
        sortedLabels[0] = A;
        sortedHash.put('A',A); //GET VALUE OF KEY -> VAR.SETtEXT(" ");
        JLabel B = new JLabel("<html><span style='font-size:20px'>"+"B"+"</span></html>");
        dynamicLetters.add(B);
        sortedLabels[1] = B;
        sortedHash.put('B',B);
        JLabel C = new JLabel("<html><span style='font-size:20px'>"+"C"+"</span></html>");
        dynamicLetters.add(C);
        sortedLabels[2] = C;
        sortedHash.put('C',C);
        JLabel D = new JLabel("<html><span style='font-size:20px'>"+"D"+"</span></html>");
        dynamicLetters.add(D);
        sortedLabels[3] = D;
        sortedHash.put('D',D);
        JLabel E = new JLabel("<html><span style='font-size:20px'>"+"E"+"</span></html>");
        dynamicLetters.add(E);
        sortedLabels[4] = E;
        sortedHash.put('E',E);
        JLabel F = new JLabel("<html><span style='font-size:20px'>"+"F"+"</span></html>");
        dynamicLetters.add(F);
        sortedLabels[5] = F;
        sortedHash.put('F',F);
        JLabel G = new JLabel("<html><span style='font-size:20px'>"+"G"+"</span></html>");
        dynamicLetters.add(G);
        sortedLabels[6] = G;
        sortedHash.put('G',G);
        JLabel H = new JLabel("<html><span style='font-size:20px'>"+"H"+"</span></html>");
        dynamicLetters.add(H);
        sortedLabels[7] = H;
        sortedHash.put('H',H);
        JLabel I = new JLabel("<html><span style='font-size:20px'>"+"I"+"</span></html>");
        dynamicLetters.add(I);
        sortedLabels[8] = I;
        sortedHash.put('I',I);
        JLabel J = new JLabel("<html><span style='font-size:20px'>"+"J"+"</span></html>");
        dynamicLetters.add(J);
        sortedLabels[9] = J;
        sortedHash.put('J',J);
        JLabel K = new JLabel("<html><span style='font-size:20px'>"+"K"+"</span></html>");
        dynamicLetters.add(K);
        sortedLabels[10] = K;
        sortedHash.put('K',K);
        JLabel L = new JLabel("<html><span style='font-size:20px'>"+"L"+"</span></html>");
        dynamicLetters.add(L);
        sortedLabels[11] = L;
        sortedHash.put('L',L);
        JLabel M = new JLabel("<html><span style='font-size:20px'>"+"M"+"</span></html>");
        dynamicLetters.add(M);
        sortedLabels[12] = M;
        sortedHash.put('M',M);
        //@ get second row started
        JLabel N = new JLabel("<html><span style='font-size:20px'>"+"N"+"</span></html>");
        dynamicLetters2.add(N);
        sortedLabels[13] = N;
        sortedHash.put('N',N);
        JLabel O = new JLabel("<html><span style='font-size:20px'>"+"O"+"</span></html>");
        dynamicLetters2.add(O);
        sortedLabels[14] = O;
        sortedHash.put('O',O);
        JLabel P = new JLabel("<html><span style='font-size:20px'>"+"P"+"</span></html>");
        dynamicLetters2.add(P);
        sortedLabels[15] = P;
        sortedHash.put('P',P);
        JLabel Q = new JLabel("<html><span style='font-size:20px'>"+"Q"+"</span></html>");
        dynamicLetters2.add(Q);
        sortedLabels[16] = Q;
        sortedHash.put('Q',Q);
        JLabel R = new JLabel("<html><span style='font-size:20px'>"+"R"+"</span></html>");
        dynamicLetters2.add(R);
        sortedLabels[17] = R;
        sortedHash.put('R',R);
        JLabel S = new JLabel("<html><span style='font-size:20px'>"+"S"+"</span></html>");
        dynamicLetters2.add(S);
        sortedLabels[18] = S;
        sortedHash.put('S',S);
        JLabel T = new JLabel("<html><span style='font-size:20px'>"+"T"+"</span></html>");
        dynamicLetters2.add(T);
        sortedLabels[19] = T;
        sortedHash.put('T',T);
        JLabel U = new JLabel("<html><span style='font-size:20px'>"+"U"+"</span></html>");
        dynamicLetters2.add(U);
        sortedLabels[20] = U;
        sortedHash.put('U',U);
        JLabel V = new JLabel("<html><span style='font-size:20px'>"+"V"+"</span></html>");
        dynamicLetters2.add(V);
        sortedLabels[21] = V;
        sortedHash.put('V',V);
        JLabel W = new JLabel("<html><span style='font-size:20px'>"+"W"+"</span></html>");
        dynamicLetters2.add(W);
        sortedLabels[22] = W;
        sortedHash.put('W',W);
        JLabel X = new JLabel("<html><span style='font-size:20px'>"+"X"+"</span></html>");
        dynamicLetters2.add(X);
        sortedLabels[23] = X;
        sortedHash.put('X',X);
        JLabel Y = new JLabel("<html><span style='font-size:20px'>"+"Y"+"</span></html>");
        dynamicLetters2.add(Y);
        sortedLabels[24] = Y;
        sortedHash.put('Y',Y);
        JLabel Z = new JLabel("<html><span style='font-size:20px'>"+"Z"+"</span></html>");
        dynamicLetters2.add(Z);
        sortedLabels[25] = Z;
        sortedHash.put('Z',Z);
        solution.add(new JLabel("<html><c>"+"Your word has: "+ stateName.length() +" letters"+"</c></html>"));
    }


    public static void chosenLetter(char letterChoice){
        JLabel placeholder = sortedHash.get(letterChoice);
        placeholder.setText(" ");
        }

    }

