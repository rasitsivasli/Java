package Privat.DE12_Arrays.Tasks;

import java.util.Scanner;

public class Task02_DizininElemanlarininToplami {
    public static void main(String[] args) {
        //Task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int n = arr.length;
        int toplam = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number = ");

            arr[i] = scanner.nextInt();
            toplam += arr[i];

        }System.out.println("Sum = " + toplam);

    }
}
