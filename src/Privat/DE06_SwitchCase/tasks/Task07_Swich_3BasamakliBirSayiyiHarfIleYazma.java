package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task07_Swich_3BasamakliBirSayiyiHarfIleYazma {
    public static void main(String[] args) {
// Task-> Girilen 3 basamaklı bir sayıyı hardf karakteri ile print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scan.nextInt();
        int birlerBasamagi = sayi% 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yüzlerBasamagi = sayi / 100;

        switch (yüzlerBasamagi) {
            case 0:
                System.out.print("");
                break; //code blok bu komuttan sonra kırılır: bloktan sonraki satır run edilir
            case 1:
                System.out.print("yüz");
                break;
            case 2:
                System.out.print("ikiyüz");
                break;
            case 3:
                System.out.print("ücyüz");
                break;
            case 4:
                System.out.print("dörtyüz");
                break;
            case 5:
                System.out.print("besyüz");
                break;
            case 6:
                System.out.print("altiyüz");
                break;
            case 7:
                System.out.print("yediyüz");
                break;
            case 8:
                System.out.print("sekzyüz");
                break;
            case 9:
                System.out.print("dokuzyüz");
                break;
        }

        switch (onlarBasamagi) {
            case 0:
                System.out.print(" ");
                break; //code blok bu komuttan sonra kırılır: bloktan sonraki satır run edilir
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kirk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmis");
                break;
            case 7:
                System.out.print("yetmis");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;

        }
        switch (birlerBasamagi) {
            case 0:
                System.out.print(" ");
                break; //code blok bu komuttan sonra kırılır: bloktan sonraki satır run edilir
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("uc");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("bes");
                break;
            case 6:
                System.out.print("alti");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;

        }
    }
}