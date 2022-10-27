package ders9_stringmanipulations;

public class C06_substring {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";

        System.out.println(str.substring(5));//5. index dahil sonrasini verir

        System.out.println(str.substring(0));//hepsini yazar
        System.out.println(str.length());//19

        String sonHarf =""+str.charAt(str.length()-1); //char`i string yaptik
         sonHarf = str.substring(str.length()-1);

        System.out.println(sonHarf);//p

        System.out.println(str.substring(str.length()-1).toUpperCase());//P

  //son 3 harf buyuk
        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP



    }
}
