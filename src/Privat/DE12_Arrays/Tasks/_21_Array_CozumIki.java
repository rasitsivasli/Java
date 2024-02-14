package Privat.DE12_Arrays.Tasks;

import java.util.Scanner;

public class _21_Array_CozumIki {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        System.out.print("Bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String sayi = scanner.next();

        for (int i = sayi.length()-1 ; i >=0 ; i--) {
            char ch=sayi.charAt(i);
            System.out.print(ch);
        }
    }
}



