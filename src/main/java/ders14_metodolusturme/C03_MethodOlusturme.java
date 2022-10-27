package ders14_metodolusturme;

public class C03_MethodOlusturme {
    public static void main(String[] args) {
        //parametre olarak string kabul edip
        //Stringi ters cevrilmis halini yazdiran kodu yaziniz

        String input = "Java kod yazdikca ogrenilir";
        System.out.println(stringiTerseCevir(input));

    }

    public static String stringiTerseCevir(String input) {
        String terStr = "";
        for (int i = input.length()-1; i >= 0; i--) {
            terStr = terStr + input.charAt(i);
        }
        return terStr;
    }


}
