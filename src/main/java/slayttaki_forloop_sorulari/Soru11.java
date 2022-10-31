package slayttaki_forloop_sorulari;

import java.util.Scanner;

public class Soru11 {

    //Soru 11- Kullanicidan bir pozitif sayi isteyin,
            // sayının tam kare olup olmadığını bulunuz,
           // tamkare ise true değilse false yazdırınız..

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Pozitif bir sayı giriniz...");

        int sayi=input.nextInt();

        boolean sayac=false;

        int deger=0;

        for(int i=1;i<sayi;i++){

            if(sayi==i*i){

                sayac=true;

                deger=i;
            }
        }
        if(sayac){

            System.out.println(sayi+" sayisi "+ deger+ " saysının tam karesidir ");

        }else{

            System.out.println(sayi+ " tam kare değildir");
        }
    }
}
