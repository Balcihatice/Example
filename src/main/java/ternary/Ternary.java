package ternary;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        //ternary ya yazdirmalisiniz yada bir degere atmalsinix
        int a = 0;
        a = a > 0 ? a * 2 : a + 10; //her iki tarafta int.
        //yada
        System.out.println(a = a > 0 ? a * 2 : a + 10);
        //yazdiriken datanin (type i) turu onemli degil.
//yazdirmayacaksak true oldugundaki sonuc string ise arayacagimiz datatype da string olmali,
        //eger sonuc yine int ise int fegere assigen etmeliyiz

/*
kullanicidan bir sayimiste sayiyi kontrol edip 5 ile bolunebiliyorsa 5 in tam kati degil yazdirin
 */

        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen pozitif bir tam sayi giriniz");
//        int sayi = scan.nextInt();
//        System.out.println(sayi%5==0 ? "Sayi 5 in kati" : "sayi 5 in kati degil");
//
/*
kullanicidan bir harf isteyin girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin
 */
        System.out.println("Lutfen harf giriniz");
        char harf = scan.next().charAt(0);    // char ile ilgili nextchar yok .Bu yuzden charat(0) alacagiz

        System.out.println(harf >='a' && harf<='z' ? (char)(harf-32) : harf);    // asli degeri yazar .Bunun char olarak almak istersek cast yapmaliyiz yani basina (char) koyduk
                                  //    buyuk harf 32 kucuk tur.                (char) koymazsak aski degeri yazar








    }
}
