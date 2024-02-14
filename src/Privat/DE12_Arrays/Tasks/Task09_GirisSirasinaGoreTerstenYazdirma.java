package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task09_GirisSirasinaGoreTerstenYazdirma {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz

        tersdenYazdir();

    }

    private static void tersdenYazdir() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            arr[i] = scanner.nextInt();

        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.print("Yeni dizi : ");

        int[] newArr = new int[5];
        for (int i = n - 1, a = 0; i >= 0; i--, a++) {
            newArr[a] = arr[i];
        }
        System.out.println("newArr = " + Arrays.toString(newArr));
    }
}
