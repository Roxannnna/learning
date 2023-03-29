package com.roxannnna.learning.exception;

public class FileNotFndExc extends Throwable {
    public static void main(String[] args) {
      /*  Scanner diskScanner = null;
        try {
            diskScanner = new Scanner(new File("numbers.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int[] numerators = new int[5];
        int[] denominators = new int[5];

        int i = 0;
        while (diskScanner.hasNextInt()) {
            try {
                numerators[i] = diskScanner.nextInt();
                denominators[i] = diskScanner.nextInt();
                i++;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Array index " + i + " is out of bounds.");
            } catch (InputMismatchException e) {
                System.out.println
                        ("Attempt to read a value that's not an integer");
            }
            i++;
        }


        for (int j = 0; j < numerators.length; j++) {
            try {
                System.out.println(numerators[j] / denominators[j]);
                System.out.println(numerators[j] / denominators[j]);
            } catch (ArithmeticException e) {
                System.out.println("Divide by zero on array index " + i);
            }
            diskScanner.close();
        }*/
    }
}
