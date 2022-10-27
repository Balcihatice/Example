package methodolusturma;

import java.util.Scanner;

public class MethodOlusturma02 {
    public static void main(String[] args) {

        //Kullanicidan 2 sayi alip bunlarini toplamini yazdiran bir metod olusturun

        isteToplaYazdir();


    }

    public static void isteToplaYazdir() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        double sayi1 = scan.nextDouble();

        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayilarin toplami : " + (sayi1 + sayi2));
    }


}
