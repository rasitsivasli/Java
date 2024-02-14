package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task06_22__tekraryap {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Cinsiyetinizi giriniz erkek veya kadin olarak giriniz  : ");
        String str = scan.nextLine();

        System.out.print("Yasinizi giriniz : ");
        int age = scan.nextInt();

        boolean isHe = str.equalsIgnoreCase("Erkek");

        if (isHe) {
            if (age > 18) {
                System.out.println("man");
            } else {
                System.out.println("boy");
            }


        } else {
            if (age > 18) {
                System.out.println("woman");
            } else {
                System.out.println("girl");
            }
        }
    }
}


