package Privat.DE07lik7DersPekistirmeSorulari;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class B02 {
    public static void main(String[] args) {
         /* Scanner class yardımı ile 3 adet int sayı okutun, (s1, s2, s3)
        1) Bu 3 sayının toplamını ekrana yazdırın
        2) Bu 3 sayının toplamını Wrapper class (Integer) yardımı ile toplatıp ekrana yazdırın

        4) Bu 3 sayıdan büyük olanını ekrana ternary operator kullanarak yazdırın
        5) Bu 3 sayıdan büyük olanını ekrana Math class  kullanarak yazdırın

          */

        Scanner scanner = new Scanner(System.in);
        System.out.print("3 adet sayi giriniz : ");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

//        2) Bu 3 sayının toplamını Wrapper class (Integer) yardımı ile toplatıp ekrana yazdırın

        System.out.println(Integer.sum(sayi1,Integer.sum(sayi2,sayi3)));

//        3) Bu 3 sayıdan büyük olanını ekrana if kullanarak yazdırın

        if (sayi1>sayi2 && sayi1>sayi3) System.out.println("sayi1 en buyuk");
        else if (sayi2>sayi3 && sayi2>sayi1) System.out.println("sayi2 en buyuk");
        else System.out.println("sayi 3 en büyük");

//        4) Bu 3 sayıdan büyük olanını ekrana ternary operator kullanarak yazdırın

        System.out.println(sayi1>sayi2? (sayi1>sayi3?sayi1:sayi3):(sayi2>sayi3?sayi2:sayi3) );
    }
}
