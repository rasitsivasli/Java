package CodeChallenges.Boz.Ornekler;

import java.util.Scanner;

public class ornek3 {
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

        System.out.println("Vatandas misiniz");
        String vatandas = scanner.next();

        if (vatandas.equalsIgnoreCase("evet")) {
            System.out.println("Gelirinizi giriniz : ");
            int gelir = scanner.nextInt();
            System.out.println("Calisma yilinizi giriniz : ");
            int yil = scanner.nextInt();
            if (gelir >= 50000 && yil > 3) {
                System.out.println("Gold card");
            } else if (gelir >= 50000 && yil < 3) {
                System.out.println("Silver card");
            } else {
                System.out.println("Normal card");
            }
        } else {
            System.out.println("Malesef kredi karti alamazsiniz");
        }


    }
}

















/*   Scanner scanner = new Scanner(System.in);
        System.out.println("Vatandas misiniz?");
        String vatandas = scanner.nextLine();
        System.out.println("Geliriniz ne kadar? : ");
        int gelir = scanner.nextInt();
        if ((vatandas.equalsIgnoreCase("evet") && gelir > 30000)) {
            System.out.println("Calisma yilinizi giriniz? ");
            int calYil = scanner.nextInt();
            if (calYil > 3 && gelir > 50000) {
                System.out.println("Gold kredi karti alabilirsiniz.");
            }
            if (calYil < 3 && gelir > 50000) {
                System.out.println("Silver kredi karti alabilirsiniz.");
            } else {
                System.out.println("Normal kredi karti alabilirsiniz.");
            }
        } else {
            System.out.println("Kredi karti alamazsiniz.");
        }*/