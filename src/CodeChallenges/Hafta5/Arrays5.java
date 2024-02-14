package CodeChallenges.Hafta5;

import java.util.Arrays;

public class Arrays5 {
    public static void main(String[] args) {
        int[] dizi = new int[10]; // 5 elemanı dizi tanımladık
        doldur(dizi);
        yaz(dizi);
    }

    private static void yaz(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private static int[] doldur(int[] dizi) {
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        return dizi;


    }
}
