package CodeChallenges.Hafta3.Freitag;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        //Enter a word
        //Convert "Java" to "J*a*v*a*"

        Scanner scanner = new Scanner(System.in);
        System.out.print("Metin giriniz : ");
        String str = scanner.nextLine();



        for (int i = 0; i <str.length(); i++) {

            System.out.print(str.charAt(i)+"*");
            //System.out.print(str.charAt(i)+"*");
        }


    }


}

