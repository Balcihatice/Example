package slayttaki_forloop_sorulari;

import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        //  hesaplayin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic  20 den kucuk bir sayi giriniz ");
        int bas = scan.nextInt();


        if (bas > 20) {
            System.out.println("Lutfen 20 den kucuk bir sayi giriniz");
        } else {
            int faktoriyel = 1;
            for (int i = 1; i <= bas; i++) {
                faktoriyel = faktoriyel * i;
                System.out.println("Sayinin faktoriyeli : " + ("Sayi" + i + " = " + faktoriyel));   //6.soru icin yazildi
            }
            System.out.println("Sonuc : " + faktoriyel);

        }
    }
}