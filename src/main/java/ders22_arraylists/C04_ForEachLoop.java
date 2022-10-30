package ders22_arraylists;

public class C04_ForEachLoop {
    public static void main(String[] args) {
//verilen arraydeki 5 ten buyuk elemanlarin toplamini veren kodu yaziniz
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 5) {

                toplam += arr[i];
            }
        }

        System.out.println("ForLoop ile toplam : " + toplam);

        int sum = 0;

        for (int w : arr) {

            if (w > 5) {

                sum += w;
            }
        }

        System.out.println("ForEachLoop ile toplam : " + sum);


    }
}
