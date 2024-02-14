package CodeChallenges.Hafta6_Arrays;

import java.util.Scanner;

public class Soru10 {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan buyuk olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output1 : 4
         * Output2 : 5,6,7
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 adet sayi giriniz : ");

        diziOlusturma();
        
        }

    private static void diziOlusturma() {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        double top = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            top += arr[i];
        }
        diziOrtalamaVeBuyukOlanlar(arr,top,n);
    }

    private static void diziOrtalamaVeBuyukOlanlar(int[] arr, double top, int n) {
        double ort = top / n;
        System.out.println("ort = " + ort);

        System.out.print("Ortalamadan büyük olanlar : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > ort) System.out.print(arr[i] + ",");
        }
    }

}