package ders10_concatenations;

public class C02_Contains {
    public static void main(String[] args) {
        //bir string baska bir stringi iceriyor mu, true yada false return eder
        String str = "Java ile kodlama cok zevkli";
        System.out.println(str.contains("cok"));//true

        System.out.println(str.contains("bir"));
        System.out.println(str.contains("a"));//true

        System.out.println(str.contains("java"));//false

        String str2 = "Java";

        System.out.println(str.contains(str2));//true

         String str3 = "234 Ali Can ";
       //  str3.contains(3)
        System.out.println(str3.contains("2"));//true


    }
}
