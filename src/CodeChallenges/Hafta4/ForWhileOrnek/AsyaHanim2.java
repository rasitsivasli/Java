package CodeChallenges.Hafta4.ForWhileOrnek;

import java.util.Scanner;

public class AsyaHanim2 {
    public static void main(String[] args) {
        //Kullanıcıdan yaş bilgisi isteniyor
//Yaş değerleri 0-120 arasında olana kadar sormaya devam ediyor.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Yasinizi giriniz ");
        int yas = scanner.nextInt();

         while (!(yas>=0 && yas<120)){
             System.out.println("invalid");
             yas=scanner.nextInt();

         }
    }
}
