package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_Remove {
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();

        int[] arr = {3, 6, 1, 8, 4, 9};

        for (int i = 0; i < arr.length; i++) {

            liste.add(arr[i]);
        }

        // remove() `u listede bulunan elemani indexine gore siler

        liste.remove(3);

        System.out.println(liste);


    }
}
