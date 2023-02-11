package Homework;

import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {

        //Napraviti program gde cete uneti broj nekih knjiga na lageru, zatim svaki put kada unesete ".",
//on skida jednu knjigu sa lagera, tek nakon što se unese drugi strnig ili ponestaje knjiga na lageru
//izacice iz petlje i ispitati poruku: ukoliko je ponestajalo knjiga "nema više knjiga na lagaru",
//a ako je unet neki drugi string ispisuje se stanje na lageru

        Scanner scan = new Scanner(System.in);


        System.out.print("Unesite broj knjiga na lageru: ");
        int brojKnjigiaNaLageru = scan.nextInt();
        String tacka = ".";

        int brojKnjigiaNaLageruNovi = brojKnjigiaNaLageru;

        int i = 0;
        while (i < brojKnjigiaNaLageru) {
            System.out.print("Unesite tačku: ");
            tacka = scan.next();

            if (tacka.equals(".")) {
                brojKnjigiaNaLageruNovi = brojKnjigiaNaLageru-(i+1);
                ++i;
                System.out.println("Novo stanje na lageru je " + brojKnjigiaNaLageruNovi);
                if(brojKnjigiaNaLageruNovi==0){
                    System.out.println("Nema više knjiga na lageru");
                    break;
                }
            } else {
                System.out.println("Ostalo je još " + brojKnjigiaNaLageruNovi + " knjiga na lageru.");
                break;
            }

        }
    }
}

