package CodeChallenges.Hafta4.Method;

import java.util.Scanner;

public class Methos2 {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.print("Mail adresi giriniz : ");
        String mail = scanner.next();
        System.out.println(mail);
        domain(mail);
        mail= mail.replace(domain(mail),"yahoo");
        System.out.println("mail = " + mail);

    }

    private static String domain(String a) {

        return a.substring(a.indexOf("@")+1, a.indexOf("."));
    }
}
