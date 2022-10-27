package methodolusturma;

public class Method01 {

/*   Iki amacla olusturulur
     1) bir kere yaz ve bir daha dusunme
     2)calistigimiz classi basit yapida tutup cok anlasilir olmasini saglamak

     NOOT:  Bir metodun calismasi icin cagrilmasi lazim (method call)
*/

    //syntax a uymaliyiz
    public int sayiTopla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }


    //return type matematikteki sonuc gibidir.


    public static void main(String[] args) {
        //bizim istedigimiz islemleri istedigimiz zaman yapan programdir
        // 1) sadece yazdiracaksa void kullanilir.ya da sonucu data ya islesin ,bana birsey donmuyor.
        // 2) istedigimiz isi yapip bize sonuc dondurecek metodlar vardir.
        //benim istedigimi dondurecek bende onu alacagim-- Burasi onemli, nasil alacagim


        C02_Metod02.indirimliFiyatHEsaplama(true, 12, 100);
        //C02 clasindaki metodu cagirdik


    }
}
