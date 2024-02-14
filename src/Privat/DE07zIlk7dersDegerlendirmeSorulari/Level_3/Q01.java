package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // verilen int bir sayının pozitif, yada negatif olma durumunu ekrana yazdıran bir code yazınız
        // ( if ve ternary kullanılmayacak, switch-case ile çözülecek ( ip ucu: Math.abs )
        // input : -12 , output: negatiftir
        // input :  32 , output: pozitiftir
        // (sıfır olma durumu göz artı edilmiştir)

        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        String durum = String.valueOf(Math.abs(sayi)/sayi);

        switch (durum) {
            case "1":
                System.out.println("pozitiftir");break;
            case "-1" :
                System.out.println("negatiftir");break;

        }


    }
}
