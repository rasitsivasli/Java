package CodeChallenges.Boz.Ornekler;

import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vatandas misiniz?");
        String vatandas = scanner.nextLine();
        System.out.println("Geliriniz ne kadar? : ");
        int gelir = scanner.nextInt();
        if ((vatandas.equalsIgnoreCase("evet") && gelir > 30000)) {
            System.out.println("Calisma yilinizi giriniz? ");
            int calYil = scanner.nextInt();
            if (calYil > 3 && gelir > 50000) {
                System.out.println("Gold kredi karti alabilirsiniz.");
            }
            if (calYil < 3 && gelir > 50000) {
                System.out.println("Silver kredi karti alabilirsiniz.");
            } else {
                System.out.println("Normal kredi karti alabilirsiniz.");
            }
        } else {
            System.out.println("Kredi karti alamazsiniz.");
        }

    }
}




