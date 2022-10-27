package ders9_stringmanipulations;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        String str1 ="Ali";
        String str2 ="ali";
        String str3 ="ALI";


        System.out.println(str1.equals(str2));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str2.equalsIgnoreCase(str3));//true

        System.out.println(str1.equalsIgnoreCase("Ali Can"));//false

// equalsignore cese icin ali,Ali,ALI,aLI aynidir
        //ama arada sapace varsa hata verir( a ali)









    }
}
