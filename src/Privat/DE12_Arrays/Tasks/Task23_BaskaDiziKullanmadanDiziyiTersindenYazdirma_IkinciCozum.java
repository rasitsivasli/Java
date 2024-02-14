package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task23_BaskaDiziKullanmadanDiziyiTersindenYazdirma_IkinciCozum {
    public static void main(String[] args) {
        // N elemanlı bir dizi üretin, rastgele doldurun , yazdırın
        // sonra başka bir dizi kullanmadan bu diziyi ters çevirin
        // [4,7,9,1,1,0,5]
        // [5,0,1,1,9,7,4]
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac elemanli bir dizi üretmek istiyorsunuz : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        System.out.println("arr = " + Arrays.toString(arr));//arr = [59, 58, 91, 46, 21, 28, 90, 23, 2, 12]

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
