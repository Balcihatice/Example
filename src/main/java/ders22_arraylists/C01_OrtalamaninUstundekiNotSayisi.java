package ders22_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_OrtalamaninUstundekiNotSayisi {

    public static void main(String[] args) {

     /*
    Ogretmendenn ogrenci notlarini alip bir list olusturun
    Ogretmen 100 den buyuk bir sayi girip bitirdiginde, sinif ortalamasini ve kac
    kisinin ortalamanin ustunde not aldigini yazin
      */
        List<Double> notlar = listeOlustur();
        System.out.println(notlar);


        raporla(notlar);


    }

    public static void raporla(List<Double> notlar) {
        int ogrenciSayisi = notlar.size();
        double notlarToplami = 0.0;
        double sinifOrtalamasi = 0.0;
        int ortalamaninUstundekiOgrenciSayisi = 0;

        for (int i = 0; i < notlar.size(); i++) {

            notlarToplami += notlar.get(i);
        }

        //not ortalamasini bulalim
        sinifOrtalamasi = notlarToplami / ogrenciSayisi;

        //ortalamanin ustundeki ogrencileri bulalim

        for (int i = 0; i < notlar.size(); i++) {

            if (notlar.get(i) > sinifOrtalamasi) {

                ortalamaninUstundekiOgrenciSayisi++;
            }
        }
        //rapor icin istenenleri yazalim

        System.out.println("Girilen not sayisi : " + ogrenciSayisi+
                "\nGirilen notlarin ortalamasi : "+ sinifOrtalamasi +
                "\nOrtalamanin ustunde not alan ogrenci sayisi : "+ ortalamaninUstundekiOgrenciSayisi);

    }


    public static List<Double> listeOlustur() {

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        Double girilenNot = 1.0;

        while (girilenNot <= 100) {

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nBitirmek icin0`a basiniz");

            girilenNot = scan.nextDouble();

            if (girilenNot < 100) {

                notlar.add(girilenNot);
            }
        }
        return notlar;
    }
}
