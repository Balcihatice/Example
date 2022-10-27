package methodolusturma;

public class MethodOlusturma {
    public static void main(String[] args) {
        //istedigimiz isleri bizim adimiza yapan kod bloklaridir.
        //  1)  Bazi metodlar bize sonuc dondurmez.cocuk okula kayitliysa yeter,belge istemek gerekmez
        //void metodlar
        // ya bize sonuc dondurmez
        //ya da konsol da birsey yazdirir

        //  2) Bize sonuc donduren metod turleri vardir.Bunlari bize sonuc dondursun diye yapariz,
        // Biz return edilen sonucu almaliyiz.

        String str = "Java muhtesemdir";

        //Metni buyuk harfe cevirme

        String buyukStr = str.toUpperCase();
        System.out.println(buyukStr);

        //Metnin buyuk harflere cevrilmis hali 5 icerir mi

        System.out.println(buyukStr.contains("S"));

        // istersek str a atayabilirdik . ya da baska bir variableye aktarabilirdik.
        // or :     str = str.contains("S")

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);
    }

    // 1) access modifier : OOP nin basi dir,
    //  Nerelerden kullanilabilir.
    // public : halka acik
    // private : Sadece bulundugu classlardan kullanilabilir.
    // default : sadece icinde bulundugu (package) den kullanilabilir
    // protected : Sadece icinde bulundugu package ve child class lardan kullanilir

    // 2) static : Klup gibi dusunebiliriz,Eger bir metod static klubune uye ise sadece static klubune uye olanlarla
    // muhatap olur

    // 3) void : metodun hangi data type turunde bir sonuc urettigini belirtir.
    //gorevi sadece yazdirmak ise bu kullanilabilir
    //void degilse metod da return keyworld  bulunur.

    // 4) metodun adi : hangi isi yapacaksa o ise uygun isim verilir
    // parametreleri farkli olmak sartiyla ya da data type i farkli olmak sartiyla ayni isimde metod uretilebilr.


}
