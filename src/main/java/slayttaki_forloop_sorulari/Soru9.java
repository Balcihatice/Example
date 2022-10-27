package slayttaki_forloop_sorulari;

import java.util.Scanner;

public class Soru9 {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen kelime giriniz ");

        String kelime = scan.nextLine();

        String ters = "";

        for (int i = kelime.length() - 1; i >= 0; i--) {

            ters = ters + kelime.charAt(i);
        }

        System.out.println("Girdiginiz Metnin Tersi : " + ters);
















    }










}
