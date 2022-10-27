package ders10_concatenations;

public class C01_Concatenation {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Guzeldir";
        boolean bl = true;
        int sayi = 20;
        double dbl =  3.54;

        System.out.println(str1+bl+sayi);//string yanina gelenleri stringlestirir

       // System.out.println(sayi+bl);
        System.out.println(sayi + dbl);//23.54
        System.out.println(str1.concat(" ").concat(str2));//Java Guzeldir

//concat() sadece string variablelari birlestirmek icin kullanilir





    }
}
