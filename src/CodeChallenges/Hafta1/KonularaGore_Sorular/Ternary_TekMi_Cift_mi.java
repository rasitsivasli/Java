package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Ternary_TekMi_Cift_mi {


    public static void main(String[] args) {
//        kullanıcıdan alınan sayının tek mi çift mi olduğuna bakın,
//                çift sayı ise 10 un katı olup olmadığını yazdırın.
//
        Scanner scanner = new Scanner(System.in);

        int sayi = (int) (Math.random()*100);
        System.out.println("sayi = " + sayi);
//
//        if (sayi >= 0) {
//            if (sayi % 2 == 0) {
//                System.out.println("Sayi cifttir..");
//                if (sayi % 10 == 0) {
//                    System.out.println("Sayi 10 un katidir");
//                } else System.out.println("Sayi 10 un kati degildir..");
//            } else {
//                System.out.println("Sayi tektir..");
//            }
//
//        } else {
//            System.out.println("Sayi negatiftir...");
//        }

        System.out.println(sayi%3==0 ? "3 e bölünür": "3 e bölünmez");

    }
}
