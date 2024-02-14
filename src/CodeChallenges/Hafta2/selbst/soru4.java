package CodeChallenges.Hafta2.selbst;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {


// kullanıcıdan yaşadığı şehri girmesini isteyiniz.
//eğer ilk ve son Baba/a ise "doğru şehir " yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bir sehir giriniz : ");
        String str = scanner.nextLine().toLowerCase();


        if (str.startsWith("a")&&str.endsWith("a") ){
            System.out.println("girdiginiz sehir ismi a ile basliyor");
        }

        else  System.out.println("uyumsuz");


    }
}
