package ders10_concatenations;

public class C03_StartWith {
    public static void main(String[] args) {


        String str = "Manti acarken Java ogrenilmez";
        System.out.println(str.startsWith("Manti"));//.true
        System.out.println(str.startsWith(""));//true

      //ofset= otele
        System.out.println(str.startsWith("acarken", 6)); //6,index ve sonrasi acarken ile mi basliyor
        System.out.println(str.startsWith("Manti", 0));//o ve sonrasi Manti ile mi bas;iyor
        System.out.println(str.startsWith("java", 10));//false








    }
}