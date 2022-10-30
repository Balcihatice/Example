package ders20_multidimensionalArray;

public class C06_MDA_Soru {

    /*Verilen iki katli arrayde

    her bir inner array`in son elemenlerini toplamini yazdiran bir method olusturunuz

     */

    public static void sonElemenleriTopla(int[][] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam +=arr[i][arr[i].length-1];

        }

        System.out.println("Inner array`lerin son elementlerinin toplami : " + toplam);


    }

    public static void main(String[] args) {

         int[][] arr = {{5,7}, {5,8,9}, {6,3}};

         sonElemenleriTopla(arr);

    }


}
