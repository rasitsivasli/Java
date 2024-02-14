package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _12_Array_no14_Cozum {

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
        System.out.print("Araya bosluk birakarak sayilar giriniz : ");
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();

        String[] arr1 = str1.split(" ");

        int[] intArr = new int[arr1.length];

        int count = 0;

        for (int i = 0; i < intArr.length; i++) {

            int i1 = Integer.parseInt(arr1[i]);

            intArr[count] = i1;

            count++;
        }

        //Kod buradan başlıyor.. Yukarısını değiştirmeyiniz..
        // intArr ı kullanın.
        boolean sonuc = birVeDortVarMi(intArr);
        System.out.println("sonuc = " + sonuc);

    }

    private static boolean birVeDortVarMi(int[] intArr) {

        System.out.println("intArr = " + Arrays.toString(intArr));
        boolean birVeyaDortVarMi = false;

        for (int i = 0; i < intArr.length; i++) {
            if (!(intArr[i] == 1 || intArr[i] == 4)&&(intArr[i] == 1 && intArr[i] == 4)) {
                birVeyaDortVarMi=true;
            }


        }
        return !(birVeyaDortVarMi);
    }
}
