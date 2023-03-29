package com.roxannnna.learning.javaForDummies;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    public static void main (String args[]){
       /* JFrame myFrame = new JFrame();
        String myTitle = "Valentine's Day";
        myFrame.setLayout(null);
        JPanel panel = new JPanel();
        myFrame.add(panel);
        myFrame.setTitle(myTitle);
        myFrame.setSize(600,400);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
        JButton button = new JButton("Click here!");
        button.setBounds(100,100,100,100);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknęłam");
            }
        });
        panel.add(button);
        JTextArea area = new JTextArea("Text Area\nText Area", 18,18);
        area.setEditable(false);
        myFrame.getContentPane().add(area);
        JLabel label = new JLabel();
        label.setText("Krystian Skinderowicz");
        panel.add(label); */
        JFrame f = new JFrame("label");

        // create a label to display text
        JLabel l = new JLabel();

        // add text to label
        l.setText("label text");

        // create a panel
        JPanel p = new JPanel();

        // add label to panel
        p.add(l);

        // add panel to frame
        f.add(p);
        JButton button = new JButton("Click here!");
        button.setBounds(100,100,100,100);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Kliknęłam");
            }
        });
        p.add(button);
        // set the size of frame
        f.setSize(300, 300);
        JTextArea area = new JTextArea("Text Area\nText Area", 18,18);
        area.setEditable(false);
        area.setBounds(200,200,100,100);
        f.getContentPane().add(area);
        f.show();

    }
}
