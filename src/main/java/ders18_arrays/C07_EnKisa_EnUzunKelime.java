package ders18_arrays;

public class C07_EnKisa_EnUzunKelime {
    /*
    Verilen String bir Arraydeki en kisa ve en uzun kelimeleri yazdiran bir method olusturunuz
     */

    public static void enUzunEnKisaIsimlerYazdir(String[] arr){
        String enUzunKelime = arr[0];
        String enKisaKelime = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length()>enUzunKelime.length()){

                enUzunKelime = arr[i];
            }
            if (arr[i].length() < enKisaKelime.length()){

                enKisaKelime = arr[i];
            }
        }
        System.out.println("En uzun isim :" + enUzunKelime);
        System.out.println("En kisa isim :" + enKisaKelime);


    }

    public static void main(String[] args) {

        String[] arr = {"Ali", "Can", "Veli", "Turgut","Furkan"};

        enUzunEnKisaIsimlerYazdir(arr);
    }














}
