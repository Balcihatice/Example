package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

       /*
       Verilen bir array`deki tekrar eden sayilari bir kere olacak sekilde array`i duzenleyin
        */

        int[] arr = {1, 2, 3, 4, 5, 2, 5, 7, 8, 9, 5, 7, 9};

        // Bu soruyu array`le yapmak yerine List ile yapalim
        // Tekrarsiz olanlari liste atalim ve liste`deki elementleri iceren bir array olusturun
        //  array`e deger olarak atayalim

        List<Integer> tekrarsizListe = new ArrayList<>();

        //Array`deki elemanlari kontrol edelim takrarsiz ise liste ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])) {

                tekrarsizListe.add(arr[i]);
            }
        }

        System.out.println(tekrarsizListe);

        //  arrayimizin yeni uzunlugunu belirleyelim

        arr = new int[tekrarsizListe.size()];

        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizListe.get(i); //listedeki elemanlari get() ile getirdik ve arr`ye atadik
        }

        System.out.println("Array`in tekrarsiz hali : " + Arrays.toString(arr));//[1, 2, 3, 4, 5, 7, 8, 9]


    }
}