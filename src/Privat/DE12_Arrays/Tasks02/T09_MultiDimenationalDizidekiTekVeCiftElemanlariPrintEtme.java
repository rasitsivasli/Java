package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T09_MultiDimenationalDizidekiTekVeCiftElemanlariPrintEtme {
    //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını
    // print eden code create ediniz.
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 11, 4, 9, 12, 17};
//

        oddLetter(arr);
    }

    private static void oddLetter(int[] arr) {
        int n = arr.length;
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 1) {
                countOdd++;// Burada tek sayi adedini buluyoruz
            }
        }
        System.out.println("counEven = " + countOdd);
        int[] arrOdd = new int[countOdd];// tek sayi adedi sayisina göre yeni bir dizi olusturuyoruz

        for (int i = 0, k = 0; i < arr.length; i++) {// buradaki k yeni olusan dizinin elmanlarini yazdiracak
            if (arr[i] % 2 == 1) {
                arrOdd[k] = arr[i];
                k++;// k burada artmali aksi takdirde yadirma hatasi aliyoruz
            }
        }
        System.out.println("arrOdd = " + Arrays.toString(arrOdd));

        int[] arrEven = new int[arr.length-countOdd];// cift sayi adedini bulmak icin cikarma yaptik

        for (int i = 0, k = 0; i < arr.length; i++) {// buradaki k yeni olusan dizinin elmanlarini yazdiracak
            if (arr[i] % 2 == 0) {
                arrEven[k] = arr[i];
                k++;// k burada artmali aksi takdirde yadirma hatasi aliyoruz
            }
        }
        System.out.println("arrEven = " + Arrays.toString(arrEven));

        int [] [] arrMulti = new int[2][arrOdd.length];
        for (int i = 0 ; i < arrEven.length; i++) {
            arrMulti[0][i]=arrEven[i];
            arrMulti[1][i]=arrOdd[i];

        }
        System.out.println("Arrays.deepToString(arrMulti) = " + Arrays.deepToString(arrMulti));

    }
}

