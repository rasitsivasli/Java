package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _17_2d_Array_ {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin. Elemanlarin toplamini bulun.
        Her bir ic satirin toplamini ayri ayri hesaplayin
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.
        int[][] array = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};
        genelToplam(array);

        // Array'i yazdırma (önce değiştirilmeden önce)


        // Bütün 2'leri 6'yla değiştirme
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 6;
                }
            }
        }
        System.out.println("array = " + Arrays.deepToString(array));

    }

    private static void genelToplam(int[][] array) {
        int genelToplam = 0;
        for (int i = 0; i < array.length; i++) {
            int satirToplam = 0;// her yukari gittiginde o lamamiz gerekiyor herbir satirin toplami icin
            for (int j = 0; j < array[i].length; j++) {
                genelToplam+=array[i][j];
                satirToplam+=array[i][j];
            }
            System.out.println(i+"."+" satirToplam = " + satirToplam);// her seferinde satir toplamini yazdiriyoruz
        }
        System.out.println("Genel Toplam " + genelToplam);
    }
}