package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T07_DizidekiTekElemanlariPrintEtme {
    //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını
    // print eden code create ediniz.
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 11, 4, 9, 12, 17};

        oddLetter(arr);
    }

    private static void oddLetter(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 1) {
                count++;// Burada tek sai adedini buluyoruz
            }
        }
        System.out.println("count = " + count);
        int[] arrOdd = new int[count];// tek sayi adedi sayisina göre yeni bir dizi olusturuyoruz

        for (int i = 0, k = 0; i < arr.length; i++) {// buradaki k yeni olusan dizinin elmanlarini yazdiracak
            if (arr[i] % 2 == 1) {
                arrOdd[k] = arr[i];
                k++;// k burada artmali aksi takdirde yadirma hatasi aliyoruz
            }
        }
        System.out.println("arrOdd = " + Arrays.toString(arrOdd));

    }
}

