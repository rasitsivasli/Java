package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        int sayi = 123;
        String str = String.valueOf(sayi);

        String []dizi = str.split("");

        System.out.println("dizi = " + Arrays.toString(dizi));

        for(int i=str.length()-1;i>=0;i--)
        {
            System.out.print(dizi[i]);
        }
    }
}


