package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task02_OgrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        List<Integer> listNotlar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac adet not girmek istiyorsunuz : ");
        int n = scanner.nextInt();
        ortalamayiGecenSayi(n, listNotlar);

    }

    private static void ortalamayiGecenSayi(int n, List<Integer> listNotlar) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.print("Not giriniz : ");
            listNotlar.add(scanner.nextInt());
        }

        System.out.println("listNotlar = " + listNotlar);
        int toplam = 0;
        for (int i = 0; i < listNotlar.size(); i++) {
            toplam += listNotlar.get(i);
        }
        double ort = (double) toplam / n;
        int count = 0;
        for (int i = 0; i < listNotlar.size(); i++) {
            if (listNotlar.get(i)>ort) count++;
        }
        System.out.println("count = " + count);
    }


}
