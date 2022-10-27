package ders13_nestedforloop_methodolusturma;

public class C04_NestedForLoop {
    /*
    Asagidaki sekli olusturun
    * * * * * *
    * * * * * *
    * * * * * *
    * * * * * *
     */
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) { //outur loop

            for (int j = 1; j < 7; j++) {//inirloop

                System.out.print("*" + " ");
            }
            System.out.println();//ic loop bitince alt satira gec
        }


  /*  *
      * *
      * * *
      * * * *
      * * * * *
   */
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*" +" ");
            }
            System.out.println();
        }






    }



}
