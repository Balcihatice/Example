package ders18_arrays;

public class C05_ArraydeElemanArama {
    public static void main(String[] args) {
        /*
        Verilen bir arreyde istenen bir elemanin var olup olmadigini ve
        varsa kac kere kullanildigini yazdiran bir method olusturunuz

         */

        int[] arr = {1, 2, 3, 4, 5, 6, 6, 3, 4, 5, 6, 7};
        int arananEleman = 2;
        elemanAra(arr, 2);//arr de 2 yi bul

    }

    public static void elemanAra(int[] arr, int arananEleman) {
        int counter = 0;

        for (int w : arr) {
            if (w == arananEleman) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Aranan eleman Array`de yoktur");
        } else {
            System.out.println("Aranan " + arananEleman + " sayisi arrayde " + counter + " kere kullanilmistir");
        }
    }
}
