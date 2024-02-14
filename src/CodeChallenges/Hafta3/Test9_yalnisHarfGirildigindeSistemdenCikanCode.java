package CodeChallenges.Hafta3;

import java.util.Scanner;

public class Test9_yalnisHarfGirildigindeSistemdenCikanCode {
    public static void main(String[] args) {
        // "q" harfi girildiginde programdan cikan bir code creat ediniz.

        boolean flag = true;

        while (flag){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir harf giriniz : ");
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("q")){
                System.out.println("q harfini girdiniz sistemden cikiyorsunuz..");
                flag=false;
            }
        }



    }
}
