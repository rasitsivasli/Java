package Privat.DE10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task12 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> girilen e-mail ın doğrulugunu aşağıdaki şartlarda  control eden METHOD create ediniz.
        1- @ karakteri olmalı
        2- . (nokta) karakteri olmalı
        3- @ karakterinden önce mutlaka en az bir karakter olmalı.
        Example:
        "@gmail.com"-> false
        "@gmailcom"-> false
        "gmail.com"-> false
        "ebıkGabık@gmail.com"-> true
         */


        System.out.println(eMail());


    }//main sonu

    private static boolean eMail() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("E-Mail adresinizi giriniz : ");
        String str = scanner.nextLine();
        String yeniStr = str.substring(0,1);


        return str.contains("@") && str.contains(".") && !yeniStr.equals("@");

    }


}
