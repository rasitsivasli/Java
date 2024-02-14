package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        /* 5 sayıdan en küçüğünü (if kullanarak bulunuz )
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. saiyi giriniz   : ");
        int enK = scan.nextInt();
        System.out.print("2. saiyi giriniz   : ");
        int sayi2 = scan.nextInt();
        System.out.print("3. saiyi giriniz   : ");
        int sayi3 = scan.nextInt();
        System.out.print("4. saiyi giriniz   : ");
        int sayi4 = scan.nextInt();
        System.out.print("5. saiyi giriniz   : ");
        int sayi5 = scan.nextInt();

        if (sayi2 < enK)
            enK = sayi2;
        if (sayi3 < enK)
            enK = sayi3;
        if (sayi4 < enK)
            enK = sayi4;
        if (sayi5 < enK)
            enK = sayi5;


        System.out.println("Girdiğiniz 5 sayıdan en küçüğü: " + enK);


    }
}
