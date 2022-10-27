package ders14_metodolusturme;

public class C05_SubstringOlustur {
    /*
    Bir string olusurun baslangic ve bitis indexlerine gorebas indexi dahil bitis
    indexi haric olacak sekilde harfleri yazdiran metodu yazniniz
    - Kullanici baslangic indexi olarak bitis degerinden buyuk sayi girerse hata mesaji verin
    -Kullanici str da olan indexlerden baha buyuk bir index girerse hata mesaji verin
     */
    public static void main(String[] args) {
        String input = "Java ne kadar guzel";
        int basIndexi  = 5;
        int bitIndexi  = 7;
kendiSubstringMetoddumuz(input,basIndexi,bitIndexi);
kendiSubstringMetoddumuz("Java", 1 , 3);
kendiSubstringMetoddumuz("Deneme" , 6,3);
kendiSubstringMetoddumuz("Java" , 6, 8);


    }
    public static void kendiSubstringMetoddumuz(String input,int basIndexi, int bitIndexi){
        if (basIndexi > bitIndexi){
            System.out.println("Baslangic indexi bitis indexinden buyuk olamaz");
        } else if (bitIndexi >= input.length()) {
            System.out.println("Bitis indexi sinirlarin disinda");
        }else {
           //baslangic ve bitis indexlerine gorebas indexi dahil bitis
            //    indexi haric olacak sekilde harfleri yazdiran metodu yazniniz
            for (int i = basIndexi; i < bitIndexi; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println();

        }
    }



}
