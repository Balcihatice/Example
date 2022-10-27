package ders9_stringmanipulations;

public class c07_substring {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";

        System.out.println( str.substring(5,8));//gun

        //5.index dahil (inclusuve) 8. index haric(exlusive)

       System.out.println(str.substring(9,17));//gectikce

        System.out.println(str.substring(3,7));//a gu

    String isim = "HUSEYIN";

//Ilk harf buyuk geriye kalan kucuk yazdirin
        isim = isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase();
        System.out.println(isim);

        System.out.println(isim.substring(2,5));//sey

        System.out.println(isim.substring(3,4));//e





    }
}
