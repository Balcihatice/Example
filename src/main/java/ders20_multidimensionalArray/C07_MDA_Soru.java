package ders20_multidimensionalArray;

import java.util.Arrays;

public class C07_MDA_Soru {


    /*
    Soru 2 : Verilen 2 katli bir array  de ayni index  `e sahip elemenleri toplayip,
    yeni olusturacagimiz tek katli bir array`e bu toplamlari atayin.

    input:    int[][] arr = {{3,4,5} ,{2,3,6,7}};
    output:   [5,7,11]

     */
    public static void main(String[] args) {


        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}};

        // Iner 2 array olacagini ama bunlarin uzunluklarinin degisecegini kabul edecegiz

        int ortakIndexSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        System.out.println(ortakIndexSayisi);

        int[] ortakIndexToplamlariArr = new int[ortakIndexSayisi];

        for (int i = 0; i < ortakIndexToplamlariArr.length; i++) {

            ortakIndexToplamlariArr[i] = arr[0][i] + arr[1][i];

        }
        System.out.println(Arrays.toString(ortakIndexToplamlariArr));
    }

}
