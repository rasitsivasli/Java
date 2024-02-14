package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _13_Advance_zeroFront_ {

    public static void main(String[] args) {

      /*
   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..

        int[] intArray = {-1, 1, 0, 12, 0, 7, 0};
        int n = intArray.length;

        int[] intArray2 = new int[n];
        int k = 0;
        int sonIdx = n - 1;//  sondan itibaren yazdirmasi icin son idexi aliyoruz
        for (int i = 0; i < n; i++) {
            if (intArray[i] == 0) {
                intArray2[k] = intArray[i];// eger 0 ise yeni arr i 0 dan itibaren dolduracak
                k++;// yeni olsuturulan arr in index ini o dan itibaren arttiracak
            } else {
                intArray2[sonIdx] = intArray[i];// eger ilk dizinin indexi 0 degilse bu sayilari sondan itibaren yazdir
                sonIdx--;// sondan baslayarak yazdigimiz icin index in azalmasini saglayacak
            }
        }
        System.out.println("intArray2 = " + Arrays.toString(intArray2));
    }
}