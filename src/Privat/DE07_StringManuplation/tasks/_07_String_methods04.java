package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class _07_String_methods04 {

    public static void main(String[] args) {

        /* OraNge olan bir String oluşturun.
           String'i küçük harfe çevirin ve yazdırın.
           örn: APPLE > apple  */

        //Kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir cümle girin");
        String str = scanner.nextLine();
        System.out.println(str.toLowerCase());



    }
}
