package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int i1 = scan.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int i2 = scan.nextInt();
        System.out.print("3. sayiyi giriniz : ");
        int i3 = scan.nextInt();
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        int enB = i1;

        if (enB > i2 && enB > i3) {
            System.out.println("enB = " + enB);

        } else if (i2 > i3) {
            System.out.println("enB = " + i2);
        } else {
            System.out.println("enB = " + i3);
        }
    }
}