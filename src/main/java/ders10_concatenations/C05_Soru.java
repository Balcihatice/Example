package ders10_concatenations;

public class C05_Soru {
    public static void main(String[] args) {
        /*mail kontrolu yapan bir program hazirlayin
        1- mail @ icermiyorsa geresizemail yadirin
         2- @gmail.com icermiyorsa "gmail adresiniz giriniz"
         3-gmail.com ile bitmiyorsa "yazim hatasi"
  */
        String email = "ahmet@bulutluoz.com";

        if (!email.contains("@")){
           System.out.println("Gecersiz email");
       }else if(!email.contains("@gmail.com")){
           System.out.println("gmail adresinizi giriniz");
        }else if(!email.endsWith("@gmail.com")){
           System.out.println("yazim hatasi");
       }else{
           System.out.println("email basari ile kaydedildi");
       }

    }
}
