package methodolusturma;

public class C02_Metod02 {
    public static void main(String[] args) {
        /*input olarak verilen satis fiyati, musteri karti var mi?
        ve uyeligi kac yil? bilgilerini degerlendirip
        - uye degilse : %5 indirim
        - uyeligi var ama 5 yildan az ise %10 indirim
        - uyeligi var ve 5 yildan cok ise %15 indirim uygulayip
        asil fiyat,indirim miktari ve indirimli fiyati yazdiran bir metod yaziniz
 */
        //hadi metodu calistralim

        boolean uyeMi = false;
        int uyelikYili = 3;
        double satisFiyati = 250;
        indirimliFiyatHEsaplama(uyeMi, uyelikYili, satisFiyati);


    }

    public static void indirimliFiyatHEsaplama(boolean uyeMi, int uyelikYili, double satisFiyati) {
        if (uyeMi) {

            if (uyelikYili < 5) {

                System.out.println("Urun fiyati : " + satisFiyati);
                System.out.println("Indirim Miktari : " + satisFiyati * 0.1);
                System.out.println("Indirimli fiyat : " + (satisFiyati - satisFiyati * 0.1));

            } else {
                System.out.println("Urun fiyati : " + satisFiyati);
                System.out.println("Indirim Miktari : " + satisFiyati * 0.15);
                System.out.println("Indirimli fiyat : " + (satisFiyati - satisFiyati * 0.15));

            }

        } else {
            System.out.println("Urun fiyati : " + satisFiyati);
            System.out.println("Indirim Miktari : " + satisFiyati * 0.05);
            System.out.println("Indirimli fiyat : " + (satisFiyati - satisFiyati * 0.05));

        }

    }


}
