package Homework;

import java.util.ArrayList;

public class Homework14 {

    public static void main(String[] args) {

        // Napraviti proizvoljan niz brojeva, podeliti ih u dve liste,
        // jedna lista ce u sebi sadrzati sve parne brojeve dok ce druga lista zadrzati sve neparne brojeve.


        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> listaParnihBrojeva = new ArrayList<>();
        ArrayList<Integer> listaNeparnihBrojeva = new ArrayList<>();

        for (int i = 0; i < nizBrojeva.length; i++) {
            if (nizBrojeva[i] % 2 == 0) {
                listaParnihBrojeva.add(nizBrojeva[i]);
            } else {
                listaNeparnihBrojeva.add(nizBrojeva[i]);
            }
        }

        System.out.println("Lista parnih brojava" + listaParnihBrojeva);
        System.out.println("----------------------------");
        System.out.println("Lista neparnih brojeva " + listaNeparnihBrojeva);

    }
}

