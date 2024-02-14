package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T05_DiziyiTerstenSiralama {
    public static void main(String[] args) {
        // diziyi tersten geriye sıralı yazdırınız
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};
        int n = arr.length;
        int[] arr2 = new  int[n];
        for (int i = n - 1, k = 0; i >= 0; i--, k++) {
            arr2[k] = arr[i];

        }System.out.print(Arrays.toString(arr2));


    }
}
