package Privat.DE12_Arrays.Sorular;

import java.util.Arrays;

public class Soru4_enBüyük_EnKucuk_IndexBulma {
    public static void main(String[] args) {

   /* Random dan üretilen 1 ile 100 arasinda üretilen 10 adet sayiyi yazdirin
   Bu üretilen sayilardan en büyügünü ve en kücügünü bulun
   Üretilen en büyük ve en kücük sayinin inde ini bulunuz..*/

        int[] arrT = new int[10];

        for (int i = 0; i < arrT.length; i++) {
            int random = (int) (Math.random() * 100);
            arrT[i] = random;

        }
        System.out.println("arrT = " + Arrays.toString(arrT));

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        int index = 0;// en büyük sayinin indexi bulnak icin index int i tanimladik
        for (int i = 0; i < 10; i++) {
            if (arrT[i] > enBuyuk) {
                enBuyuk = arrT[i];
                index = i;// en son en büyük sayinin indexi ne oldugunu ögrenmek icin...
            }

        }
        System.out.println("En büyük sayinin indexi = " + index);


        for (int i = 0; i < 10; i++) {
            if (arrT[i] < enKucuk) {
                enKucuk = arrT[i];
                index = i;
            }
        }
        System.out.println("En kücük sayinin indexi = " + index);
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);


    }
}
