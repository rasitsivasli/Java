package CodeChallenges.Hafta1;

import java.util.Scanner;

public class Soru12 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Vatandasi misiniz? : ");
        String vat =scan.next();
        System.out.print("Gelirinizi giriniz : ");
        int gelir =scan.nextInt();
        System.out.print("Calisma yilini giriniz : ");
        int yil =scan.nextInt();
        if (vat.equalsIgnoreCase("evet") && gelir>30000){
            System.out.println("Kredi karti alabilir siniz ");
            if (yil>3 && gelir>50000){
                System.out.println("gold credit card");
            } else if (yil<3 && gelir>50000){
                System.out.println("silver credit card");
            } else {
                System.out.println("credit card");
            }
        } else {
            System.out.println("Kredi karti alamazsiniz");
        }
}}
