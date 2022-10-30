package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_SetGetMetodu {
    public static void main(String[] args) {

        /* get() Metodu listemizdeki elemanlari getirir.
       Java`da set() `u update icin kullanilir, var olan bir elementi degistirir.
       add() liste eleman ekleyip eski elemanlarda bir degisiklik yapmaz, ama set()`u boyle degil

       list.set(index, yenideger) metodu istenen indexdeki eski degeri silip bize dondurur ve
       o index`e verdigimiz yeni degeri atar
  */

        List<Integer> liste = new ArrayList<>();
        int[] arr = {3, 6, 1, 8, 4, 9};

        for (int i = 0; i < arr.length; i++) {
            liste.add(arr[i]);
        }

        //eski degeri gormek istersek

        int eskiDeger = liste.set(1,4);
        System.out.println(eskiDeger);

        liste.set(0, 8);
        liste.set(1, 9);

        System.out.println(liste);


    }
}
