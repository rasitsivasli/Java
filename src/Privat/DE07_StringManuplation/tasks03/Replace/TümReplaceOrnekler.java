package Privat.DE07_StringManuplation.tasks03.Replace;

public class TümReplaceOrnekler {
    public static void main(String[] args) {

        String str = "Merhaba45 65 selam HH 0?+ - ";
        System.out.println("str = " + str);

        String s1 = str.replaceAll("\\d","*");  //   (\\d)  tüm rakamlar demektir.
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("\\D","*");  //   (\\D)  RAKAM DISINDA OLANLAR DEMEKTIR.
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("\\s","*");  //   (\\s)  tüm bosluklari yildiz yap
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("\\S","*");  //   (\\S)  BOSLUK HARICI HERSEYi yildiz yap
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("\\w","*");  //   (\\s)  tüm HARF VE RAKAMLARI YILDIZ YAP
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("\\W","*");  //   (\\S) harf ve rakam disinda olanlari * yap
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("[a-z]","*");  //   (\\s)  tüm kücük harfleri yildiza ceviriyoruz
        System.out.println("s1 = " + s1);
        s1 = str.replaceAll("[A-Z]","*");  //   (\\s)  tüm büyük harfleri yildiza ceviriyoruz
        System.out.println("s1 = " + s1);
        s1 = str.replaceAll("[a-zA-Z]","*");  //   (\\s)  tüm kücük BÜYÜK  harfleri yildiza ceviriyoruz
        System.out.println("s1 = " + s1);
        s1 = str.replaceAll("[0-9]","*");  //   (\\s)  tüm rakamlari yildiza ceviriyoruz
        System.out.println("s1 = " + s1);

        s1 = str.replaceAll("[abc]","*");  //   (\\s)  herbir harfi ayri ayri yildiza ceviriyoruz
        System.out.println("str = " + str);
        System.out.println("s1 = " + s1);


    }
}
