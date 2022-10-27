package ders15_overloadin_whileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

//1 den 100 e kadar iki basamakli sayilari arasinda bosluk birakarak yazdiriniz
        int s = 10;
        while (s < 100) {

            System.out.print(s + " ");
            s++;
        }

        //Kullanicidan ytoplamak uzere taamsayilari alin,
        //  Kullanici 0`a basarsasayi alma islemini bitirin
        //kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        int girilensayi = 5;
        int sayac = 0;
        while (girilensayi != 0) {
            System.out.println("Lutfen toplamak icin sayi gitiniz" +
                    "|n Bitirmek icin 0`a basin");
            girilensayi = scan.nextInt();
            sayac++;


        }
    }


}