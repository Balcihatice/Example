package slayttaki_forloop_sorulari;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //// 3.Soru: Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
//        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
//        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic sayi giriniz");
        int bas = scan.nextInt();
        System.out.println("Lutfen bitis degerini girin");
        int bit = scan.nextInt();
        int toplam = 0;
        for (int i = bas; i <= bit; i++) {
            if (bas > bit) {
                System.out.println("Lutfen degrleri kontol ediniz");
            } else {
                toplam = toplam + i;
                System.out.print(toplam + " ");
            }
        }
    }
}
