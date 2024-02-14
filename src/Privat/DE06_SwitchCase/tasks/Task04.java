package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();

        switch (ay) {
            case "subat":
                System.out.println(28);
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasim":
                System.out.println(30);
                break;
            case "ocak":
            case "mart":
            case "mayis":
            case "temmuz":
            case "agustos":
            case "ekim":
            case "aralik":
                System.out.println(31);
                break;
            default:
                System.out.println("hatalı giriş");
        }

    }
}
