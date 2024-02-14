package Privat.DE10_MethodCreation.Quiz;

public class Q02_2_String_Methodlari {
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
        String str = "Merhaba dünya nasıl gidiyor hayat  ";
        stringYazdir(str);
    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        for (int i = 0; i < 5; i++) {
            str = str.substring(str.indexOf(" ") + 1);
            System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));// ilk harfin büyük harf olmasi icin yapildi
        }
    }
}
