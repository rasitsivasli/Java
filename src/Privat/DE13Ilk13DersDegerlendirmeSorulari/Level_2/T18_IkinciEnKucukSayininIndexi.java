package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class T18_IkinciEnKucukSayininIndexi {
    /* rastgele 20 elemanlı  bir ArrayList üretin  (sayılar 1 ila 100 arasında olsun)
    bu arrayList in  en küçük 2.elemanını ve kaçıncı sırada olduğunu bulunuz

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((int) ((Math.random() * 10) + 1));
        }System.out.println("list siralanmamis = " + list);
        List<Integer> listYeni = new ArrayList<>(list);// yeni bir liste olusturdum , sort da dizi bozulmasin diye

        System.out.println("ikinciEnKucuk elamanin indexi = " + list.indexOf(enKucukIkinciEleman(listYeni)));


    }

    private static int enKucukIkinciEleman(List<Integer> listYeni) {
        Collections.sort(listYeni);
        System.out.println("list siralanmis = " + listYeni);
        int eleman = listYeni.get(1);
        System.out.println("eleman = " + eleman);
        return eleman;
    }
}
