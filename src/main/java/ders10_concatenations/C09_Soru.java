package ders10_concatenations;

public class C09_Soru {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir metin alin
        //cumlede metnin durumuna gore
        // 1-icermiyor
        //2-cumle metni sadece 1 kere iceriyor
        //3-cumle metni birden fazla iceriyor
        //seceneklerinden uygun olani yazdirin

        String cumle = "Java cok guzeldir cok ";
        String metin = "cok";

        int ilkIndex = cumle.lastIndexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)){
            System.out.println("icermiyor");
        }else if (ilkIndex==sonIndex){
            System.out.println("cumle metni sadece 1 kere iceriyor");
        }else{
            System.out.println("cumle metni birden fazla iceriyor");
        }











    }
}
