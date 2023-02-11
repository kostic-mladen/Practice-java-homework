package Homework;

import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {

        //3. Napraviti proizvoljan niz brojeva, zatim uneti preko Scanner-a neki broj,
        // i u novom nizu smestiti sve brojeve koji su veci od tog unetog broja
        // (Obratiti paznju da nov niz nema prazna polja tj 0).

        Scanner scan = new Scanner(System.in);

        int[] niz1 = {3, 27, 31, 58, 1002, -9, 10589, 19, -659};
        int brojeviIzNiza1 = 0;

        System.out.print("Unesite neki broj: ");
        int broj = scan.nextInt();

        for (int i = 0; i < niz1.length; i++) {
            if (broj < niz1[i]) {
                brojeviIzNiza1++;
            }
        }

        int[] niz2 = new int[brojeviIzNiza1];

        int brojeviIzNiza2 = 0;
        for(int i = 0; i < niz1.length; i++) {
            if (broj < niz1[i]) {
                niz2[brojeviIzNiza2] = niz1[i];
                System.out.println(niz2[brojeviIzNiza2]);
                brojeviIzNiza2++;

            }
        }

        System.out.println("Drugi niz ima " + niz2.length + " člana čiji su brojevi veći od unetog broja " + broj + ".");
        System.out.println("Novi niz ima " + niz2.length);

    }
}
