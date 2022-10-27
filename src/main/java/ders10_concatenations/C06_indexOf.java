package ders10_concatenations;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Ahmet hoca ile hersey clear";

        System.out.println(str.indexOf("a"));//a nin ilk gorunumunu verir
        System.out.println(str.indexOf('c'));//c nin ilk gorunumunu verir
        System.out.println(str.indexOf("hersey"));//herseyin ilk harfinin indexini verir
        System.out.println(str.indexOf("e", 9));//9.karakterden sonra ilk e
//13.indexdeki e den bir sonraki e nin indexi?
        System.out.println(str.indexOf("e",13));//yine kendisini verir
        System.out.println(str.indexOf("e",14));//demeliyiz

        //cumledeki ikinci c nin indexi nedir
        int ilkcIndexi = str.indexOf("c");
        System.out.println(str.indexOf("c",ilkcIndexi+1));//22

        System.out.println(str.indexOf("ali"));//-1 olmayan birsey icin -1 doner





    }


}
