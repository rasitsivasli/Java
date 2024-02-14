package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T17_16IleAyni_yenidenCoz {
    /* rastgele n elemanlı ( ni klavyeden okutun) bir ArrayList üretin
    (sayılar 1 ila 100 arasında olsun)     bu arrayın en küçük elemanı ile
    en büyük elemanı yer değiştirin(yer değişme işlemi bir method içinde olsun)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) ((Math.random() * 100) + 1));
        }
        System.out.println("list = " + list);
        List<Integer> listYeni = new ArrayList<>(list);

        yerDegistirme(listYeni, list);
    }

    private static void yerDegistirme(List<Integer> listYeni, List<Integer> list) {
        Collections.sort(listYeni);
        list.set(list.indexOf(listYeni.getLast()), listYeni.getFirst());// en buyuk sayiyi en kücük elemana atadik
        list.set(list.indexOf(listYeni.getFirst()), listYeni.getLast());// en buyuk sayiyi en kücük elemana atadik
        System.out.println("list = " + list);

    }
}
