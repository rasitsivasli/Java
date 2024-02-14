package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {
        /*
          TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
                kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
                kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Cinsiyetinizi erkek veya kadin olarak giriniz  : ");
        String str = scan.nextLine();

        System.out.print("Yasinizi giriniz  : ");
        int age = scan.nextInt();

        System.out.print("Prim gununuzu giriniz  : ");
        int prim = scan.nextInt();

        boolean isShe = str.equals("KADIN");

        if (isShe) {
            if (age > 60 && prim > 6000) {
                System.out.println("Tebrikler emekli oldunuz..");

            } else if (age < 60 && prim > 6000) {
                System.out.println(60 - age + " yil daha beklemelisiniz.");

            } else {
                System.out.println(6000 - prim + " prim gününü doldurmaniz gerekiyor.");
            }

        }
        else if (age > 65 && prim > 7000) {
            System.out.println("Tebrikler emekli oldunuz..");
        } else if (age < 60 && prim > 6000) {
            System.out.println(65 - age + " yil daha beklemelisiniz.");
        } else {
            System.out.println(7000 - prim + " prim gününü doldurmaniz gerekiyor.");
        }
    }
}
