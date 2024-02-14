package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Cinsiyetinizi erkek veya kadin olarak giriniz  : ");
        String str = scan.nextLine();

        if (str.equals("erkek")) {
            System.out.print("Yasinizi giriniz : ");
            Scanner scan2 = new Scanner(System.in);
            int yas = scan2.nextInt();
            if (yas > 18) {
                System.out.println("Adam");
            } else {
                System.out.println("Erkek cocuk.");
            }

        }
        if (str.equals("kadin")) {
            System.out.print("Yasinizi giriniz : ");
            Scanner scan3 = new Scanner(System.in);
            int yas2 = scan3.nextInt();
            if (yas2 < 18) {
                System.out.println("Kiz cocuk");
            } else {
                System.out.println("Kadin");
            }
        }
    }
}




































