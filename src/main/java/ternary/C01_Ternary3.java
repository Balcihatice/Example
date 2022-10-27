package ternary;

import java.util.Scanner;

public class C01_Ternary3 {

    /*
     kullanicidan notunu alin 50 den buyukse gectin .degilse maaslesef kaldin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");

        double not = scan.nextDouble();

        System.out.println(not > 50 ? "Gectiniz" : "Maalesef kaldiniz");


    }
}
