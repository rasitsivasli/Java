package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class Iftask4 {
    public static void main(String[] args) {

/* Input from user time like 12:23 check time and give message
        Ex:
        06 ~ 12 ==> good morning
        12 ~ 15 ==> good afternoon
        15 ~ 20 ==> good evening
        20 ~ 06 ==> good night
             */


        Scanner scan =new Scanner(System.in);
        System.out.print("Lütfen saati giriniz : ");
        String saat= scan.nextLine();
        int s = Integer.parseInt(saat.substring(0, 2));

        if (s>6 && s<12){
            System.out.println(" good morning");
        }else if (s>=12 && s<15) {
            System.out.println("good afternoon");
        } else if (s>=15 && s<20) {
            System.out.println("good evening");
        } else if (s>=20 && s<23) {
            System.out.println("good night");
        }

    }
}
