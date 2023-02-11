package Homework;

import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {

        //napraviti program gde cete uneti neki broj i
        //kao rezultat vratiti zbir svih njegovih prethodnih brojeva

        Scanner scan = new Scanner(System.in);

        System.out.print("Unesite neki broj: ");

        int broj = scan.nextInt();
        int suma = 0;

        for (int i = 0; i < broj; i++) {
            suma = suma + i;
        }

        System.out.print("Suma predhodnih brojeva je " + suma);

    }
}
