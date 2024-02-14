package CodeChallenges.Hafta4.Break_Contunie;

import java.util.Scanner;

public class Test1_Break {
    public static void main(String[] args) {
        // Bir harf giriniz, eger q girerseniz program sonlanir..




        while (true) {
            System.out.println("Bir harf giriniz..");
            Scanner scanner = new Scanner(System.in);
            char ch = scanner.next().charAt(0);
            if(ch=='q'){
                System.out.println("Program bitiyor...");break;
            }

        }

    }
}
