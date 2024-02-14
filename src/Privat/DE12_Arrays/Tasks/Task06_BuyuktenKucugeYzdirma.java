package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task06_BuyuktenKucugeYzdirma {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        int[] arr = {3, 12, 1, 0, 45, 36};
        sirala(arr);

    }

    private static void sirala(int[] arr) {
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        int n = arr.length;
        int [] yeniArr = new int[arr.length];
        for (int i = n - 1, j = 0; i >= 0 ; i--, j++) {

            yeniArr[j] = arr[i];

        } System.out.print("Yeni Array = "+Arrays.toString(yeniArr));
    }

    }


