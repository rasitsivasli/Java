package _____OSA_____.OCA_Tum_Sorular.Q207_MultiDimentionArray;

public class Q207 {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{2,4};

        for (int[] a:arr){
            for (int i = 0; i < arr[i].length; i++) {// soru sayfalardakinden farkli... bu sekilde olursa hata verir.
                // Cunku i=2 old. yani arr[2] oldugunda arr[2]. elemani olmadigi icin hata verir
                System.out.print(a[i]+" ");
            }
            System.out.println();
 	        }
       }}
    /*
    what is the result?
    A.  1 3 5 7
        1 3

    B.  1 3
        1 3

    C.  1 3
        1 3 0 0

    D.  1 3
        followed by an ArrayIndexOutOfBoundsException

    E. Compilation fails
    */
    //Answer D  aciklamsi var v18

