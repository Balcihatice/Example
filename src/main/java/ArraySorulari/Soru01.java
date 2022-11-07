package ArraySorulari;

public class Soru01 {
    /*

     * Bir array'deki en buyuk ve en kucuk sayiyi iki ayri methodda Arrays.sort() methodu
     * kullanmadan method olusturucak sekilde yapiniz

     */

    public static void main(String[] args) {

        int arr[] = {8, 18, -6, -2, -156, 49};

        System.out.println(enKucuk(arr));
    }

    public static int enKucuk(int arr[]) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            min = Math.min(arr[i], arr[i + 1]);
        }
        return min;
    }
}