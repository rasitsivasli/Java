package Privat.DE12_Arrays.Sorular;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {

        int[] intArr = {3, 6, 1, 3, 5};
        int[] intArr2 = new int[]{5, 1, 11, 4, 6};
        int[] arrT = new int[5];

        for (int i = 0; i < arrT.length; i++) {
            arrT[i] = intArr[i] + intArr2[i];

        }
//        System.out.println(Arrays.toString(arrT));


        // iki diziyi pespese ekle

        int n1 = intArr.length;
        int n2 = intArr2.length;
        int[] arrYeni = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arrYeni[i] = intArr[i];
        }
//        for (int i = n1, a=0; i < n1 + n2; i++,a++) {
//
//            arrYeni[i] = intArr2[a];
//
//        }


        for (int i = 0; i < n2; i++) {
            arrYeni[n1 + i] = intArr2[i];
        }
        System.out.println("arrYeni = " + Arrays.toString(arrYeni));
    }
}
