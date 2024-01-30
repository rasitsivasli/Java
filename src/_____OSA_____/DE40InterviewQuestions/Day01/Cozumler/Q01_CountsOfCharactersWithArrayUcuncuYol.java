package _____OSA_____.DE40InterviewQuestions.Day01.Cozumler;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArrayUcuncuYol {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini(kaç adet oldu?unu) ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz: ");
        String str = scan.nextLine();

        String[] arr = str.split("");
        Arrays.sort(arr);
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " sayisi = " + (count + 1) + " adettir");
                count = 0;
            }

            if (i == arr.length - 1) {
                System.out.println(arr[i] + " sayisi = " + (count + 1) + " adettir");
            }
        }

    }

}
