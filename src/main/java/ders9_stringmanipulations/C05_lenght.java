package ders9_stringmanipulations;

public class C05_lenght {
    public static void main(String[] args) {
        String str = "Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length());//33

        System.out.println(str.charAt(33));//u

        System.out.println(str.charAt(str.length()-1));//u

// sondan 3. karakteri yazdirin
        System.out.println(str.charAt(str.length()-3));//g






    }
}
