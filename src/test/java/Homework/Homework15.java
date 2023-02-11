package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework15 {

    public static void main(String[] args) {
        //2. Napraviti proizvoljnu listu imena, zatim uneti ime koje zelite da izbacite iz liste,
        // ispisati poruku u zavisnosti od toga da li je izbaceno ili ne, i da li se uopste nalazi u listi.

        Scanner scan = new Scanner(System.in);

        ArrayList<String> listaImena = new ArrayList<>();

        listaImena.add("mladen");
        listaImena.add("marijana");
        listaImena.add("ivana");
        listaImena.add("miloš");
        listaImena.add("luka");
        listaImena.add("vukašin");

        System.out.println("Lista imena ");

        for (int i = 0; i < listaImena.size(); i++) {
            System.out.println(listaImena.get(i));
        }
        System.out.println("----------------------------");

        System.out.println("Unesite neko ime: ");
        String ime = scan.nextLine().toLowerCase();

        int x = 0;
        for (int i = 0; i < listaImena.size(); i++) {
            if (listaImena.get(i).equals(ime)) {
                listaImena.remove(i);
                x = 1;
            }
        }
        System.out.println("Nova lista imena: ");

        for (int i = 0; i < listaImena.size(); i++) {
            System.out.println(listaImena.get(i));
        }
        System.out.println("------------------------");

        if (x == 1) {
            System.out.println("Ime je izbrisano.");
        } else {
            System.out.println("Ime nije na listi.");
        }
    }
}

