package Privat.DE12_Arrays.Sorular;

import java.util.Arrays;

public class Soru5 {
    public static void main(String[] args) {


        int[] arrT = new int[10];

        for (int i = 0; i < arrT.length; i++) {
            int random = (int) (Math.random() * 100);
            arrT[i]=random;

        }
        System.out.println(Arrays.toString(arrT));


    }
}
