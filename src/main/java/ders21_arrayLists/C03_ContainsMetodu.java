package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_ContainsMetodu {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 4, 3, 6, 8, 9};

        for (int i = 0; i < arr.length; i++) {

            list.add(arr[i]);
        }
        System.out.println(list.contains(3)); //true

        System.out.println(list.contains(7)); //true

        System.out.println(list.contains(1)); //false

    }
}