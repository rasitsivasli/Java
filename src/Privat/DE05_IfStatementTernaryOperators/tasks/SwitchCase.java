package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Kacinci ay oldugunu giriniz : ");
        int ay = scan.nextInt();

        switch (ay) {

            case 1 : System.out.println("Ocak 31 gündür"); break;
            case 2 : System.out.println("Subat 28 gündür");break;
            case 3 : System.out.println("Mart 31 gündür");break;
            case 4 : System.out.println("Nisan 30 gündür");break;
            case 5 : System.out.println("Mayis 31 gündür");break;
            case 6 : System.out.println("Haziran 30 gündür");break;
            case 7 : System.out.println("Temmuz 31 gündür");break;
            case 8 : System.out.println("Agustos 31 gündür");break;
            case 9 : System.out.println("Eylül 30 gündür");break;
            case 10 : System.out.println("Ekim 31 gündür");break;
            case 11 : System.out.println("Kasim 30 gündür");break;
            case 12 : System.out.println("Aralik 31 gündür");break;
        }
    }
}
