package Privat.DE10_MethodCreation.Tasks;

import java.util.Arrays;

public class Task20_DiziIleYapildi {
    /*
    Task->
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
       */

    public static void main(String[] args) {

        String str = "$1 $12 €34 €56 $45 €78";

        dovizToplam(str);

    }

    private static void dovizToplam(String str) {


        String[] parcalar = str.split(" ");
        int uzunluk = parcalar.length;
        System.out.println(Arrays.toString(parcalar));
        int toplamDolar = 0;
        int toplamEuro = 0;

        for (int i = 0; i < uzunluk; i++) {

            if (parcalar[i].startsWith("$")) {
                toplamDolar += Integer.parseInt(parcalar[i].substring(1));

            } else {
                toplamEuro += Integer.parseInt(parcalar[i].substring(1));
            }
        }
        System.out.println("toplamDolar = " + toplamDolar);
        System.out.println("toplamEuro = " + toplamEuro);

    }

    public static class Task20_hocanin_Ucuncu_Cozumune_GoreYap {
        /*
        Task->
          Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamlarıni print eden METHOD create ediniz

           [$1 $12 €34 €56 $45 €78]
            dolarToplami: 58
            euroToplami: 168
           */

        public static void main(String[] args) {

            String str = "$1 $12 €34 €56 $45 €78";

            dovizToplam(str);

        }

        private static void dovizToplam(String str) {


            String[] parcalar = str.split(" ");
            int uzunluk = parcalar.length;
            System.out.println(Arrays.toString(parcalar));
            int toplamDolar = 0;
            int toplamEuro = 0;

            for (int i = 0; i < uzunluk; i++) {

                if (parcalar[i].startsWith("$")) {
                    toplamDolar += Integer.parseInt(parcalar[i].substring(1));

                } else {
                    toplamEuro += Integer.parseInt(parcalar[i].substring(1));
                }
            }
            System.out.println("toplamDolar = " + toplamDolar);
            System.out.println("toplamEuro = " + toplamEuro);

        }

    }
}



