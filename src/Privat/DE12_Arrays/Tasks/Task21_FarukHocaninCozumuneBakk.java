package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task21_FarukHocaninCozumuneBakk {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int[] arr = {1, 2, 3, 4, 4, 3, 2, 1};
        aynaArrayMi(arr);

    }

    private static void aynaArrayMi(int[] arr) {
        int n = arr.length;
        int[] ilkKisim = Arrays.copyOf(arr, n / 2);
        int[] ikinciKisim = Arrays.copyOfRange(arr, n / 2, n);
        int yarisi = ikinciKisim.length;

        for (int i = 0; i < yarisi/2; i++) {// ikinci kismin yarisina kadar geliyoruz yoksa aynisini yazar
            int temp = ikinciKisim[i];// ilk terimi sakladik
            ikinciKisim[i] = ikinciKisim[ yarisi- 1 - i];
            ikinciKisim[ yarisi - 1 - i]=temp;// son terimi ilk terime esitledik

        }
        System.out.println("ikinciKisim = " + Arrays.toString(ikinciKisim));
        System.out.println("Arrays.equals(ilkKisim,ikinciKisim) = " + Arrays.equals(ilkKisim, ikinciKisim));
    }


}



