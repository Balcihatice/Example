package ders12forloops;

public class C01_ForLoops {
    public static void main(String[] args) {

        String str = "Java\n";//alta inmesini istedigimiz icin \n koyduk
        System.out.println(str.repeat(10));

        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
// iki basamakli sayilardan 7 ile bolune bilenler
        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0)
                System.out.print(i + " ");

        }
        System.out.println();
// 13 den 100  7 ser artirip yazdirin
        for (int i = 13; i < 101; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

//1 den 10 e kadar sayilarin kareleri yazdirin
        for (int i = 1; i < 11; i++) {
            System.out.print(i * i + " ");
        }

        System.out.println();

        //kullanicinin verdigi sayinin faktoriyelini bulalim
        int sayi = 10;
        int faktoriyel = 1;
        for (int i = sayi; i > 0; i--) {
            faktoriyel = faktoriyel * i;
        }
        System.out.println(faktoriyel);
// 1 den 100 e kadar olan sayilari toplayin
        int toplam = 0;
        for (int i = 1; i < 101; i++) {
            toplam += i;
            // System.out.println(toplam);ara sonuclari istemedigimiz icin forloopun disina yazdik
        }
        System.out.println(toplam);

        // Kullacinin verdigi sayinin rakamlar toplamini bulun.

        int x = 300000122;
        String xStr = "" + x; // bununla x integerini stringe cevirdik ve lenght() bulacagiz

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        for (int i = 0; i < xStr.length(); i++) { //basamak sayisi kadar donmeli// Stringe cevirirsek length bulurum
            birlerBasamagi = x % 10;
            rakamlarToplami = rakamlarToplami + birlerBasamagi;
            x = x / 10;
        }
        System.out.println("Sontoplam :" + rakamlarToplami);
// kullanicinin verdigi sayini asal sayi olup olmadigini bulun
        int sayi2 = 103;
        boolean bayrak = false;
        for (int i = 2; i < sayi2 - 1; i++) {
            if (sayi2 % i == 0) {

                bayrak = true; //ise break calisir. asal sayi ise loop biter
                break; // bir tane sayi 103 bolduyse
            }
        }
        System.out.println(bayrak);
        if (bayrak) {
            System.out.println("Asal sayi");
        } else {
            System.out.println("Asal sayi degil");
        }

    }
}
