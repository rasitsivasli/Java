package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.*;

public class T16_ListdeEnBüyükVeEnKücügüDegistirme_SortOlmadanCoz {
    /* rastgele n elemanlı ( ni klavyeden okutun) bir array üretin
    (sayılar 1 ila 100 arasında olsun)     bu arrayın en küçük elemanı ile
    en büyük elemanı yer değiştirin(yer değişme işlemi bir method içinde olsun)
    sort ile cozum yanlis
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
        yerDegistirme(list);
    }

    private static void yerDegistirme(List<Integer> list) {
        Collections.sort(list);
        int temp = list.get(0);// en kücük sayiyi gecici bir elemana atadik
        list.set(0, list.getLast());// en buyuk sayiyi en kücük elemana atadik
        list.set(list.size()-1, temp);
        System.out.println("list = " + list);
    }
}
