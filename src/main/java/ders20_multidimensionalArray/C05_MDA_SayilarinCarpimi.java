package ders20_multidimensionalArray;

import java.security.PublicKey;

public class C05_MDA_SayilarinCarpimi {


    //Soru 4- Verilen 2 katli bir array`de bulunan
    //tum sayilarin carpimi bize donnduren bir method olusturun.

    public static int elementlerinCarpimi(int[][] arr) {

        int carpim = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                carpim *= arr[i][j];
            }
        }
        return carpim;

    }

    public static void main(String[] args) {

        int[][] arr = {{5, 7}, {5, 8, 9}, {3, 1}};

        System.out.println(elementlerinCarpimi(arr));

    }
}