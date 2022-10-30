package ders22_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_TamBolenlerListesi {



       /*
       Kullanicidan bir tamsayi alip bu tamsayinin
       pozitif tam bolen tum pozitif tamsayilari bir liste
       olarak bize donduren bir method olusturunuz.
        */

    public static void main(String[] args) {

        int input = 120;

        System.out.println(tamBolenlerListesi(input));
    }

    public static List<Integer> tamBolenlerListesi(int input) {

        List<Integer> tamBolenler = new ArrayList<>();

        for (int i = 1; i <= input; i++) {

            if (input % i == 0) {

                tamBolenler.add(i);
            }
        }

        return tamBolenler;
    }


}
