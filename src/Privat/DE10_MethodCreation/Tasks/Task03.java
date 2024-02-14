package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //Task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.


        Scanner input = new Scanner(System.in);
        System.out.print("dönüştüreceğiniz birimi giriniz : ");
        String birim = input.nextLine().toLowerCase();//saat mil kg cinsi

        System.out.print("dönüştüreceginiz birimin mikatrını giriniz : ");
        double miktar = input.nextDouble();//saat mil km miktarı

        hesaplama(miktar,birim);


    }//main sonu

    private static void hesaplama(double miktar, String birim) {

        switch (birim) {
            case "saat":
                saniye_hesapla(miktar);
                break;
            case "mil":
                km_hesapla(miktar);
                break;
            case "kg":
                gram_hesapla(miktar);
                break;
            default:
                System.out.println("Yanlis veri girdiniz..");break;
        }

    }

    private static void gram_hesapla(double miktar) {
        System.out.println(miktar+" kg = "+(miktar*1000)+" gramdir.");
    }

    private static void km_hesapla(double miktar) {
        System.out.println(miktar+" mil = "+(miktar*1.61)+" km dir.");
    }

    private static void saniye_hesapla(double miktar) {
        System.out.println((int) miktar+" saat = "+(miktar*3600)+" saniyedir.");
    }


}
