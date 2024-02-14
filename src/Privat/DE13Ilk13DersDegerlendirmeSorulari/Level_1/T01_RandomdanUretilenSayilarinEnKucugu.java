package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.*;

public class T01_RandomdanUretilenSayilarinEnKucugu {
    public static void main(String[] args) {
        // 4 adet sayı üretin ve en küçüğünü bulun

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("list = " + list);
        int enKucuk = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < enKucuk) enKucuk = list.get(i);

        }
        System.out.println("enKucuk = " + enKucuk);


    }

    public static class T09 {
        public static void main(String[] args) {
            //  Öğrencinin 2 vize bir final notu veriliyor, vize ortalamasının %40, finalin %60 ı
            //  50 ve üzerinde ise başılıdır,  proğramı yazınız"

            List<Integer> list = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            System.out.print("1. Vize notunuzu giriniz : ");
            int vize1 = scanner.nextInt();
            System.out.print("2. Vize notunuzu giriniz : ");
            int vize2 = scanner.nextInt();
            System.out.print("Final notunuzu giriniz : ");
            int fnl = scanner.nextInt();

            basariliMi(vize1, vize2, fnl);


        }

        private static void basariliMi(int vize1, int vize2, int fnl) {
            double ort =  ((((vize1 + vize2) *0.5) * 0.4 )+ (double) (fnl * 6) / 10);
            System.out.println("ort = " + ort);
            if (ort >= 50) System.out.println("Basarilidir");
            else System.out.println("Basarili degildir");
        }
    }
}
