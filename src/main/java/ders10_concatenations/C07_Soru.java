package ders10_concatenations;

public class C07_Soru {
    public static void main(String[] args) {
        //Kullanicidan bir cumle ve bir metin alin
        //cumlede metnin durumuna gore
        // 1-icermiyor
        //2-cumle metni sadece 1 kere iceriyor
        //3-cumle metni birden fazla iceriyor
        //seceneklerinden uygun olani yazdirin


        String cumle = "Java cok guzeldir cok ";
        String metin = "cok";


        if (!cumle.contains(metin)) {

            System.out.println("icermiyor");

        } else {
            int ilkIndex = cumle.indexOf(metin);

            int ikinciIndex = cumle.indexOf(metin, ilkIndex);//ya -1 olur ,ya da bir index

            if (ikinciIndex == (-1)) {
                System.out.println("Cumle metni 1 kere iceriyor");
            } else {
                System.out.println("Cumle metni birden fazla iceriyor");
            }
        }


    }
}
