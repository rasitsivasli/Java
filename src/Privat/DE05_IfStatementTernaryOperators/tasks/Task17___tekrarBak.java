package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task17___tekrarBak {
    final static int tas = 0;
    final static int kagit = 1;
    final static int makas = 2;
    public static void main(String[] args) {
        /*
        Task-> taş- kağıt -makas oyununu simüle eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Seçiminizi yapın (Taş icin 0, Kağıt icin 1 veya Makas icin 2 giriniz): ");
        int siz = scan.nextInt();

        int bilg = (int) (Math.random() * 3);
        System.out.println("Bilgisayarin secimi : " + bilg);

        boolean durum = siz == tas;

        if (durum) {
            if (bilg == makas) {
                System.out.println("Kazandiniz..");
            }
            if (bilg == kagit) {
                System.out.println("Kaybettiniz..");


            } else if (bilg == tas) {
                System.out.println("Berabere kaldiniz.");


            }

        } else if (siz == kagit) {
            if (bilg == makas) {
                System.out.println("Kaybettiniz..");
            }
            if (bilg == tas) {
                System.out.println("Kazandiniz..");


            } else if (bilg == kagit) {
                System.out.println("Berabere kaldiniz.");


            }

        } else {
            if (bilg == kagit) {
                System.out.println("Kazandiniz..");
            }
            if (bilg == tas) {
                System.out.println("Kaybettiniz..");


            } else if (bilg == makas) {
                System.out.println("Berabere kaldiniz.");


            }

        }
    }
    }







