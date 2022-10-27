package ders15_overloadin_whileLoop;

public class C02_Overloading {
    /*
    1) once method ismine bakar
    2) sonra parametreye ve argument sayisina bakar
    3) sonra parametreye ve argument uyumuna bakar
    4) minumum casting (int sayinin doubleye konup islem yapmasi)

     */
    public static void main(String[] args) {

        carpim(3, 4.5);


    }

    public static void carpim(int sayi1, int sayi2) {
        System.out.println("Iki integer sayyinin carpimi:" + sayi1 * sayi2);
    }

    public static void carpim(double sayi1, double sayi2) {
        System.out.println("Ik integer sayyinin carpimi:" + sayi1 * sayi2);
    }

    public static void carpim(int sayi1, double sayi2) {
        System.out.println("Ik integer sayyinin carpimi:" + sayi1 * sayi2);
    }

    public static void carpim(double sayi1, int sayi2) {
        System.out.println("Ik integer sayyinin carpimi:" + sayi1 * sayi2);
    }

    public static void carpim(float sayi1, double sayi2) {
        System.out.println("Ik integer sayyinin carpimi:" + sayi1 * sayi2);
    }

    public static void carpim(int sayi1, int sayi2, int sayi3) {
        System.out.println("Ik integer sayyinin carpimi:" + sayi1 * sayi2 * sayi3);
    }
}

