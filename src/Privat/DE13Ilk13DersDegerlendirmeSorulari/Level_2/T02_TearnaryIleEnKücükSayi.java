package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class T02_TearnaryIleEnKücükSayi {
    public static void main(String[] args) {
        // 4 adet rastgele sayı üretin veya okutun , Ternary yardımı ile yardımı ile en küçüğünü bulun,
        // sayıları üretiikten veya okuttuktan sanra
        // çözüm sadece 1 satırta bitsin ( yani tek ";" kullanılacak
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num1 = scanner.nextInt();
        System.out.print("Bir sayi giriniz : ");
        int num2 = scanner.nextInt();
        System.out.print("Bir sayi giriniz : ");
        int num3 = scanner.nextInt();
        System.out.print("Bir sayi giriniz : ");
        int num4 = scanner.nextInt();

        System.out.println("En kucuk sayi : "+ (num1 < num2 && num1 < num3 && num1 < num4 ?
                num1 : num2 < num3 && num2 < num4 && num2 < num1 ?
                num2 : num3 < num4 && num3 < num2 && num3 < num1 ?
                num3 : num4));
    }
}
