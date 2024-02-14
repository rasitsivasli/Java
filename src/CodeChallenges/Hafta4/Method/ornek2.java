package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        //userName:Asya
//password: Clarus123*
//Şifrenin doğruluğunu test eden method create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanici adnizi giriniz : ");
        String userName = scanner.nextLine();
        System.out.print("Password giriniz : ");
        String password = scanner.nextLine();

        System.out.println("dogruMu(userName, password) = " + dogruMu(userName, password));
    }

    private static boolean dogruMu(String userName, String password) {
        boolean sifreDogruMu = false;
        if (!userName.equals("Asya")) {
          //  System.out.println("Kullanici adiniz yanlistir...");

        }
        if (!password.equals("Clarus123*")) {
            // System.out.println("Sifreniz yanlistir...");

        }
        if (userName.equals("Asya") && password.equals("Clarus123*")) {
            sifreDogruMu = true;
        }

        return sifreDogruMu;
    }
}



