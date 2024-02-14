package Privat.DE07lik7DersPekistirmeSorulari;

import java.util.Scanner;

public class B01 {
    public static void main(String[] args) {
        /* Scanner class yardımı ile 2 adet int sayı okutun, (s1, s2)


         1) Bu 2 sayının toplamını ekrana yazdırın







         */

//        3) Bu iki sayıdan büyük olanını ekrana if kullanarak yazdırın
//
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iki adet sayi giriniz : ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi1>sayi2){
            System.out.println("sayi1 = " + sayi1);
        }else System.out.println("sayi2 = " + sayi2);

//        4) Bu iki sayıdan büyük olanını ekrana ternary operator kullanarak yazdırın


        int enB = sayi1>sayi2? sayi1:sayi2;
        System.out.println("enB = " + enB);

//      2) Bu 2 sayının toplamını Wrapper class (Integer) yardımı ile toplatıp yazdırın


        int enBuy2 = Integer.sum(sayi1,sayi2);
        System.out.println("enBuy2 = " + enBuy2);
//
//        5) Bu iki sayıdan büyük olanını ekrana Math class  kullanarak yazdırın

        System.out.println("en"+"\n"+"buyuk"+"\n"+ "sayi"+ ":"+ Math.max(sayi1,sayi2));


        System.out.println("Bu bir çift tırnak içindeki \"slash\" karakteridir.");

    }
}
