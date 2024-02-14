package Privat.DE12_Arrays.Sorular;

import java.util.Arrays;

public class Soru6 {
    public static void main(String[] args) {

   /* Random dan üretilen 1 ile 100 arasinda üretilen 10 adet sayiyi yazdirin
   Bu üretilen sayilardan en büyügünü ve en kücügünü bulun
   Üretilen en büyük ve en kücük sayinin inde ini bulunuz..*/

        int[] arrT = new int[10];

        for (int i = 0; i < arrT.length; i++) {
            int random = (int) (Math.random() * 100);
            arrT[i] = random;
        }
        int enBuyuk = Integer.MIN_VALUE;

        int index = 0;// en büyük sayinin indexi bulnak icin index tanimladik
        for (int i = 0; i < 10; i++) {
            if (arrT[i] > enBuyuk) {
                enBuyuk = arrT[i];
                index = i;// en son en büyük sayinin indexi ne oldugunu ögrenmek icin.En son durumda en büyügünün indexi dir
            }
        }
        System.out.println("arrT dizisinin önceki hali = " + Arrays.toString(arrT));
        int gecici;
        gecici= arrT[0];
        arrT[0]=arrT[index];
        arrT[index]=gecici;

        System.out.println("arrT dizisinin sonraki hali= " + Arrays.toString(arrT));
    }
}
