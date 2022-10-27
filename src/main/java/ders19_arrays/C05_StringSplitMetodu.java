package ders19_arrays;

import java.util.Arrays;

public class C05_StringSplitMetodu {
    public static void main(String[] args) {

        String str = "Java gercekten, cok cok guzel";

        String[] arrVirgul = str.split(",");
        System.out.println(Arrays.toString(arrVirgul));

        String[] arrSpace = str.split(" ");
        System.out.println(Arrays.toString(arrSpace));

        String[] arrHiclik = str.split("");
        System.out.println(Arrays.toString(arrHiclik));

        //Str da kac e harfi var

        String[] earrayi = str.split("e");
        System.out.println(Arrays.toString(earrayi));
        System.out.println(earrayi.length);// 4 yerden kesti elemizde 5 indexli parca kaldi
        System.out.println("Metindeki e sayisi : " + (earrayi.length - 1));

        //2.yol
        String[] tumKaraakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKaraakterlerArr));
        int sayac = 0;
        for (int i = 0; i < tumKaraakterlerArr.length; i++) {
            if (tumKaraakterlerArr[i].equals("e")) {
                sayac++;
            }
        }
        System.out.println("Metindeki e sayisi :" + sayac);


    }
}
