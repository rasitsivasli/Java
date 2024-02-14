package Privat.DE08_Loops.L01_ForLoops.Task2;

import java.util.Scanner;

public class Task02_06_NtaneUretilenSayidanTeklerinToplami {
    public static void main(String[] args) {
        // 1 ila 10 arasında rastgele üretilen n adet int sayıdan
        // tek olanların toplamını ekrana yazdıran program yazınız


        Scanner scanner = new Scanner(System.in);
        System.out.println("Random dan kac sayi üretmek istiyorsunuz : ");
        int n = scanner.nextInt();
        int toplam = 0;
        System.out.print("üretilen sayilar : ");
        for (int i = 0; i < n; i++) {
            int random = (int) (Math.random() * 100 + 1);
            System.out.print(random + ",");
//
//            if (random % 2 == 1) {
//                toplam+=random;
//
//            }
//        }
//        System.out.println();
//        System.out.print("toplam : " + toplam);
        }
    }}
