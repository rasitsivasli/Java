package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */
        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz : ");
        int i1 = scan.nextInt();
        System.out.print("2. sayiyi giriniz : ");
        int i2 = scan.nextInt();
        System.out.print("3. sayiyi giriniz : ");
        int i3 = scan.nextInt();


        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
        int enK = i1;
        String durum = enK < i2 && enK < i3 ? "en Kücük : "+ i1 : (i2<i3 ? "en Kücük : "+i2: "en Büyük : "+i3);

        System.out.println("durum = " + durum);



    }
}
