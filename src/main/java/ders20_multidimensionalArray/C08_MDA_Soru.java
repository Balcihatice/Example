package ders20_multidimensionalArray;

import java.util.Arrays;

public class C08_MDA_Soru {

/*
   Verilen iki katli bir array`de her bir inner array elementleri toplayip
   yeni olusturacagimiz tek katli array`e bu toplamlari atayalim

   input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}}
   output :    [10,3,12,10,9]

  */

    public static void main(String[] args) {

        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};

        int[] brr = new int[arr.length];

        int innerArrToplami = 0;

        for (int i = 0; i < arr.length; i++) {  //outer array`deki inner array`i kontol eder

            for (int j = 0; j < arr[i].length; j++) {  //inener array`i kontrol eder.

                innerArrToplami += arr[i][j];

            }
            brr[i] = innerArrToplami;

            innerArrToplami = 0;
        }
        System.out.println(Arrays.toString(brr));
    }

}
