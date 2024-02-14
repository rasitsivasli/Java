package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T03_RandomdanUretilenSayilarinEnBuyugu {
    public static void main(String[] args) {
        // rastgele 1 ile 20 arasında 100 adet sayı üretin ve en büyüğünü
        // array int[] kullanarak bulun

        List<Integer> list = new ArrayList<>();
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) ((Math.random() * 20) + 1);
        }
        System.out.println("arr = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println(arr[arr.length - 1]);
    }
}
