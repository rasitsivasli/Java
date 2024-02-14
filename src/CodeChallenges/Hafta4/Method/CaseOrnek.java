package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class CaseOrnek {
    public static void main(String[] args) {

        /*
        Switch Case ile
        1 e basildiginda ana menu
        2 e basildiginda islemler
        3 e basildiginda cikis

        */

        System.out.print("HASTANE Ana menü icin 1, islemler icin 2, cikis icin 3 e basiniz.");
        Scanner scanner = new Scanner(System.in);
        int secim = scanner.nextInt();


        switch (secim) {

            case 1:
                anaMenu();
                break;
            case 2:
                islemler();
                break;
            case 3:
                cikis();
                break;
            default:
                hata();
                break;
        }

    }

    private static void hata() {
        System.out.println("hatali giris yaptiniz");
    }

    private static void cikis() {
        System.out.println("cikis yaptiniz gecmis olsun");
    }

    private static void islemler() {
        System.out.println("tedavi ivin 1 \nameliyat icin 2");
    }

    private static void anaMenu() {
        System.out.println("rapor icin 1 \nepikiriz icin 2");


    }
}
