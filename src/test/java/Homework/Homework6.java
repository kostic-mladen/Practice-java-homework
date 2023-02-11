package Homework;

import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {

        //2.Napraviti program gde unosite svoju godinu rodjenja i
        //ispisati broj prestupnih godina od vaseg rodjenja do tekuce godine.

        Scanner scan = new Scanner(System.in);
        System.out.print("Unesite vašu godinu rođenja: ");
        int godinaRodjenja = scan.nextInt();

        int i = godinaRodjenja;
        int brojPrestupnihGodina = 0;

        for (i = godinaRodjenja; i <= 2022; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                brojPrestupnihGodina++;
            }
        }
        System.out.println("Broj prestupnih godina od godine rođenja do trenutne godine je " + brojPrestupnihGodina + ".");
    }
}
