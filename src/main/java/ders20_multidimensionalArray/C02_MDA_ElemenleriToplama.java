package ders20_multidimensionalArray;

public class C02_MDA_ElemenleriToplama {
    public static void main(String[] args) {

        //Tek katli array toplami nasildi, hatirlayalim

        int[] arr1 = {3, 4, 5, 6};

        int toplam = 0;

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] += arr1[i];

        }
        System.out.println(toplam);

        //Simdi toplami sifirlayip MultiDimensional Aarray nasil toplanir gorelim

        toplam = 0;

        int[][] arr = {{1, 2}, {3, 4, 5}, {7}};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];

            }
        }


    }
}
