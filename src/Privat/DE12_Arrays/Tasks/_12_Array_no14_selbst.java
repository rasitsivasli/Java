package Privat.DE12_Arrays.Tasks;

import java.util.Scanner;

public class _12_Array_no14_selbst {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here
        System.out.println(" Dizi olusturmak icin 5 adet int deger giriniz : ");
        Scanner scan = new Scanner(System.in);

        int[] intArr = new int[5];
        int n = intArr.length;
        for (int i = 0; i < n; i++) {
            intArr[i] = scan.nextInt();
        }
        boolean sonuc = birVeDortVarMi(intArr, n);
        System.out.println("sonuc = " + sonuc);

    }
    private static boolean birVeDortVarMi(int[] intArr, int n) {
        boolean birVarMi = false;
        boolean dortVarMi = false;
        for (int i = 0; i < n; i++) {

            if (intArr[i] == 1) {
                birVarMi = true;
            } else if (intArr[i] == 4) {
                dortVarMi = true;
            }
        }
        return !(birVarMi&&dortVarMi);
    }

}

