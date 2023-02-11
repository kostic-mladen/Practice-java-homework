package Homework;

public class Homework1 {

    public static void main(String[] args) {

        /*1.Napraviti program gde cete uneti informacije o nekom vocu
        tako sto cete kreirati String za naziv nekog voca i double vrednost za njegovu cenu.
        Uneti 4 naziva i 4 cene za odredjeno voce, i u svakom redu posebno stampati naziv vocke
        i njenu cenu za 30% snizenu. */

        String voce1, voce2, voce3, voce4;
        double x, y, z,t;

        voce1 = "Limun";
        voce2 = "Jabuke";
        voce3 = "Banane";
        voce4 = "Kiwi";

        x = 199.99;
        y = 99.99;
        z = 219.99;
        t = 249.99;

        System.out.println(voce1 + " sa popustom od 30% je " + (x*0.7)+".");
        System.out.println(voce2 + " sa popustom od 30% su " + (y*0.7)+".");
        System.out.println(voce3 + " sa popustom od 30% su " + (z*0.7)+".");
        System.out.println(voce4 + " sa popustom od 30% je " + (t*0.7)+".");

    }
}
