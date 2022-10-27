package ders18_arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        System.out.println(arr[2]);//6      2.indexteki eleman

        arr[3] = 20;

        System.out.println(arr[3]);//20
        System.out.println(arr.length);//5

       //son elemani
        System.out.println(arr[arr.length-1]);//10

//arrayin tume elemanlari
        System.out.println(Arrays.toString(arr));//[2, 4, 6, 20, 10]
//yada
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");//2 4 6 20 10
        }
//arrayin uzunlugu sonradan degistirilemez

        arr[5] = 35;// Index 5 out of bounds for length 5 >>hatasi verir
        //bu hata CTE degil>>>> run time error verir






    }
}
