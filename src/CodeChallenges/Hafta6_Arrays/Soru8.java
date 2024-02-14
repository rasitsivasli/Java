package CodeChallenges.Hafta6_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {

       /* Task->
    Girilen bir tamsayı için
    Bu sayinin negatif veya pozitif oldugunu,
    tek mi cift mi oldugunu ve
    uc basamakli veya daha buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
    100'den kucukse sadece birler basamagini print eden method'lar create ediniz.
    */

        System.out.print("Bir sayi giriniz : ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        checkNum(num);

    }

    private static void checkNum(int num) {
        if (num >= 0) {
            System.out.println("Sayi pozitiftir");
        } else {
            System.out.println("Sayi negatiftir");
        }
        if (num % 2 == 0) {
            System.out.println("Sayi cifttir");
        } else {
            System.out.println("Sayi tektir");
        }
        if (num >= 100) {
            String numStr = String.valueOf(num);
            int toplam = 0;
            for (int i = numStr.length()-1; i >numStr.length()-4 ; i--) {
                int ch = Integer.parseInt(numStr.charAt(i)+"");
                toplam += ch;

            }
            System.out.println("Rakamlar toplami = " + toplam);
        } else {
            System.out.println("Birler Basamagi : " + num % 10);


        }
    }
}
