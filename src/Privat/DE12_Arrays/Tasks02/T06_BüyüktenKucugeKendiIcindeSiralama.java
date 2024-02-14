package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T06_BüyüktenKucugeKendiIcindeSiralama {
    public static void main(String[] args) {
        // Diziyi büyükten küçüğe sıralayınız (kendi içinde)
        int[] arr = {21, 27, 46, 79, 44, 2, 1, 80};

        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("arr = " + Arrays.toString(arr));
        int[] arr2 = new int[n];
        for (int i = n - 1, k = 0; i >= 0; i--, k++) {
            arr2[k] = arr[i];
        }
        System.out.println("arr = " + Arrays.toString(arr2));
    }
}
