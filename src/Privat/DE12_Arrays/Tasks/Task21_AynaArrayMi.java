package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class Task21_AynaArrayMi {

    public static void main(String[] args) {
		/* TASK :
		ayna check sorusu: verilen Arrayın Ayna array olmasını kontrol eden code create ediniz
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */

        int[] arr1 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
//        arrSimetrikMi(arr1);
//        arrSimetrikMiIkinciYol(arr1);
        arrSimetrikMiUcuncuYol(arr1);
    }

    private static void arrSimetrikMiUcuncuYol(int[] arr1) {
        int n= arr1.length;
        int yarisi= arr1.length/2;
        int [] ilkParca= new int[yarisi];
        int [] ikinciParca= new int[yarisi];

        for (int i = 0; i < yarisi; i++) {
            ilkParca[i]=arr1[i];
            ikinciParca[i]=arr1[n-1-i];// sondan basliyor yazmaya

        }
        System.out.println("ilkParca = " + Arrays.toString(ilkParca));
        System.out.println("ikinciParca = " + Arrays.toString(ikinciParca));
        System.out.println("ilkParca.equals(ikinciParca) = " + Arrays.equals(ilkParca, ikinciParca));


    }

    private static void arrSimetrikMiIkinciYol(int[] arr1) {
        int n= arr1.length;
        int[] arr1IlkKisim = Arrays.copyOf(arr1, n / 2);
        System.out.println("arr1IlkKisim = " + Arrays.toString(arr1IlkKisim));
        int[] arr1IkinciKisim = Arrays.copyOfRange(arr1, n / 2,n);
        int [] tersArrIkinciKisim = new int[arr1IkinciKisim.length];
        for (int i = 0; i < arr1IkinciKisim.length; i++) {
            tersArrIkinciKisim[i] = arr1IkinciKisim[arr1IkinciKisim.length-1-i];
        }
        System.out.println("tersArrIkinciKisim = " + Arrays.toString(tersArrIkinciKisim));
        System.out.println(Arrays.equals(tersArrIkinciKisim, arr1IlkKisim));

    }

    private static void arrSimetrikMi(int[] arr1) {
        int n = arr1.length;
        // Verilen Array 2 kisma ayriliyor
        int[] arrIlkKisim = new int[n / 2];
        int[] arrIkinciKisim = new int[n / 2];

        if (n % 2 == 0) {// Birinci array in elemanlari olusuyor
            for (int i = 0; i < n / 2; i++) {
                arrIlkKisim[i] = arr1[i];
            }
            System.out.println("arrIlkKisim = " + Arrays.toString(arrIlkKisim));

            for (int i = n - 1, j = 0; i >= n / 2; i--, j++) {// 2. arrayin elemanlari tersten yaziliyor
                arrIkinciKisim[j] = arr1[i];// j ikinci olusturulan Array in indexini arttirnak icin
            }
            System.out.println("arrIkinciKisim = " + Arrays.toString(arrIkinciKisim));
            if (Arrays.equals(arrIlkKisim, arrIkinciKisim)) {// Olusturulan Array larin esitligi kontrol ediliyor...
                System.out.println("Verilen array simetriktir");
            }
        } else {
            System.out.println("Dizinin toplam eleman sayisi tek oldugu icin simetrik olamaz.");
        }


    }
}


