package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _17_if_else_if_statement_find_maxmitTernary {

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
        String durum = enB > i2 && enB > i3 ? "en Büyük : "+ i1 : (i2>i1 ? "en Büyük : "+i2: "en Büyük : "+i3);

        System.out.println("durum = " + durum);
    }
}