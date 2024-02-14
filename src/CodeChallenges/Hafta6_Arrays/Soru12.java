package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru12 {

    /* Task->
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
         kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        */
    public static void main(String[] args) {

        System.out.print("8 adet sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("arr = " + Arrays.toString(arr));
        int count = 0;
        System.out.print("Girilen sayilardan 3 e bölünenler : ");
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 3 == 0) {
                count++;
                System.out.print(arr[i]+",");
            }

        }
        System.out.println("\ncount = " + count);

    }

}