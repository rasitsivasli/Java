package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class _06_String_methods03 {

    public static void main(String[] args) {

    /*    paper olan bir String oluşturun.
          String'i büyük harfe çevirin ve yazdırın.
          örn: apple > APPLE   */

        //Kodu aşağıya yazınız.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String str = scanner.nextLine();
        System.out.println(str.toUpperCase());


    }
}
