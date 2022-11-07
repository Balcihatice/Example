package ArraySorulari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru03 {

    /* bir multidimensional array'i parametre olarak kabul eden bir method yazin
         * bu method array'deki elemanlari arraylist'e aktarsin
         * ve arraylist'i natural order'a gore yazdirin
     */
    public static void main(String[] args) {
        String arr[][] = {{"Hasan", "Kemal", "Cem"}, {"Suzan", "Su"}, {"Nil"}};
        multiArray(arr);

    }


    public static void multiArray(String[][] arr) {

        List<String> arrLis = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arrLis.add(arr[i][j]);
            }
        }
        System.out.println(arrLis);
        Collections.sort(arrLis);
        System.out.println(arrLis);
    }
}
