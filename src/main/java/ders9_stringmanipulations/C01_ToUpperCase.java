package ders9_stringmanipulations;

import java.util.Scanner;

public class C01_ToUpperCase {
    public static void main(String[] args) {
        String str = "Java mutluluktur.";

        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR.

        System.out.println(str);//asli degismedi Java mutluluktur.


        str = str.toUpperCase(); //atama yaptik ,asli degisti JAVA MUTLULUKTUR.
        System.out.println(str);//JAVA MUTLULUKTUR.


/*Example : Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
“Simdi calisma zamani tatile .. gun var” seklinde

hafta sonu tatiline kac gun kaldigini yazdirin, girilen gun hafta sonu ise
“Simdi dinlenme zamani” yazdirin
   */

       
    }
}
