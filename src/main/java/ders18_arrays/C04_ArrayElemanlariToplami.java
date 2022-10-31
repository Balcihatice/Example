package ders18_arrays;

public class C04_ArrayElemanlariToplami {
    public static void main(String[] args) {
        /*
        soru2)
        Verilen bir Arraydeki pozitif tamsayilari toplayip
        sonucu bize donduren bir method yaziniz

         */
        int[] arr = {3, -3, 5, -7, -6, 1, -2};

        System.out.println(toplam(arr));//ya yazdirmali ya da atamaliyiz

    }

    public static int toplam(int arr[]) {
        int toplam = 0;
        for (int w : arr) {
            if (w > 0) {
                toplam = toplam + w;
            }
        }
        return toplam;
    }

    //2.yol
 /*
 int toplam=0;
 for(int i = 0;,i<arr.lenght;i++){
 if(arr[i]>0){
 toplam +=arr[i]
 }
 }
sout >> toplam

  */


}
