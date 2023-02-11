package Homework;

import java.util.Scanner;

public class Homework16 {

    public static void main(String[] args) {
        //Zadatak 1.
//Napraviti proizvoljan niz imena, zatim napraviti metod koji ce kao parametre primati niz imena i string koji zelimo da proverimo,
//ispisati poruku ukoliko se ime nalazi u nizu, obavestiti ako nije tu. (Ime za proveru vi unosite)

        String[] nizImena = {"Mladen", "Marijana", "Luka", "Vukasin"};

        Scanner scan = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = scan.next();

        proveraImena(nizImena, ime);
    }
    public static void proveraImena(String[] nizImena, String ime) {

        int brojac = 0; //brojač
        for(int i = 0; i < nizImena.length; i++) {
            if (nizImena[i].equals(ime)){
                brojac++;
            }
        }
        if(brojac > 0) {
            System.out.println("Ime " + ime + " se nalazi u nizu.");
        } else {
            System.out.println("Ime " + ime + " se ne nalazi u nizu.");
        }
    }
}