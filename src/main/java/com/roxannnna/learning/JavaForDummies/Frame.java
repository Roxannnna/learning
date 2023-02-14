package com.roxannnna.learning.JavaForDummies;
import javax.swing.JFrame;
public class Frame {
    public static void main (String args[]){
        JFrame myFrame = new JFrame();
        String myTitle = "Valentine's Day";

        myFrame.setTitle(myTitle);
        myFrame.setSize(300,200);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
