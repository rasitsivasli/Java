package CodeChallenges.Hafta3.Freitag;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        //Kullanıcıdan 5 tane sayı girmesini isteyin eğer toplamı 100 geçerse
        //"Toplamınız 100'e ulaştı daha fazla girmeyin


        Scanner scanner = new Scanner(System.in);

        int toplam = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Sayi giriniz : ");
            int n = scanner.nextInt();

            toplam += n;

            if (toplam >= 100) {
                System.out.println("100 e ulastiniz, daha fazla sayi girmeyiniz..");
                break;
            }


        }


    }

}



