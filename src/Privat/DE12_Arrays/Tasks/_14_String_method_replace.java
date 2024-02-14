package Privat.DE12_Arrays.Tasks;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String str = "Hello World";
        System.out.println(str.replace("o","K"));// Mit der Replace ist das ganz einfach zu lösen.


        char[] arr = str.toCharArray();
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'o') {
                arr[i] = 'K';
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));


    }

}
