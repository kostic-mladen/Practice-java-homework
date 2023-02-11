package Homework;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        //2. Napisati program gde unosimo zanr neke knjige (Romantika, Triler, Horor, Krimi)
        // nakon toga, uneti neku godinu izdanja knjige,
        // ukoliko su Triler i Romantika
        //starija od 30 godina, onda treba ispisati poruku da zanr knjige vise nije na lageru, takodje
        //ako je Horor stariji od 40 godina i ako je Krimi starije od 20 godina,
        //ukoliko zanr nije stariji od ogranicenja, ispisati poruku da je zanr knjige na lageru.

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite željeni žanr knjige Romantika, Triler, Horor ili Krimi: ");
        String zanrKnjige = scan.nextLine().toLowerCase();

        System.out.print("Unesite godinu izdanja knjige: ");
        int godinaIzdanja = scan.nextInt();

        int trenutnaGodina = 2022;

        int starostIzdanja = trenutnaGodina - godinaIzdanja;

        switch (zanrKnjige) {

            case "romantika", "triler":
                if (starostIzdanja <= 30) {
                    System.out.println("Žanr " + zanrKnjige + " je na lageru.");
                } else {
                    System.out.println("Žanr " + zanrKnjige + " nije na lageru.");
                }
                break;

            case "horor":
                if (starostIzdanja <= 40) {
                    System.out.println("Žanr " + zanrKnjige + " je na lageru.");
                } else {
                    System.out.println("Žanr " + zanrKnjige + " nije na lageru.");
                }
                break;

            case "krimi":
                if (starostIzdanja <= 20) {
                    System.out.println("Žanr " + zanrKnjige + " je na lageru.");
                } else {
                    System.out.println("Žanr " + zanrKnjige + " nije na lageru.");
                }
                break;
            default:
                System.out.println("Ne postoji podatak o datom žanru!");
                break;
        }

    }
}
