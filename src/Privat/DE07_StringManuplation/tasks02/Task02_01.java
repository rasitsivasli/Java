package Privat.DE07_StringManuplation.tasks02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task02_01 {
    public static void main(String[] args) {
        // verilen stringin 3. karekteri varsa silin

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
//        if (str.length()>=4){
//            String strUcuncuKarakter = str.substring(3,4);
//            System.out.println("3.karakterin silinmis hali :  "+ str.replace(str.substring(3,4)""));
//        }else System.out.println("en az 4 harfli bir kelime giriniz");

//        2. yol

//
        System.out.println( str.length()>=4 ? (str.replace(str.substring(3,4),"" )): " en az 4 harfli bir kelime giriniz");
//3 yol Strin = hasan



        if (str.length()>=4){
            String ilkPARCA = str.substring(0,3);
            String sondakiParca = str.substring(4);
            str = ilkPARCA + sondakiParca;
            System.out.println("str = " + str);
        }
        else System.out.println("en az 4 harfli bir kelime giriniz");
    }


}
