package slayttaki_forloop_sorulari;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        //2. Soru Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        // dahil) 7 ila bolunebilen sayilari yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");


            }
        }
    }
}