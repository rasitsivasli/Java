package _____OSA_____.DE40InterviewQuestions.Day02;

import java.util.Scanner;

public class Q002_AmstrongNumber_4Digits {
    /*
   Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
       (0, 1, 153, 370, 371, 407, 1634)
       153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
       370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
       1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

       5 basamakli : 54748 = 5*5*5*5*5 + 4*4*4*4*4 + 7*7*7*7*7

     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        String strSayi = scan.next();
        int toplam = 0;
        for (String string : strSayi.split("")) {
            int sayi = Integer.parseInt(string);
            toplam += (int) Math.pow(sayi, strSayi.length());
        }
        if (toplam == Integer.parseInt(strSayi)) System.out.println("Sayi Armstrong sayidir");
        else System.out.println("Sayi Armstrong sayi degildir");


    }


}
