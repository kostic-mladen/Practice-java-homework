package Homework;

import java.util.Scanner;

public class Homework12 {

    public static void main(String[] args) {

        //2. Napraviti niz brojeva, gde cete svaki neparan broj povecati za 2.

        Scanner scan = new Scanner(System.in);

        int[] nizBrojeva = {22,3,19,95,31,96,1003,115,999,85,66,77};


        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 != 0)
                nizBrojeva[i]=nizBrojeva[i] + 2;
                System.out.println(nizBrojeva[i]);

        }
    }
}
