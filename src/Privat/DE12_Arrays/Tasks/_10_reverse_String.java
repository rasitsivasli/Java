package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str = "Hello World";

        String[] strArray = new String[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strArray[i] = String.valueOf(str.charAt(i));// Array deki herbir bos elemani str den char lar ile doldurduk

        }

        String ch = "";
        for (int i = strArray.length - 1; i >= 0; i--) {
            ch = strArray[i];
            System.out.print(ch);
        }


    }
}