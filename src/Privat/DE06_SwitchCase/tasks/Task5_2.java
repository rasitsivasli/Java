package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int point = scanner.nextInt();
        if (!(point <= 0 || point > 100)) {
            switch (point / 10)
            {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println('D');
                    break;
                case 5:
                    System.out.println('C');
                    break;
                case 6:
                case 7:
                    System.out.println('B');
                    break;
                case 8:
                case 9:
                case 10:
                    System.out.println('A');
            }
        } else {
            System.out.println("Invalid");
        }


    }
}


