package Homework;

import java.util.Scanner;

public class Homework2 {

    public static void main(String[] args) {

        //2.Napraviti program gde cete uneti svoju godinu rodjenja,
        // trenutnu godinu i u konzoli istampati svoj broj godina.

        Scanner scan = new Scanner(System.in);

        int godinaRodjenja, trenutnaGodina;

        System.out.print("Unesite vašu godinu rođenja: ");
        godinaRodjenja= scan.nextInt();

        System.out.print("Unesite trenutnu kalendarsku godinu: ");
        trenutnaGodina= scan.nextInt();

        System.out.println("Vaš broj godina je " + (trenutnaGodina-godinaRodjenja) +".");

    }
}
