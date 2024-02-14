package Privat.DE08_Loops.L02_WhileLoops.Tasks;

import java.util.Scanner;

public class Task08_nedenWhile_ile_cözelim {
    public static void main(String[] args) {
        // Task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sifre giriniz: ");
        String pass = scanner.nextLine();
        int uz = pass.length();

        if (!Character.isLowerCase(pass.charAt(0))) {
            System.out.println("Sifreniz kücük harfle baslamali.");
        } else if (!Character.isDigit(uz-1)) {
            System.out.println("Sifreniz sonu rakamla bitmeli.");
        } else if (pass.contains(" ")) {
            System.out.println("Sifreniz bosluk icermemeli.");
        } else if ((pass.length() < 10)) {
            System.out.println("Sifrenizde en az 10 karakter olmali.");
        } else System.out.println("Sifreniz basariyla olusturuldu");


    }
}
