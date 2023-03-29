package com.roxannnna.learning.exception;

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.String;

public class BoxPrice {
    public static void main(String[] args) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Jaka ma być cena pudełka? ");
        String boxPriceIn = keybord.next();

        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Ile mamy pudełek? ");
        String numBoxesIn = keybord.next();
        try {
            int numBoxes = Integer.parseInt(numBoxesIn);
            int boxPrice = Integer.parseInt(boxPriceIn);
            if (numBoxes < 0 | numBoxes > 1000 | boxPrice < 0){
                throw new OutOfRangeException();

            }
            System.out.println("Ich wartość to ");
            System.out.println(currency.format(numBoxes * boxPrice));
        } catch (NumberFormatException e) {
            System.out.println("Niepoprawnie wprowadzono dane. ");
        } catch (OutOfRangeException e) {
            System.out.println(numBoxesIn);
            System.out.println("To niemożliwe! Któraś z danych jest zbyt niska lub zbyt wysoka.");
        }
        keybord.close();

    }
}
