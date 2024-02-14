package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * MainClass : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        System.out.print("Boyunuzu giriniz : ");
        Scanner scan = new Scanner(System.in);
        int boy = scan.nextInt();
        double boyM = boy/100.0;
        System.out.print("Kilonuzu giriniz : ");
        int kilo = scan.nextInt();
        double vke = (kilo/(1.0*boyM*boyM));
        System.out.println(" Vucut kütle endeksiniz tamsayi olarak : "+ vke);

        int vke2 = (10000*kilo/(boy*boy));
        System.out.println(" Vucut kütle endeksiniz tamsayi olarak : "+ vke2);
    }
}
