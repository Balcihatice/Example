package ders10_concatenations;

public class C08_LastIndexOf {
    public static void main(String[] args) {
        String str = "Java hafiften beyin yakiyor";
        System.out.println(str.lastIndexOf("a"));//21
        System.out.println(str.lastIndexOf('e'));//15
        System.out.println(str.lastIndexOf("java"));//-1
        System.out.println(str.lastIndexOf("Java"));//0
        System.out.println(str.lastIndexOf("e", 14));//b den geriye dogru 11 gelir
        // ikinci index icin buldugumuzdan bir onceki alinacak
    }
}
