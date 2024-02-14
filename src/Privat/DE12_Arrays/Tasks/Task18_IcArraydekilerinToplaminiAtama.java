package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task18_IcArraydekilerinToplaminiAtama {
    public static void main(String[] args) {
        // Task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}

        newArr();
    }

    private static void newArr() {
        int[][] sayi = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int[] newArr = new int[sayi.length];

        for (int i = 0; i < sayi.length; i++) {
            int toplam = 0;
            for (int i1 = 0; i1 < sayi[i].length; i1++) {
                toplam += sayi[i][i1];

            }
            newArr[i] = toplam;

        }
        System.out.println("newArr = " + Arrays.toString(newArr));


    }
}


































