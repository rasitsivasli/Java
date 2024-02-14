package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task03_BirDizininElemanlarininYerleriniDegistirme {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1, 2, 3]
        output [2, 3, 1]
        */

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[arr.length];
        elemanlanDegisimi(arr, arr2);

    }
    private static void elemanlanDegisimi(int[] arr, int[] arr2) {
        for (int i = 1; i < arr.length; i++) {
            arr2[i-1]=arr[i];
        }
        arr2[arr2.length-1]=arr[0];
        System.out.println("arr2 = " + Arrays.toString(arr2));
    }

}
