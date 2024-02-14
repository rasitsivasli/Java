package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Herhangi bir kelime giriniz : ");
        String str = scanner.next();

        System.out.print("Hangi index in degerini görmek istiyorsunuz : ");
        int index = scanner.nextInt();

        System.out.println(str.charAt(index));


    }
}
