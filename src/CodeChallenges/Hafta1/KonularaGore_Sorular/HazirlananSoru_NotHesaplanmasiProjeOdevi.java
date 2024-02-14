package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class HazirlananSoru_NotHesaplanmasiProjeOdevi {

    /*1. Ögrencinin 0 ile 100 arasinda aldigi nota göre yil sonu notunu hesapliyoruz.
- Proje ödevine katilmadiysa notlari dikkate alinmaz ve ögrenim yilini tekrarlamasi gerekir.
- yil sonu notu icin vize 40%, final %60 etkiye sahiptir.
-Proje ödevini teslim etmis ve gecerli not almisa sa;
-100>=notOrt.>=90 = AA
-90>notOrt.>=80 = BB
-80>notOrt.>=70 = CC
-70>notOrt.>=60 = DD
-60>notOrt. = FF
-Proje ödevini teslim etmis ama gecerli not alinamamis sa, sinav notlarinin degerlendirmeye alinmasi icin projesindeki eksikleri 10 gün icinde tamamlamalidir.*/


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Projenizi teslim ettinizmi : ");
        String projeTeslimEd = scan.next();

        if (projeTeslimEd.equalsIgnoreCase("evet")) {
            System.out.print("Proje ödevinizden gecerli not aldiniz mi? : ");
            String projeGecerliMi = scan.next();
            if (projeGecerliMi.equalsIgnoreCase("evet")) {
                System.out.println("Vize notu : ");
                int vize = scan.nextInt();
                System.out.println("Final notu : ");
                int fnl = scan.nextInt();
                double notOrt = vize * 0.4 + fnl * 0.6;
                if (vize >= 0 && vize <= 100 && fnl >= 0 && fnl <= 100) {

                    if (100 >= notOrt && notOrt >= 90) {
                        System.out.println("notOrt = " + notOrt + " AA");
                    } else if (90 >= notOrt && notOrt >= 80) {
                        System.out.println("notOrt = " + notOrt + " BB");
                    } else if (80 >= notOrt && notOrt >= 70) {
                        System.out.println("notOrt = " + notOrt + " CC");
                    } else if (70 >= notOrt && notOrt >= 60) {
                        System.out.println("notOrt = " + notOrt + " DD");
                    } else if (notOrt < 60) {
                        System.out.println("notOrt = " + notOrt + " FF");
                    }
                } else {
                    System.out.println("Gecersiz bir not girdiniz!!!!");
                }

            } else {
                System.out.println("Malesef projenizde eksikler vardir, bunlar 10 gün icinde giderilmelidir....");

            }
        } else {
            System.out.println("Malesef ögrenim yilini tekrarlamaniz gerekmektedir....");
        }
    }
}
