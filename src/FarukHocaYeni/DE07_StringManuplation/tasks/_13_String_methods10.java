package DE07_StringManuplation.tasks;

import java.util.Scanner;

public class _13_String_methods10 {

    public static void main(String[] args) {

        /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        //Kodu aşağıya yazınız.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci string : ");
        String str1 = scanner.next();
        System.out.print("İkinci string : ");
        String str2 = scanner.next();

        if (str1.equals(str2)) System.out.println("eşittirler");
        else System.out.println("eşit değildirler");

        // eğer küçük/büyük harf hassasiyeti olmaz ise
        if (str1.equalsIgnoreCase(str2)) System.out.println("eşittirler");
        else System.out.println("eşit değildirler");


    }
}
