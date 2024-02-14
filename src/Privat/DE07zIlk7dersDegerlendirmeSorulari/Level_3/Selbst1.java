package Privat.DE07zIlk7dersDegerlendirmeSorulari.Level_3;

import java.util.Scanner;

public class Selbst1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Metin giriniz : ");
        String str = scanner.nextLine();
        int uz = str.length();
        if (uz%2==1){
            System.out.println(str.charAt((uz-1) /2));
        }else {
            System.out.println("Girilien uzunluk cift : "+str.charAt(uz/2-1)+str.charAt(uz/2));
            System.out.println(str.substring(uz/2-1,uz/2+1));
        }

    }

}
