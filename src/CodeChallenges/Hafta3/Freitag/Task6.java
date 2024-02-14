package CodeChallenges.Hafta3.Freitag;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
  /*   Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazın
        Örnek Ekran Çıktısı
        Girilen sayı=4               1 -> 1  2-> 4  3->9
        Kareler toplamı=14
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        int n = scanner.nextInt();
        int toplam=0;

        for (int i = 1; i < n ; i++) {

            toplam+=i*i;// toplam+=Math.pow(i,2);
            System.out.println(i+" -> "+i*i);


        }System.out.println("toplam = "+toplam);




    }

    }



