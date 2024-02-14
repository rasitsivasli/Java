package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Switch_Kullanicidan_AyAlipMeysimYaszdirma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayi olarak ay giriniz : ");
        int ay = scanner.nextInt();

        switch (ay) {

            case 12:
            case 1:
            case 2:
                System.out.println("kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("bahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("yas");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("sonbahar");
                break;
        }
    }
}
