package ders19_arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMetodu {
    //Verilen bir int arraye istenen bir elemenyi ekleyin.
    //yeni halini bize donduren bir method olusturun.

    public static int[] arrayeElemanEkle(int[] eklenecekArr, int eklenecekSayi) {

        int[] yeniArr = new int[eklenecekArr.length];

        for (int i = 0; i < eklenecekArr.length; i++) {

            yeniArr[i] = eklenecekArr[i];
        }

        yeniArr[yeniArr.length - 1] = eklenecekSayi;

        return yeniArr;

    }

    public static void main(String[] args) {

        int[] abc = {2, 5, 6, 8, 3};

        int eklenecekSayi = 1;

        abc = arrayeElemanEkle(abc, eklenecekSayi);

        System.out.println(Arrays.toString(abc));//[3, 5, 8, 1]

    }

}
