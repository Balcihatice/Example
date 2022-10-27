package ders18_arrays;

import java.util.Arrays;

public class C03_ArrayelemanlariniArtirma {

    public static void main(String[] args) {
        //soru1: verilen bir arrayin elemanlarini 2 artip bize donduren bir method olusturun
        //Eski array`i yeni haliyle kaydedin

        int[] arr = {2, 4, 6, 8};

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] + 2;

        }
        System.out.println(Arrays.toString(arr)); //[4, 6, 8, 10]


        arr = elementleriIkiArtir(arr);
        System.out.println(Arrays.toString(arr));
        //Eski array`i yeni haliyle kaydedin
    }

    public static int[] elementleriIkiArtir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 2;
        }
        return arr;
    }


}
