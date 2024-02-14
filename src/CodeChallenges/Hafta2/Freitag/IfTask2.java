package CodeChallenges.Hafta2.Freitag;

import java.util.Scanner;

public class IfTask2 {
    public static void main(String[] args) {

    /* Task->
    Input from user : qa, dev, ba, pm
    qa => print "you are Quality Analyst."
    dev => print "you are Developer."
    ba => print "you Business Analyst."
    pm => print "you are Project Manager."
      */
        System.out.println("Bir metin giriniz : ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().toUpperCase();


        if (str.equalsIgnoreCase("qa")) {
            System.out.println("you are Quality Analyst.");
        } else if (str.equalsIgnoreCase("dev")) {
            System.out.println("you are Developer.");
        } else if (str.equalsIgnoreCase("ba")) {
            System.out.println("you Business Analyst.");
        } else if (str.equalsIgnoreCase("pm")) {
            System.out.println("you are Project Manager.");
        } else System.out.println("invalid");


    }
}
