package CodeChallenges.Hafta2.Freitag;

import java.util.Locale;
import java.util.Scanner;

public class IfTask6 {
    public static void main(String[] args) {
   /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
    switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri
    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri
    gun carsamba veya cumartesi ise:
    SQL dersi gunleri
    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Günü giriniz : ");
        String gun = scan.next().toLowerCase(Locale.ROOT);


        switch (gun) {
            case "pazartesi","sali" :
                System.out.println("Java günleri");
                break;
            case "persembe","cuma":
                System.out.println("Selenyum günleri");
                break;
            case "carsamba","cumartesi":
                System.out.println("Selenyum günleri");
                break;
            case "pazar":
                System.out.println("Izin günü");
                break;
            default:
                System.out.println("yanlis giris yaptiniz");


        }


    }
}
