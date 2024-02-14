package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task10_Boolean_Tearnary {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen üc harfli bir kelime giriniz : ");
        String str = scanner.nextLine();

//     2. yol tearnary  String durum = str.charAt(0)== str.charAt(1) || str.charAt(1)==str.charAt(2) || str.charAt(0)==str.charAt(2)?
//                                        "Harfler uniqe dir": " Harfler uniqe degildir";
//        System.out.println(durum);

        if (str.length()==3 && str.charAt(0)>'a' && str.charAt(0)<'Z'&&
        str.charAt(0)>'a' && str.charAt(0)<'Z'&&str.charAt(0)>'a' && str.charAt(0)<'Z'

        ){
            if (str.charAt(0)!=str.charAt(1) && str.charAt(1)!=str.charAt(2) && str.charAt(0)!=str.charAt(2) ) {
                System.out.println("Girdiginiz String üc harfli ve harfleri farklidir");

            }else System.out.println("Girdiginiz String üc harfli ama tüm harfler farkli degildir");
        }else System.out.println("Girdiginiz String üc harfli degildir");






    }
}