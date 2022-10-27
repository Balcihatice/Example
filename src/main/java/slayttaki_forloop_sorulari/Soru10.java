package slayttaki_forloop_sorulari;

public class Soru10 {
    public static void main(String[] args) {


        // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine ceviri kaydedin.

        StringBuffer yeniKelime = new StringBuffer("Rose");

        System.out.println("yeniKelime = " + yeniKelime.reverse());

        String text = yeniKelime.toString();   // text e kaydettim galiba.

        System.out.println("text = " + text);

        //StringBuffer sınıfı, sınıfının bir nesnesini tersine çevirmek için kullanılabilen bir yöntem içerir.

        // 2.ornek

        String s = "Welcome";

        StringBuilder sb = new StringBuilder(s); // s Stringini Builder sinifina alip sb ye atadm

        System.out.println("sb = " + sb);

        sb.reverse();

        String text2 = sb.toString();

        System.out.println("Original string: " + s);

        System.out.println("Reversed string: " + text2);


















    }
}
