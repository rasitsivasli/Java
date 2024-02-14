package CodeChallenges.Hafta1;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        //Input  int salary,int age, boolean isCreditCard
        //if salary bigger than 1000$ and age >24 than can be taken credit card

        Scanner scanner = new Scanner(System.in);
        System.out.println("Maasinizi giriniz : ");
        int maas = scanner.nextInt();
        System.out.println("yasinizi giriniz : ");
        int yas = scanner.nextInt();
        String durum = maas > 1000 && yas >24? "evet":"hayir";


        System.out.println("Kredi karti alabilir miyim : " + durum);


    }
}
