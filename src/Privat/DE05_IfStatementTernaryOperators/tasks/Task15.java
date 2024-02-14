package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean ehl = str.equals("true");

        if (ehl) {

            System.out.print("Ehliyet tecrübesi  : ");
            int yil = scan.nextInt();

            System.out.print("Mesafeyi giriniz  : ");
            int msf = scan.nextInt();

            if (yil >= 7 && msf >= 100000) {
                System.out.println("Kontak anahtarini aliniz...");
            } else if (yil < 7 && msf < 100000)
                System.out.println(7 - yil + " daha tecrübe kazanmaniz ve" + (100000 - msf) + " km yol yapmaniz gerekiyor");

            else if (yil >= 7 && msf < 100000) System.out.println((100000 - msf) + " km yol yapmaniz gerekiyor");

            else if (yil < 7 && msf > 100000) System.out.println(7 - yil + " daha tecrübe kazanmaniz gerekiyor");


        } else System.out.println("En kisa zamanda ehliyet aliniz");

    }
}





















