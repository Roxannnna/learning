package com.roxannnna.learning.switchStatement;
import static java.lang.System.out;
import java.util.Scanner;
public class NumberOfDays {
    public static void main (String args []) {
        Scanner keybord = new Scanner(System.in);
        System.out.println("Wpisz nazwę miesiąca: ");
        String numberOfMth = keybord.next();
        //System.out.println("Wpisz czy rok przestępny, czy nieprzestępny.");
       // String luty = keybord.next("luty");
        switch (numberOfMth) {
            case "styczeń":
                System.out.println("31 dni.");
                break;
            case "luty":
                System.out.println("28 lub 29 dni.");
                break;
            case "marzec":
                System.out.println("31 dni.");
                break;
            case "kwiecień":
                System.out.println("30 dni.");
                break;
            case "maj":
                System.out.println("31 dni.");
                break;
            case "czerwiec":
                System.out.println("30 dni.");
                break;
            case "lipiec":
                System.out.println("31 dni.");
                break;
            case "sierpień":
                System.out.println("31 dni.");
                break;
            case "wrzesień":
                System.out.println("30 dni.");
                break;
            case "październik":
                System.out.println("31 dni.");
                break;
            case "listopad":
                System.out.println("30 dni.");
                break;
            case "grudzień":
                System.out.println("31 dni.");
                break;
            default:
                System.out.println("Nieprawidłowa nazwa miesiąca");
        }

     //   switch ("luty") {
     //       case "przestępny":
      //          System.out.println("29 dni.");
      //          break;
      //      case "nieprzestępny":
       //         System.out.println("28 dni.");
       //         break;
       // }
    }
}
