package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task23_BaskaDiziKullanmadanDiziyiTersindenYazdirma_ {
    public static void main(String[] args) {
        // N elemanlı bir dizi üretin, rastgele doldurun , yazdırın
        // sonra başka bir dizi kullanmadan bu diziyi ters çevirin
        // [4,7,9,1,1,0,5]
        // [5,0,1,1,9,7,4]
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac elemanli bir dizi üretmek istiyorsunuz : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number : ");
            arr[i] = scanner.nextInt();
        }
        arr = Arrays.copyOf(arr, 2 * n);// dizinin eleman sayisini 2 katina cikardik
        System.out.println("arr = " + Arrays.toString(arr));
        int uzunluk = arr.length;// Dizinin yeni uzunlugu
        int yarisi = arr.length / 2;

        for (int i = yarisi; i < uzunluk;  i++) {// dizinin index ini 0 dan itibaren doldurmak icin k degiskeni tanimlandi
            arr[i] = arr[uzunluk-1-i];

        }
        System.out.println("arr = " + Arrays.toString(Arrays.copyOfRange(arr, yarisi, uzunluk)));
    }
}
