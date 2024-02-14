package Privat.DE13_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06_TekElemanlariYzdirma {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */

        int[] sayiArr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sayiArr.length; i++) {
            System.out.print(i + 1 + ". elemanı agam giresen :");
            sayiArr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        tekElmanListesi(sayiArr, list);
    }//main sonu

    private static void tekElmanListesi(int[] sayiArr, List<Integer> list) {
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] % 2 == 1) list.add(sayiArr[i]);
        }
        System.out.println("list = " + list);
    }


}
