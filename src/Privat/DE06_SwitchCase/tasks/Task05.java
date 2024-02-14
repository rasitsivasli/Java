package Privat.DE06_SwitchCase.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - Cocuk
		4. 80(dahil) ustu- Baba
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Not giriniz : ");
        int not = scan.nextInt();

        if (not >= 0 && not < 50) {
            System.out.println("Notunuz : D");
        } else if (not >= 50 && not < 60) {
            System.out.println("Notunuz : C");
        } else if (not >= 60 && not < 80) {
            System.out.println("Notunuz : Cocuk");
        } else if (not >= 80 && not <= 100) {
            System.out.println("Notunuz : Baba");
        } else {
            System.out.println("Notunuzu 0 dan 100 e kadar bir deger olarak giriniz");

        }
    }
}