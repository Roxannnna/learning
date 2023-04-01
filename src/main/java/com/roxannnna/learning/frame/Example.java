package com.roxannnna.learning.frame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Example {
        public static void main(String[] args) {
            List<Person> personList = new ArrayList<>();

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

            JLabel ageLabel = new JLabel("Age: ");
            ageLabel.setBounds(10, 75,  60, 20);
            JTextField ageTextField = new JTextField(30);
            ageTextField.setBounds(80, 75, 300, 20);

            JLabel genderLabel = new JLabel("Gender: ");
            genderLabel.setBounds(10, 100,  60, 20);
            String[] genderArray = {" ","Female", "Male", "Other" };
            JComboBox genderComboBox = new JComboBox(genderArray);
            genderComboBox.setBounds(80, 100, 300, 20);

            JButton saveButton = new JButton("Save");
            saveButton.setBounds(10, 150, 100, 20);

            JLabel printLabel = new JLabel();
            printLabel.setBounds(10, 200,  400, 200);
            JButton printButton = new JButton("Print All");
            printButton.setBounds(10, 175, 100, 20);


            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String age = ageTextField.getText();
                    try {
                        int ageInt = Integer.parseInt(age);
                        Person person = new Person(nameTextField.getText(),surnameTextField.getText(),ageInt,genderComboBox.getSelectedItem().toString());
                        if (person.getName().isEmpty() || person.getSurname().isEmpty()){
                            printLabel.setText("Proszę wpisać poprawne dane!");
                            printLabel.setForeground(Color.RED);
                        } else {
                            personList.add(person);
                            FileSaver fileSaver = new FileSaver();
                            fileSaver.save(person);
                        }
                    } catch (NumberFormatException ex){
                        printLabel.setText("Proszę wpisać poprawny wiek!");
                        printLabel.setForeground(Color.RED);
                    }
                    catch (FileNotFoundException ex){
                        ex.printStackTrace();
                    }
                    nameTextField.setText("");
                    surnameTextField.setText("");
                    ageTextField.setText("");
                }
            });
            printButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    printLabel.setText("People: " + personList);
                    printLabel.setForeground(Color.BLACK);
                }
            });

            JPanel panel = new JPanel();
            panel.setLayout(null);
            panel.add(nameLabel);
            panel.add(nameTextField);
            panel.add(surnameLabel);
            panel.add(surnameTextField);
            panel.add(ageLabel);
            panel.add(ageTextField);
            panel.add(saveButton);
            panel.add(printLabel);
            panel.add(printButton);
            panel.setBackground(Color.LIGHT_GRAY);
            panel.add(genderLabel);
            panel.add(genderComboBox);

            frame.add(panel);
            frame.setVisible(true);
        }
    }
