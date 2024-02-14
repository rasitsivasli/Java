package CodeChallenges.Hafta7_ArraysList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array5 {
    public static void main(String[] args) { //    //1.adim str tanimladik

        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  elemanlarin toplamini double olarak yazdir
         */
        // List<Integer> list = new ArrayList<>();

        String[][] arr = {{"$12", "$22", "0$"}, {"€9", "€40", "$1"}, {"€12", "$2", "$0"}};
        List<String> list= new ArrayList<>();


        double euroToplam = 0;
        double dolarToplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("$")) {
                    dolarToplam += Integer.valueOf(arr[i][j].replace("$","")) * 3.2;
                }else {
                    euroToplam += Integer.valueOf(arr[i][j].replace("€","")) * 4.2;
                }
            }
        }
        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);

    }

}

