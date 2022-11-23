package day05_ifsatatement;

import java.util.Scanner;

public class C06_IfStatement {
    // Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
    // ucgen eskenar ise “Eskenar ucgen” yazdirin.

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 3 kenar uzunlugunu giriniz");
        double k1 = scan.nextDouble();
        double k2 = scan.nextDouble();
        double k3 = scan.nextDouble();


            if (k1 == k2 && k2 == k3 && k1>0) {
                System.out.println("Eskenar ucgen");
            } else
                System.out.println("Eskenar ucgen degildir");


    }
}