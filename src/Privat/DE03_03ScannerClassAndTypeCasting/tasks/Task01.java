package Privat.DE03_03ScannerClassAndTypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        System.out.print("Final notunu giriniz:");
        Scanner scan = new Scanner(System.in);

        int finalN = scan.nextInt();
        System.out.print("Ara sinav notunu giriniz:");
        int mid_term = scan.nextInt();
        System.out.print("Proje notunu giriniz:");
        int projekt = scan.nextInt();
        double greade= (mid_term *0.3+finalN*0.5+projekt *0.2);
        System.out.println("Sene sonu notunuz : "+ greade);


    }
}
