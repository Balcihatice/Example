package ders12forloops;

public class C02_Soru {
    public static void main(String[] args) {
    /*   3 ile bolunur se fizz
   5 ile biterse buzz
   hem 3 hemde 5 ile biterse fizz buzz yazdirin
       */

     int sayi = 130;
        for (int i = 0; i < sayi; i++) {
            if (i%3==0 && i%5==0){
                System.out.println("Fizz-Buzz\n");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i+ " ");
            }
        }





    }
}
