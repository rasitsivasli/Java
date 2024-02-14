package CodeChallenges.Hafta3.Freitag;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
      /*
    // break ve continue sadece içinde bulunduğu döngüyü etkiler.
    Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
    atlar ve loop’un bir sonraki değerinden devam eder.
     */
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen metin giriniz : ");
        String str = scanner.nextLine();
        String harf = "";


        for (int i = 0; i < str.length(); i++) {

            harf=""+str.charAt(i);
//            char ch = str.charAt(i);
            if (harf.equals("a") || harf.equals(" ")) {
                continue;

            }
            System.out.println(harf);

        }

    }
}



