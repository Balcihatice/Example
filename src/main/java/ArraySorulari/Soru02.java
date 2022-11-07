package ArraySorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Kac elemanli bir array olusturmak istiyorsunuz?");

        int size = scan.nextInt();

        int[] elemanlar = new int[size];

        for (int i = 0; i <elemanlar.length ; i++) {

            System.out.println("Array`in " + (i+1)+ " inci elemanini girinz");

            elemanlar[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(elemanlar));



        // 2.Yol
        int i = 0;

        while (i < elemanlar.length) {

            System.out.println("Array`in " + (i + 1) + " inci elemanini girinz");

            elemanlar[i] = scan.nextInt();

            i++;
        }
        System.out.println(Arrays.toString(elemanlar));

        Arrays.sort(elemanlar);

        System.out.println((elemanlar[elemanlar.length - 1]) - elemanlar[0]);
    }
}