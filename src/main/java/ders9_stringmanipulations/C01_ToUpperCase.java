package ders9_stringmanipulations;

public class C01_ToUpperCase {
    public static void main(String[] args) {
        String str = "Java mutluluktur.";

        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR.

        System.out.println(str);//asli degismedi Java mutluluktur.


       str = str.toUpperCase(); //atama yaptik ,asli degisti JAVA MUTLULUKTUR.
        System.out.println(str);//JAVA MUTLULUKTUR.


    }
}
