package Homework;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        //1. Napraviti program gde unosite neki broj i kao rezultat vracate njegov faktorijel.

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");
        int broj = scan.nextInt();

        int faktorijel = 1;

        for (int i = 1; i <= broj; i++) {

            faktorijel = faktorijel * i;
        }

        System.out.println("Faktorijel od broja " + broj + " je " + faktorijel + ".");
    }
}