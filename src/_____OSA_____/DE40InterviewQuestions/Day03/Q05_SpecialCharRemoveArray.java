package _____OSA_____.DE40InterviewQuestions.Day03;

import java.util.ArrayList;
import java.util.Arrays;

public class Q05_SpecialCharRemoveArray {
    /*
   Problem Tanımı :
   getSum isminde bir method oluşturun.
   Parametresi ArrayList'tir.
   Dizideki tüm $ ları kaldır ve tüm sayıları topla
   return yaptğımız veri tipi 'int' olmalıdır.
   sonuç 0'dan küçükse, -1 yazdırın.

   Örnek1:
   ArrayList = $13, $15, $20
   Cevap = 48 olmalı

   Örnek 2 :
   ArrayList= $-13, $0, $0
   Cevap = -1 olmalı.
    */


    //parse int : primitive return eder
    //value Of : non primitive return eder
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("$13", "$115", "$20"));
        System.out.println(arrList.stream().map(p -> Integer.parseInt(p.replace("$", ""))).reduce(Integer::sum));

        System.out.println("getsum(arrList) = " + getsum(arrList));

    }

    private static int getsum(ArrayList<String> arrList) {
        int sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum += Integer.parseInt(arrList.get(i).substring(1));
        }
        if (sum < 0) return -1;
        else return sum;
    }
}


