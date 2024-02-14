package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06 {


    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen)
        // alan ve çevre değerlerini print eden METHOD  create ediniz
        Scanner input = new Scanner(System.in);
        System.out.print("Alanini ve cevresini hesaplamak istediginiz sekli 'Kare','Dikdortgen','Ucgen' olarak giriniz");
        String secim = input.next();
        System.out.print("1. kenar giriniz : ");
        int num1 = input.nextInt();
        System.out.print("2. kenar giriniz : ");
        int num2 = input.nextInt();

        hesaplama(secim, num1, num2);
    }//main sonu

    public static void hesaplama(String secim, int a, int b) {

        switch (secim) {
            case "Kare":
                System.out.println("Alan = " + (a * b));
                System.out.println("Cevre = " + 2*(a + b));
                break;
            case "Dikdortgen":
                System.out.println("Alan = " + (a * b));
                System.out.println("Cevre = " + 2*(a + b));
                break;
            case "Ucgen":
                System.out.println("Alan = " + (a * b)/2);
                System.out.println("Cevre = " + (a + b+(Math.sqrt(a*a+b*b))));
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
        }

    }
}
