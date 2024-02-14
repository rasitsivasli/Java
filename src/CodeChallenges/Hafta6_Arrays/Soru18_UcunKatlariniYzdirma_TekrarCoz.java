package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;

public class Soru18_UcunKatlariniYzdirma_TekrarCoz {
    public static void main(String[] args) {

        ///1'den 100'e kadar 3'e bölünebilen sayıları listesini 10'lu yazdırarak
        ////{{3,6,9},{12,15,18},{21,24,27,}..}

        int[][] arr = new int[10][3];
        int a = 3; // 3 ün kati old. icin
        int[] arr1 = new int[100];
        for (int i = 1; i < 100; i++) {
            arr1[i] = i;
        }
        System.out.println("arr1 = " + Arrays.toString(arr1));
        int n = arr1.length;


        for (int i = 0; i < n / 10; i += 10, n += (n / 10), i += 10) {
            if (arr1[i] % 3 == 0) {
                for (int j = 0; j < arr[i].length; j++)

                    arr[i][j] = arr1[i];
            }
        }
        System.out.println("arr = " + Arrays.deepToString(arr));
    }

}


