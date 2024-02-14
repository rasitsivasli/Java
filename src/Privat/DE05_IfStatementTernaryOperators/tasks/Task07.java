package Privat.DE05_IfStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan bir harf girmesini isteyin.
Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin. Harf “a” ise ekrana “Ilk küçük harf” yazdırın.
“a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir harf girin: ");

        char ch = scanner.next().charAt(0);
        System.out.println(ch + 0);// a nin degerini bulmak icin yaptim, anlami yok

        if (Character.isLowerCase(ch)) {
            if (ch == 'a') {
                System.out.println("Ilk küçük harf");
            } else {
                System.out.println("Ilk küçük harf değil");
            }
        } else if (Character.isUpperCase(ch)) {
            if (ch == 'Z') {
                System.out.println("Son büyük harf");
            } else {
                System.out.println("Son büyük harf değil");
            }
        } else {
            System.out.println("Bu son büyük harf değil.");
        }



        // 2. cözömü sadece If le yap

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a') System.out.println("Ilk küçük harf");
            else System.out.println("Ilk küçük harf degil");
        }
        else {
            if (ch >= 'A' && ch <= 'Z'){
                if (ch == 'Z') System.out.println("Son büyük harf");
                else System.out.println("Son büyük harf degil");
            }
        }
    }
}





