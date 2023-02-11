package Homework;

import java.util.Scanner;

public class Homework11 {

    public static void main(String[] args) {
        //1. Unesite velicinu niza,
        // zatim uneti brojeve koji ce se nalaziti u nizu, na kraju
        // treba ispisati najveci broj od onih koje smo uneli.

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite veličinu niza: ");
        int velicinaNiza = scan.nextInt();

        int nizBrojeva[] = new int[velicinaNiza];

        for (int i = 0; i < nizBrojeva.length; i++) {
            System.out.print("Unesite " + (i + 1) + ". član niza: ");
            nizBrojeva[i] = scan.nextInt();
        }

        int najveciBroj = nizBrojeva[0];

        for (int i = 1; i < nizBrojeva.length; i++)
            if (najveciBroj < nizBrojeva[i]) {
                najveciBroj = nizBrojeva[i];

            }
        System.out.println("Najveći broj u nizu je " + najveciBroj);

    }
}