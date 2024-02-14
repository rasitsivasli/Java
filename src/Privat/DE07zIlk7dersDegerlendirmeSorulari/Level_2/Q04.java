package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Verilen bir string içerisinde kaç adet a harfi vardır ( 'a' ve 'Baba' dahil)
        // Örnek    input : "Merhaba Ahmet Ağa"
        //          output: 5

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir seyler yaziniz : ");


        String str = scanner.nextLine().toLowerCase();

        String str2 = str.replace("a", "");
        System.out.println(str2);

        System.out.println(str.length()-str2.length());

    }
}
