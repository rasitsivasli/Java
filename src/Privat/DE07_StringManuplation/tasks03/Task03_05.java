package Privat.DE07_StringManuplation.tasks03;

import java.util.Scanner;

public class Task03_05 {
    public static void main(String[] args) {
        // verilen String teki tüm boşlukları , regex kullanarak yıldıza çeviriniz
        Scanner scanner = new Scanner(System.in);
        String str4 = scanner.nextLine();


        String str5 = str4.replaceAll("[ ]","*");
        System.out.println("str5 = " + str5);

    }
}
