package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /* Task->
    Fazla mesaiyi hesaplayan ve toplam kazancı return eden method create ediniz


    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Örnek :
    saatlik çalışma ücreti : 40.0
   iş başı saati : 9.0
    paydos saati : 20.0
    fazla mesaiyi saat ücreti çarpanı: 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        double sonuc = toplamKazanc();
        System.out.println("toplam geliriniz : " +sonuc);


    }//main sonu

    private static double toplamKazanc() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Saatlik calisma ücretinizi giriniz : ");
        double saatUcreti = scanner.nextDouble();
        System.out.print("Is basi saatinizi giriniz : ");
        double isBasi = scanner.nextDouble();
        System.out.print("Paydos saatinizi giriniz : ");
        double paydos = scanner.nextDouble();
        System.out.print("Fazla mesai carpaninizi giriniz : ");
        double mesaiCarpani = scanner.nextDouble();

        return (paydos - isBasi) * saatUcreti + (paydos - isBasi - 8) * mesaiCarpani;
    }


}//class sonu
