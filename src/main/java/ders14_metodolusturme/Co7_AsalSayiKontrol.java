package ders14_metodolusturme;

public class Co7_AsalSayiKontrol {
    public static void main(String[] args) {
        //Kullanicidan sayi alin asal sa sayi asal, asal degilse sayi asal degil yazdirin

        int sayi = 24;
        System.out.println(asalSayiKontrolEt(sayi));
        System.out.println(asalSayiKontrolEt(9));

    }

    public static String asalSayiKontrolEt(int sayi) {
        String sonuc = "";
        for (int i = 2; i <= (sayi - 1); i++) {

            if (sayi % i == 0) {
                sonuc = "Asal degil";
                break;
            }
        }
        if (!sonuc.equals("Asal degil")) {
            sonuc = "Asal";
        }
        return sonuc;
    }

}
