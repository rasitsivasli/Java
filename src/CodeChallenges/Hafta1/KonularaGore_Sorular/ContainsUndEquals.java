package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class ContainsUndEquals {
    //*  Eğer String null (0) değilse ve String uzunluğu 14 ise ve String "i love java" yı kapsıyorsa
    //        "String is i love java and 14 character." yazdırınız.
    //
    //        Eğer String null(0) değilse ve karakter biçimini (büyük, kücük harf) görmezden gelirse,
    //        "String is I love java" yazdırın. */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("bir cümle giriniz");
        String str = scanner.nextLine();

        if (str.length() == 14 && str.contains("i love java")) {
            System.out.println("String is i love java and 14 character.");

        } else if (str.equalsIgnoreCase("i love java")) {
            System.out.println("String is I love java");
        }
    }


}
