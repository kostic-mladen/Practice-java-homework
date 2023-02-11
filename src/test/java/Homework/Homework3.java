package Homework;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        //1. Napisati program gde cete uneti velicinu majice: 24( Ispise: S velicina),
        // 30cm(Ispise: M Velicina),
        //36cm (ispise: L velicina), 42cm(ispise: XL velicina)
        // u suprotnom izbaciti gresku o nepostojecoj velicini.

        Scanner scan=new Scanner(System.in);

        System.out.print("Unesite veličinu majce 24cm, 30cm, 36cm ili 42cm: ");
        String velicinaMajce=scan.nextLine();

        switch (velicinaMajce){

            case "24cm":
                System.out.println("S veličina");
                break;
            case "30cm":
                System.out.println("M veličina");
                break;

            case "36cm":
                System.out.println("L veličina");
                break;

            case "42cm":
                System.out.println("XL veličina");
                break;

            default:
                System.out.println("Veličina nepostoji!");
                break;

        }

    }
}
