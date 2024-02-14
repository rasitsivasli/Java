package Privat.DE19_StringBuilder.StringBuilder;

public class Ornek2 {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();// Tanim String str ;
        StringBuilder str2 = new StringBuilder("Hasan");// String str2="Hasan" ;
        str2.append(str2).append("asdasdasd").append("12345435").append("aasd");
        System.out.println("str2 = " + str2);
        System.out.println("str2.length() = " + str2.length());
        System.out.println("str1.indexOf(\"d\",4) = " + str2.indexOf("1", 5));

//        StringBuilder str3 = new StringBuilder("Hasan");
//        StringBuilder str4 = new StringBuilder("Hacan");
//        int result = str3.compareTo(str4);
//
//        System.out.println("result = " + result);
//        if (str3.compareTo(str4)==0) System.out.println("Iki esittir");
//        else System.out.println("Esit degildir");
//
//        System.out.println("str3.equals(str4) = " + str3.equals(str4));
//
//        String string ="Hasan";
//        StringBuilder sBuilder = new StringBuilder("Hasan");
//        sBuilder.append("Hasan");
//
//        sBuilder.delete(0,sBuilder.length());
//        System.out.println("sBuilder = " + sBuilder);








    }
}
