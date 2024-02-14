package Privat.DE08_Loops.L01_ForLoops.Task2;

import org.w3c.dom.ls.LSOutput;

public class Task02_08 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın

        String str = "Selamlar";
        String yeniStr ="";

//
//        for (int i = 0; i <str.length() ; i++) {
//
//            yeniStr =yeniStr+" "+str.charAt(i);
//        }
//        System.out.println(yeniStr.trim());

//        2.yol

        for (int i = 0; i <str.length() ; i++) {

            System.out.print(str.charAt(i)+" ");
        }


    }
}
