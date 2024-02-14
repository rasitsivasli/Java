package CodeChallenges.Hafta3.Freitag;

import java.util.Scanner;

public class Task8_SifreSorusu {

    public static void main(String[] args) {
        //ask user to enter username and password (Give 3 tries)
        //if true credential "login"
        //else try to 3 times



        Scanner scanner = new Scanner(System.in);
        String username = "Rasit";
        String password = "1234";

        for (int i = 1; i <= 3; i++) {
            System.out.print("Adinizi giriniz: ");
            String ad = scanner.nextLine();
            System.out.print("Sifrenizi giriniz: ");
            String sifre = scanner.nextLine();

            if (username.equals(ad)){
                if (password.equals(sifre)){
                    System.out.println("login");break;

                }else System.out.println("Sifrenizi yanlis girdiniz "+"\n"+(3-i)+" deneme hakkiniz kaldi.");
            }else System.out.println("Adinizi yanlis girdiniz "+"\n"+(3-i)+" deneme hakkiniz kaldi.");

        }

    }


}





