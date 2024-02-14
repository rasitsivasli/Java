package Privat.DE12_Arrays.Tasks;

import java.util.Scanner;

public class Task05_TerstenYzdirma {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        sayininTersi();
        sayininTersiIkinciYol();
    }

    private static void sayininTersi() {
        System.out.print("Bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String sayi = scanner.next();

        int n = sayi.length();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(sayi.charAt(i));
        }
    }
    private static void sayininTersiIkinciYol() {
        System.out.print("\nBir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        int birlerBasamagi;
        while (sayi !=0){
            birlerBasamagi = sayi%10;
            System.out.print(birlerBasamagi);
            sayi=sayi/10;

        }

    }
}
