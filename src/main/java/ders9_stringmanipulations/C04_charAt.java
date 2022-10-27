package ders9_stringmanipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java Candir";
        System.out.println(str.charAt(0));//ilk harf verir
        System.out.println(str.charAt(5));//5. index`deki char`i

        System.out.println(str.charAt(str.length()-1)); //son index

        System.out.println(str.charAt(11));//IndexOutOfBoundsException sinirlarin disinda





    }
}
