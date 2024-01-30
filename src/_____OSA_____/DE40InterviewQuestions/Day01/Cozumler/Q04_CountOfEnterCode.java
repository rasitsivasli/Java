package _____OSA_____.DE40InterviewQuestions.Day01.Cozumler;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    // STRING OLAN PIN kodunuzu kontrol eden bir kod yaz?n?z. ( 4 kez deneme hakk? olsun)
    public static void main(String[] args) {
        String pin="merhaba1234";
        int girisHakki=4;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Pin giriniz : "); String gPin= scanner.next();
            if (pin.equals(gPin)){
                System.out.println("Giri? ba?ar?l?"); break;
            } else {
                System.out.println("Hatal? pin"); girisHakki--;
                System.out.println("Kalan giri? hakk? : "+girisHakki);
            }
            if (girisHakki==0) {
                System.out.println("Deneme hakk?n?z bitti, giri? ba?ar?s?z");break;
            }
        }

    }

}
