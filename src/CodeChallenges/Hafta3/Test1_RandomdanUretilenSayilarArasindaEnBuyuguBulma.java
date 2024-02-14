package CodeChallenges.Hafta3;

import java.util.Scanner;

public class Test1_RandomdanUretilenSayilarArasindaEnBuyuguBulma {
    public static void main(String[] args) {

        //write a code that take  numbers from user at 3 times
        //return maximum number

        //And return minumum number
        Scanner scanner = new Scanner(System.in);

        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;
        System.out.print("Randomdan üretilen 1 ile 100 arasinda 10 adet sayi  : ");

        for (int i = 0; i < 10; i++) {
            int random= (int) (Math.random()*100);
            System.out.print(random+",");

            if (random>enBuyuk){
                enBuyuk=random;
            }if (random<enKucuk){
                enKucuk=random;
            }
        }
        System.out.println();
        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enKucuk = " + enKucuk);


    }
}
