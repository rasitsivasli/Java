package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_03 {
    public static void main(String[] args) {
        // Verilen stringin , son karekterini '*' ile değiştirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir cumle giriniz : ");
        String str = scanner.nextLine();

//        System.out.println(str.replace(str.charAt(str.length()-1),'*'));

        System.out.println(str.substring(0,str.length()-1)+"*");
    }
}
