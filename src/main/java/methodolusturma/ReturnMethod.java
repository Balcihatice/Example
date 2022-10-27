package methodolusturma;

public class ReturnMethod {
    /* input olarak aldiginizisim ve soyismi ilk harfleri buyuk,digerleri kucuk olarak degistirip
     programin sonraki bolumlerinde kullanabilmek
     uzere isimsoyisim variablina atayarak bir metod olusturun
     unput - isim AlI,Soyisim CAN
     output isimSoyisim : Ali Can seklinde kayitli

     */

    public static void main(String[] args) {
        String isim = "Semra";

        String soyisim = "Hoca";

        String isimSoyisim = isimDuzenle(isim, soyisim);//isim ve soyisimi metoda gonderiyoruz

        // Metod onlari istedigimiz gibi duzenliyor
        //sonra duzenlenmis halini bize geri veriyor
        // bizde onu istedigimiz varialaye atiyoruz

        System.out.println("Ilk girilen : " + isim + " " + soyisim);
        System.out.println("Degistirilmis hali : " + isimSoyisim);

    }

    private static String isimDuzenle(String isim, String soyisim) {
        String isimDuzenlenmis = isim.substring(0, 1).toUpperCase() +

                isim.substring(1).toLowerCase(); // ilk harf buyuk gerisi kucuk

        String soyIsimDuzenlenmis = soyisim.substring(0, 1).toUpperCase() +

                soyisim.substring(1).toLowerCase();

        //simdi bu duzenlenmis halini main metoda gonderelim.Bunun icin return keywordunu yazalim.

        return isimDuzenlenmis + " " + soyIsimDuzenlenmis; //araya bosluk birakarak + koy

        //bu returnu isimSoyisim variaablesine goturecek.
    }


}
