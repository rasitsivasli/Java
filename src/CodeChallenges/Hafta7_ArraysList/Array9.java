package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array9 {
    public static void main(String[] args) { //    //1.adim str tanimladik

        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac elemanli bir list olusturmak istiyorsunuz : ");
        int n = scanner.nextInt();
        System.out.print("En büyük kac sayi görmek istiyorsunuz : ");
        int enBuyukSayiAdedi = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("list = " + list);

        System.out.println( list.reversed());

        for (int i = 0; i < enBuyukSayiAdedi; i++) {
            int enBuyuk = list.get(0);
            for (int j = 0; j < list.size(); j++) {

                if (list.get(j) > enBuyuk) {
                    enBuyuk = list.get(j);
                }
            }System.out.println("En Büyük "+(i+1)+". eleman : " + enBuyuk);
            list.remove(list.indexOf(enBuyuk));// en büyügün indexi ni sildim..

        }


    }
}



