package CodeChallenges.Boz.Metod;

import java.util.Scanner;

public class Task3_MetodIleAsalSayiKontrolu {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Girilen sayi asal midir ?  : ");
        int num =  scanner.nextInt();
        System.out.println(asalMi(num));
    }
    public static boolean asalMi (int num){
        boolean flag = true;
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
