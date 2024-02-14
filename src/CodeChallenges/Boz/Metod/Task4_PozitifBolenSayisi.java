package CodeChallenges.Boz.Metod;

import java.util.Scanner;

public class Task4_PozitifBolenSayisi {
    public static void main(String[] args) {

/*
Lullanicidan main method icinde bir tamsayi alin
girilen sayinin pozitif tam bölenlerinin sayisini
bulup bize döndüren bir method olusturun
*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int num = scanner.nextInt();
        int bolenSayisi= pozitifBolenSayisi(num);
        System.out.println(bolenSayisi);
        System.out.println(Task3_MetodIleAsalSayiKontrolu.asalMi(61));

    }

    public static int pozitifBolenSayisi(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                counter++;
            }
        }
        return counter;
    }

}
