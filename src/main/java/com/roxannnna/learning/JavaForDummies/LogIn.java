package com.roxannnna.learning.JavaForDummies;

import javax.swing.JOptionPane;

public class LogIn {
    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Username: ");
        String password = JOptionPane.showInputDialog("Password: ");
        if (
                username != null && password != null &&
                (
                        (username.equals("Grzegorz"))||(username.equals("grzegorz")) && (password.equals("Brzęczyszczykiewicz"))||(password.equals("brzęczyszczykiewicz")) ||
                                (username.equals("Aurora"))||(username.equals("aurora")) && (password.equals("Borealis")) || (password.equals("borealis")) ||
                                (username.equals("Świnka"))||(username.equals("świnka")) && (password.equals("Peppa"))||(password.equals("peppa"))
                                )
                        )
        {
            JOptionPane.showMessageDialog(null, "Jesteś zalogowany");
        } else {
            JOptionPane.showMessageDialog(null,"Nie udało ci się zalogować");
        }
    }
}
