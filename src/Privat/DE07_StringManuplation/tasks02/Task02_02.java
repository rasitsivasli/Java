package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_02 {
    public static void main(String[] args) {
        // Verilen stringin , ilk karekterini silin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle giriniz : ");
        String str = scanner.nextLine();

        System.out.println(str.substring(1));
    }
}
