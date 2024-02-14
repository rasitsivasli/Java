package Privat.DE13Ilk13DersDegerlendirmeSorulari.Level_2;

public class T01_MathMaxIleEnBuyukSayi {
    public static void main(String[] args) {
        // 4 adet rastgele sayı üretin veya okutun , Math class yardımı ile en küçüğünü bulun,
        // sayıları üretiikten veya okuttuktan sanra
        // çözüm sadece 1 satırta bitsin ( yani tek ";" kullanılacak
        int num1 = 7;
        int num2 = 2;
        int num3 = 9;
        int num4 = 3;
        System.out.println(Math.max(Math.max(num1, num2), Math.max(num3, num4)));
    }
}
