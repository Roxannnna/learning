package com.roxannnna.learning.ifcondition;

import java.util.Scanner;

public class IfElse2 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int testscore = in.nextInt();
            char grade;

            if (testscore >= 90) {
                grade = 'A';
            } else if (testscore >= 80) {
                grade = 'B';
            } else if (testscore >= 70) {
                grade = 'C';
            } else if (testscore >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade = " + grade);
        }
    }