package ternary;

import java.util.Scanner;

public class C01_NestedTernary {
    public static void main(String[] args) {
        //sayi pozitifse cift sayi veya cift sayi degikl
        //sayi pozitif degilse 3 basamaklimi ? .degil mi?


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        double a = scan.nextDouble();

        System.out.println(a > 0 ? (a % 2 == 0 ? "Cift sayi" : "Tek sayi") : (a < -100 && a > -1000 ? "Uc basamakli" : "Uc asamakli degil"));

        // Kullanicidan gun numarasini alip, gun ismini yazdirin
        // kullanicdan gun numarasini alip, gun ismini yazdiralim


    }
}

