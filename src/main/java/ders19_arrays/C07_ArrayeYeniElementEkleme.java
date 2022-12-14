package ders19_arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6};
        //Bu arraye 8 ekleyebilim

        /*
        Varola bir array`e yeni eleman eklenemez
        Ama
        Yeni deger atanabilir
         */
        //Yeni array olusturalim.
        //arr2 de int olacak
        //uzunlugu eskisinin bir fazlasi olacak

        int[] arr2 = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {

            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 0]

        arr2[arr2.length - 1] = 8;

        System.out.println(Arrays.toString(arr2));//[2, 4, 6, 8]

        arr = arr2;

        System.out.println("Arr nin son hali :" + Arrays.toString(arr));//Arr nin son hali :[2, 4, 6, 8]
    }


}
