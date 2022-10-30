package ders22_arraylists;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArraysAsList {
    public static void main(String[] args) {


        Integer[] arr = {1, 2, 3};

        // Verilen bir array`i liste cevirmek icin bir list olusturup forloop ile
        //  elemanlari tasimayi oneriyoruz

        List<Integer> arrayList = Arrays.asList(arr);

        // Bu yonte,in iki negatif yonu vardir
        // Bu sekilde olusturulan listler esnek uzunluga sahip degillerdir
        // add(), remove() gibi ozellikleri kullanamayiz, runtimeException aliriz
        // Bu yondem kaynak olan array ile olusturulan List`i` birbirine baglar
        // birinde yaptiginiz degisikligi, otomatik olarak digerine de yansitir,

        System.out.println("Aray:"+ Arrays.toString(arr));
        System.out.println("List : "+arrayList);

        // sadece arrayin bir elemanini degistirelim

        arr[0] = 10;
        System.out.println("Aray: degistirince"+ Arrays.toString(arr));

        System.out.println("Degisen Array List : "+arrayList);

    }
}