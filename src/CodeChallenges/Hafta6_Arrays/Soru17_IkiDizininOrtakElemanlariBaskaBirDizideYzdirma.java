package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;

public class Soru17_IkiDizininOrtakElemanlariBaskaBirDizideYzdirma {
    public static void main(String[] args) {

        //İki dizinin ortak elemanlarını başka bir dizide gösterin
        String[] a = {"akın", "hüseyin", "zehra", "ali", "ahmet", "Zeynep", "yusuf"};
        String[] b = {"hüseyin", "asim", "zehra"};
        int count = 0;

        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (b[i].equals(a[j])) {
                    count++;// en fazla tekrar eden elemani bulmak ve yeni arr in eleman sayisi icin
                }
            }
        }
        System.out.println("count = " + count);
        String[] newArr = new String[count];
        int k = 0;
        for (int i = 0; i < b.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (b[i].equals(a[j])) {
                    newArr[k] = b[i];
                    k++;
                }
            }
        }
        System.out.println("newArr = " + Arrays.toString(newArr));
    }
}

