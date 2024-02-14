package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Expilict_implicit {
    public static void main(String[] args) {

//Kullanıcıdan alınan short değerleri önce int'e atayın ardından double

        //Tüm değerleri ekrana yazdırın
//Kullanıcıdan alınan short değerleri önce int'e atayın ardından double
        //Tüm değerleri ekrana yazdırın
        //Kullanıcıdan alınan double telefon numarasını int değere atayın ve ekrana
        // implicit casting : kücük büyüge aktariliyor, kendiliginden aktarilir
        // exipilcit casting : büyük kücüge aktarilir ve kullanici tarafindan manuel yapilmak zorundadir. ver kaybi olabilir

        Scanner scanner = new Scanner(System.in);
        System.out.print("Short bir deger giriniz : ");
        short sayi1 = scanner.nextShort();
        int sayi2 = sayi1;
        System.out.println("Short deger int olarak = " + sayi2);

        System.out.print("double bir deger giriniz : ");
          double sayi3 = scanner.nextDouble();
          int sayi4 = (int) sayi3;
        System.out.println("double deger int. olarak  = " + sayi4);
    }
}
