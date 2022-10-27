package ders19_arrays;

import java.util.Arrays;

public class C06_ArrayeYeniDegerAtama {
    public static void main(String[] args) {
        //NOT: Varolan bir Array`e yeni deger aranabilir mi?
        //   Aslinda var olan arraye yeni deger atayamayiz, yeniden array olusturmamiz lazim

        //   ama deger ini atama ile degistirebiliriz

        String[] arr1 = {"Ali", "Veli"};
        String[] arr2 = {"A", "B", "C"};

        /*
      Var olan bir Arrayin uzunlugu degistirilemez
      AMA
      Varolan bir array`e yeni bir deger atanabilir
      i) Var olan array``i yeni deger olarak atayabiliriz

 */
        arr1 = arr2;
        System.out.println(Arrays.toString(arr1));//[A, B, C]


        //  ii) Istedigimiz uzunlukta yeni bos bir array degeri atayabiliriz

        arr1 = new String[6];
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null, null]

        // iii) Yeni olusturulan bir Aarray`e` suslu parantez icinde bir deger atayabiliriz
        //Aancak var olan bir array`e yebi deger atamasi icin{} KULLANAMAYIZ


        //  arr1 = {"g", "h"}; olamaz


    }
}
