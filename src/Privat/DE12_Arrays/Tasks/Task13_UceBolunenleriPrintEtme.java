package Privat.DE12_Arrays.Tasks;

import java.util.Scanner;

public class Task13_UceBolunenleriPrintEtme {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */
        uceBolunenler();
    }
    private static void uceBolunenler() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number : ");
            arr[i] = scanner.nextInt();
            if (arr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("count = " + count);

    }
}
