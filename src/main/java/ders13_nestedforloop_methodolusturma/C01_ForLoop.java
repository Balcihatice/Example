package ders13_nestedforloop_methodolusturma;

public class C01_ForLoop {
    public static void main(String[] args) {
        //satir sayisi dis loop
        //sutun sayusu 1 den baslar ucgen olmasi icin i ye kadar gidecek
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i*j+ " ");
            }
            System.out.println("");
        }

      //Stringi ters cevirme
      String str = "Java ne kadar guzel";
        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }




    }
}
