package ders18_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {


        String[] arr = {"Ali", "Kemal", "Hasan"};
        //Bu arrayin tum elementlerini aralarinda bir bosluk birakarak yazalim

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println(arr);
//Array bir oble / nunprimitive data oldugundan java referansini yazdirir

 //Arrayin Array olarak yazdirmak istersek Array Clasindan yardim almaliyiz.
        System.out.println(Arrays.toString(arr));



    }
}
