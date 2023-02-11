package Homework;

import java.util.Scanner;

public class Homework10 {

    public static void main(String[] args) {


        /*3. Napraviti program za korpu voca, izracunati sumu cena, ako znamo da jabuke kostaju 50 din,
        kruske 100 din i banane 140 din, tako da se suma racuna sve dok unosimo "jabuka" "banana" ili
        "kruska"(u zavisnosti koji string unesemo), toliko dodajemo na sumu, kada se unese ".",
        program izlazi iz petlje i pise ukupnu cenu navedenog voca.*/


        Scanner scan = new Scanner(System.in);

        int jabuka = 50;
        int kruska = 100;
        int banana = 140;

        int korpa = 0;

        int i = 1;
        while (i > 0) {
            System.out.print("Unesite jabuka, kruska ili banana: ");
            String voce = scan.next();

            if (voce.equals("jabuka")) {
                korpa = korpa + jabuka;
            } else if (voce.equals("kruska")) {
                korpa = korpa + kruska;
            } else if (voce.equals("banana")) {
                korpa = korpa + banana;
            }
            if (voce.equals(".")) {
                System.out.println("Zbir korpe je " + korpa);
                break;
            }
        }
    }
}
