package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class selbst2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Mail adresi giriniz : ");
        String str = scanner.nextLine();

        if (!str.contains("@")){
            System.out.println("gecersiz mail");

        }else if (!str.contains("@gmail")){
            System.out.println("mail gmail olmali");
        }else if (!str.endsWith("@gmail.com")){
            System.out.println("mail de yazim hatasi var..");
        }else System.out.println("dogru giris yapriniz..");
    }
}
