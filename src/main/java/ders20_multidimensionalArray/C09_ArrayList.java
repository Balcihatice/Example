package ders20_multidimensionalArray;

import ders18_arrays.C06_KullaniciyaArrayOlusturtma;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C09_ArrayList {
    public static void main(String[] args) {

        // object olusturmek istedigimizde Scanner kullandik
        Scanner scan = new Scanner(System.in);

        // object olusturmek istedigimizde Method kullandik
        C06_KullaniciyaArrayOlusturtma obj1 = new C06_KullaniciyaArrayOlusturtma();

        //  List`lerden object olustururken dikkat edilecekler:
        //  i) List primitive data kabul etmez
        //  ii) List bir interface oldugu icin direk object olusturulamaz
        //  onun yerine sag taraf ArrayList<>() yazariz

        List<Integer> number = new ArrayList<>();

        //List`e eleman ekleme:

        number.add(3);
        number.add(5);
        number.add(8);

        // List`imizi Yazdirmak istersek:

        System.out.println(number);


    }
}
