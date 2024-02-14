package Privat.DE10_MethodCreation.Quiz;

import java.util.Arrays;

public class Q02_Array_Ile {
    public static void main(String[] args) {

        /*
         yukarıdaki strinden her defasında bir kelime eksilterek yazdırın,
         (ilk harf hep büyük olacak)
         eksiltme ve ilk harfi büyük yapma işi metot ta olsun,gerisi main de
         output
          Merhaba dünya nasıl gidiyor hayat
          Dünya nasıl gidiyor hayat
          Nasıl gidiyor hayat
          Gidiyor hayat
          Hayat
         */
        String str = "Merhaba dünya nasıl gidiyor hayat";
        String [] strArry = str.split(" ");// dizinin icine split metodu ile elemanlar yerlestirildi
        System.out.println(str);// ilk satiri elde etmek icin yapildi  :))))
        stringYazdir(strArry);
    }

    private static void stringYazdir(String[] strArry) {

        for (int i = 0; i <strArry.length-1 ; i++) {

            strArry[i]="";// her seferinde ilk kelimeyi cikarmak icin
            String strYeni= Arrays.toString(strArry);// String metodlarini kullanmak ve ilk kelimeleri atmak icin Stringe cevrildi
            strYeni = strYeni.substring(1,strYeni.length()-1).replaceAll(",","").trim();//virgül ve bosluklar gitti
            System.out.println(strYeni.substring(0,1).toUpperCase()+strYeni.substring(1));// ilk harf büyük yapildi
        }
    }
}
