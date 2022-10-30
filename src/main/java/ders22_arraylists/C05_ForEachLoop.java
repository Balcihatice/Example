package ders22_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {

        /*
        slayt soru3
         */
         String[] arr = {"Sumeyra", "Mehmet","Ekrem","Yilmaz","Ayse"};

  List<String> yeniList = new ArrayList<>();

        for (String w :arr ) {

            if (w.length()%2==0){

               yeniList.add(w.substring(0,w.length()/2));

            }else{

             yeniList.add(w.substring(w.length()-1/2));
            }
        }
        System.out.println(yeniList);
    }
}
