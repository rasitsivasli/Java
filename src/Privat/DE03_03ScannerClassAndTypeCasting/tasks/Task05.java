package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        System.out.println("2 adet tamsayi giriniz : ");
        Scanner scan = new Scanner(System.in);

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int toplam = sayi1+sayi2;
        int fark = sayi1-sayi2;
        int carpim = sayi1*sayi2;
        double bolum =  1.0*sayi1 /sayi2;

        System.out.println("Toplam = "+toplam+"\n"+"Fark = "+fark+"\n"+"Carpim = "+carpim+"\n"+"Bölüm = "+bolum);




    }

}
