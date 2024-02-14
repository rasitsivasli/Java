package CodeChallenges.Hafta4.ForWhileOrnek;

import java.util.Scanner;

public class AsyaHanim4 {
    public static void main(String[] args) {
         /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */


        Scanner scanner = new Scanner(System.in);

        String harf = scanner.next();
        do {
            System.out.println("Bir metin giriniz :  ");

            harf = scanner.next();
        } while (!harf.equalsIgnoreCase("x"));
        System.out.println("X girdiniz");


    }
}
