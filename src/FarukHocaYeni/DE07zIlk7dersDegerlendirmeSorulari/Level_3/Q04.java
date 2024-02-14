package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // 5 karekterden oluşan bir string geriliyor, ters çevirin
        // Örnek    input : "Selam"
        //          output: "maleS"

        Scanner scanner = new Scanner(System.in);


        System.out.println("5 harfli bir kelime girniz : ");
        String str = scanner.nextLine();
/// 1. yol
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char ch3 = str.charAt(2);
        char ch4 = str.charAt(3);
        char ch5 = str.charAt(4);

        System.out.println("" + ch5 + ch4 + ch3 + ch2 + ch1);

        //2. yol

        System.out.println(str.substring(4) +
                str.substring(3, 4) +
                str.substring(2, 3) +
                str.substring(1, 2) +
                str.substring(0, 1));


    }
}
