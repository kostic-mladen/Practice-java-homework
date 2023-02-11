package Homework;

import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");

        int broj = scan.nextInt();
        int suma = 0;

        int i = 0;
        while (i < broj) {
            suma = suma + i;
            i++;
        }
        System.out.print("Zbir predhodnih brojeva je " + suma);

    }
}
