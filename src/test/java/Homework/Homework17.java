package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework17 {

    public static void main(String[] args) {

        //Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0.
        //Zatim cete uneti neki broj, pomocu metode napraviti novu listu koja ce u sebi
        //sadrzati sve brojeve vece od unetog broja. Novu listu pozvati
        //pomocu metode za stampanje elemenata liste.

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> listaBrojeva = new ArrayList<>();

        System.out.println("Pravite listu brojeva sve dok ne unesete 0. Unesite brojeve: ");
        int broj = scan.nextInt();

        while (broj != 0) {
            listaBrojeva.add(broj);
            broj = scan.nextInt();
        }

        System.out.println("Lista brojeva: ");

        for (int i = 0; i < listaBrojeva.size(); i++) {
            System.out.println(listaBrojeva.get(i));
        }

        System.out.println("Unesite neki broj: ");
        int broj2 = scan.nextInt();

        System.out.println("Nova lista brojeva koja sadrži brojeve veće od " + broj2 + " je ");

        stampanjeNoveListe(novaLista(listaBrojeva, broj2));

        System.out.println("Kraj programa.");
    }
    public static ArrayList<Integer> novaLista(ArrayList<Integer> listaBrojeva, int broj) {

        ArrayList<Integer> novaListaBrojeva = new ArrayList<>();

        for (int i = 0; i < listaBrojeva.size(); i++) {
            if (broj < listaBrojeva.get(i)) {
                novaListaBrojeva.add(listaBrojeva.get(i));
            }
        }
        return novaListaBrojeva;
    }
    public static void  stampanjeNoveListe (ArrayList<Integer> novaListaBrojeva) {

        for (int i = 0; i < novaListaBrojeva.size(); i++) {
            System.out.println(novaListaBrojeva.get(i));
        }
    }
}

