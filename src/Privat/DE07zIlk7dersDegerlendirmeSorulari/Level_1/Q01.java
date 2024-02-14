package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_1;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* Klavyeden girilen ve 3 harften oluşan bir string i, her satıra bir harf gelecek şekilde yazdırınız
        Örnek input : ali,
         output
         a
         l
         i
          */

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.charAt(0)+"\n"+str.charAt(1)+"\n"+str.charAt(2));

    }
}
