package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class krediKartiAlinabilirMi_sORUSU {
    public static void main(String[] args) {
        //Kullanıcıdan alınan bilgilere göre kredi kartı veren banka uygulaması
        //Eğer vatandaş kimliği yoksa  kredi kartı verilemez
        //Vatandaşı ve 30.000 Tl'den fazla geliri varsa verilebilir
        //Çalışma yılı 3 yıldan fazla ve geliri 50.000 Tl 'den fazla ise gold credit card
        //Çalışma yılı 3 yıldan az ve geliri 50.000'Tl'den fazla ise silver credit card
        //Diğerleri credit card
        // ilk kontrol vatandaş mı ve geliri 30.000'den fazla mı değil mi?if-else
        //gold: year>3 and salary>50.000
        //silver:year <3 and salary >50.000
        //credit:otherwise
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you Citizen ? : ");
        boolean isCitizen = scanner.nextBoolean();

        System.out.print("Gelirinizi giriniz : ");
        int salary = scanner.nextInt();
        if (isCitizen && salary>=30000) {
            System.out.print("Calisma yilinizi giriniz : ");
            int age = scanner.nextInt();

            if (age>3 && salary >= 50000) {
                System.out.println("Silver Card");
            }else if (age<3 && salary >= 50000){
                System.out.println("Gold Cart");

            } else  {
                System.out.println("Normal Cart");
            }

        } else {
            System.out.println("Kredi karti alamazsiniz...");
        }


    }
}
