package ders19_arrays;

import ders18_arrays.C03_ArrayelemanlariniArtirma;
import ders18_arrays.C04_ArrayElemanlaritoplami;
import ders18_arrays.C05_ArraydeElemanArama;
import ders18_arrays.C06_KullaniciyaaAarrayOlusturma;

import java.util.Arrays;

public class C03_MethodKullanimi {
    public static void main(String[] args) {

        //Verilen bir int Arrayin elemaanlarini 2 artirin

        int[] arr = {2, 3, 4};
        arr = C03_ArrayelemanlariniArtirma.elementleriIkiArtir(arr);
        System.out.println(Arrays.toString(arr));

        //arr arrayin elemanlarini toplayin ve yazdirin
        C04_ArrayElemanlaritoplami.toplam(arr);

        //Arr arrayinde 10 elemani var mi
        C05_ArraydeElemanArama.elemanAra(arr, 10);


        // Kullanicidan deger alarak bir deger olusturun

        int[] newArr = C06_KullaniciyaaAarrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(newArr));


    }
}
