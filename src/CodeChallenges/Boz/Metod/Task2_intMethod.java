package CodeChallenges.Boz.Metod;

import java.util.Scanner;

public class Task2_intMethod {

    /*

    Kullanicidan ismini ve soyisimini ayri ayari alin
    Isim ve soyisim ilk harfleri büyük olacak sekilde düzenleyip,
    isim bosluk soyisim seklinde yazdiran bir metod creat ediniz.
    input: isim:Ali Soyisim: YILMAZ output:Ali Yilmaz

    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen adinizi giriniz : ");
        String name =  scanner.next();
        System.out.print("Lütfen soyadinizi giriniz : ");
        String surName =  scanner.next();
        System.out.println(adSoyad(name, surName));// yazdirmak icin direkt olusturdugumu metodu sout icine yaziyoruz
        String duzenlenmisIsim = adSoyad(name,surName);//  eger en son halini kaydetmek istiyorsaniz böyle yapin



    }public static String adSoyad(String name,String surName){// buradakiler variabel dir

        name =name.toLowerCase().substring(0,1).toUpperCase()+name.substring(1);
        surName =surName.toLowerCase().substring(0,1).toUpperCase()+surName.substring(1);


        return name+" "+surName;// buradaki son yazigimiz variable main metod yazdigimiz adSoyad(name, surName) yeine geciyor
    }
}
