package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */


        Scanner scanner = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz : ");
        String str = scanner.nextLine();
        int bosluk = str.indexOf(" ");

        System.out.println(str.substring(0,bosluk));
        System.out.println(str.substring(bosluk+1));


    }
}
