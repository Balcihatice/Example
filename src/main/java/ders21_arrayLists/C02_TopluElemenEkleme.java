package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_TopluElemenEkleme {

    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        // Tum sesli harfleri listeye ekleyin
        // Ekelenecek tum elementleri bir array olarak yazip foorLoop ile ekleyebiliriz

        String[] arr = {"a", "e", "i", "o", "u"};

        for (int i = 0; i < arr.length; i++) {

            harfler.add(arr[i]);
        }
        System.out.println(harfler);
    }
}
