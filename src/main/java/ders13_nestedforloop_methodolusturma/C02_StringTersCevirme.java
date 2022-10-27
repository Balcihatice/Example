package ders13_nestedforloop_methodolusturma;

public class C02_StringTersCevirme {
    public static void main(String[] args) {

        String input = "Java";
        String tersInput = "";

        for (int i = input.length()-1; i >=0; i--) {

            tersInput += input.substring(i, i+1  );

        }
        System.out.println(tersInput);//

    }
}
