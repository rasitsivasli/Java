package _____OSA_____.DE40InterviewQuestions.Day01.Cozumler;

import java.util.Scanner;

public class Q03_PrimeNumber {
    /*
    Ask user enter a positive number and check if it is prime or not
    Kullan?c?dan pozitif bir say? girmesini isteyin ve asal olup olmad???n? kontrol edin
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz :");
        int sayi = scanner.nextInt();
        boolean asalmi=true;
        if (sayi>=2) {
            for (int i = 2; i <sayi ; i++) { // sayi/2+1
                if (sayi%i==0) {
                    asalmi=false;break;
                }
            }
            if (asalmi) System.out.println("Say? asald?r");
            else System.out.println("Sayi asal de?ildir");
        } else System.out.println("Sayi asal de?ildir");


    }



}
