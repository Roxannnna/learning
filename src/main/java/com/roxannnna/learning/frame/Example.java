package com.roxannnna.learning.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class Example {
        public static void main(String[] args) {
            List<String> nameList = new ArrayList<>();
            List<String> surnameList = new ArrayList<>();

            JFrame frame = new JFrame("Title");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.setBounds(100, 200, 500, 500);

            JLabel nameLabel = new JLabel("Name: ");
            nameLabel.setBounds(10, 10, 60, 20);
            JTextField nameTextField = new JTextField(30);
            nameTextField.setBounds(80, 10,  300, 20);

            JLabel surnameLabel = new JLabel("Surname: ");
            surnameLabel.setBounds(10, 50,  60, 20);
            JTextField surnameTextField = new JTextField(30);
            surnameTextField.setBounds(80, 50, 300, 20);

            JButton saveButton = new JButton("Save");
            saveButton.setBounds(10, 100, 100, 20);

            JLabel printLabel = new JLabel();
            printLabel.setBounds(10, 200,  400, 200);
            JButton printButton = new JButton("Print All");
            printButton.setBounds(10, 150, 100, 20);


            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    nameList.add(nameTextField.getText());
                    surnameList.add(surnameTextField.getText());
                    nameTextField.setText("");
                    surnameTextField.setText("");
                    printLabel.setText("");
                }
            });
            printButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    printLabel.setText("Names: " + nameList + ", Surnames: " + surnameList);
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.add(nameLabel);
            panel.add(nameTextField);
            panel.add(surnameLabel);
            panel.add(surnameTextField);
            panel.add(saveButton);
            panel.add(printLabel);
            panel.add(printButton);
            panel.setBackground(Color.LIGHT_GRAY);

            frame.add(panel);
            frame.setVisible(true);
        }
    }
