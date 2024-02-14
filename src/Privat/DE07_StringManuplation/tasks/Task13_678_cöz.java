package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task13_678_cöz {
   static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Bir cumle giriniz : ");
//        String str = scanner.nextLine();
//
//        int karakterSayisi = str.length();
//        System.out.println("karakterSayisi = " + karakterSayisi);
//
//        int bosluksuzSayisi = str.replace(" ","").length();
//        System.out.println("bosluksuzKarakterSayisi = " + bosluksuzSayisi);


        //Example 2: Bir String'deki tum 'a' harflerini 'Baba' ya ceviriniz.

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Bir cumle giriniz : ");
//        String str = scanner.nextLine();
//
//        System.out.println(str.replaceAll("a","Baba"));


        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz

//        String str3 = "kara murat sakarat";
//        System.out.println(str3.replace("kara","*"));


        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********

//        String str = "AC202117004";
//        System.out.println(str.replaceAll("\\d","*"));


        /*
            Bir grup data'yi ifade eden kod'lara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [Baba-Z]
            4)Tum harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar haric tum karakterler ==> [^0-9]
            2)Kucuk harfler haric tim karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^Baba-Z]
            4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5)Space haric ==> [^ ]
         */

        //Example 5: Verilen bir String de kullanilan noktalama isareti, rakamlar ve space karakteri haric
        //           tum karakterlerin sayisini bulan kodu yaziniz
//
//        String str5 = "23423-.#+  asdasdwqe";
//        String str6 = str5.replaceAll("\\p{Punct}", "");
//        System.out.println("str6 = " + str6);
//        String str7 = str6.replaceAll("[0-9]", "");
//        System.out.println("str7 = " + str7);
//        String str8 = str6.replaceAll("[ ]", "");
//        System.out.println("str8 = " + str8.length());

        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
//        //           v)En az 1 kucuk harf icermeli
//
//
//
        String pwd = "B78c? K!m";
        String pwd2 = pwd.replace(" ","");


//        /
///i)Space haric en az sekiz karakter olmali
////        boolean first = pwd.replace(" ", "").length()>7;
        System.out.println(pwd.replace(" ", "").length()>7);
//        //ii)En az 1 sembol icermeli
//        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        System.out.println(pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0);
//        //iii)En az 1 rakam icermeli
//        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(pwd.replaceAll("[^0-9]","").length());

//        //iv)En az 1 buyuk harf icermeli
//        boolean fourth = pwd.replaceAll("[^Baba-Z]", "").length()>0;
        System.out.println(pwd.replaceAll("[^A-Z]","").length());
//        //v)En az 1 kucuk harf icermeli
//        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(pwd.replaceAll("[^a-z]","").length());
//        boolean pwdGecerli = first && second && third && fourth && fifth;
//
//        if(pwdGecerli){
//            System.out.println("Password'unuz gecerlidir...");
//        }else{
//            System.out.println("Password'unuz gecerli degildir...");
//        }

//        //Example 7: Bir String'deki noktalama isaretlerinin sayisini gosteren kodu yaziniz
        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println("xxx "+number);

        //Example 8: Verilen bir String "Al" ile basliyor ve "x" ile bitiyorsa ekrana "Harika" yazdirin
        //           aksi halde "Normal" yazdirin.

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
      //  boolean durum = str.charAt(0)== "Baba" && str.charAt(1)=='l' && str.charAt(str.length()-1)=='x';

//        if (durum){
//            System.out.println("Harika");
//        }else System.out.println("normal");

    }
}
