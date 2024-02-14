package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.ArrayList;
import java.util.Arrays;

public class T18_ListdekiElemanlarinKareleriyleArrayOlustur {
    /*  verilen ArrayListin Karelerinden oluşan bir array oluşturun
        (3 yerine 9), (5 yerine 25) gibi
     */
    public static void main(String[] args) {
        ArrayList<Double> dizi = new ArrayList<>(Arrays.asList(3.5, 6.0, 3.5, 76.4, 4.0));
        double[] arr = new double[dizi.size()];
        for (int i = 0; i < dizi.size(); i++) {
            arr[i] = dizi.get(i) * dizi.get(i);
        }
        System.out.println("arr = " + Arrays.toString(arr));
    }


}
