package Privat.DE08_Loops.L01_ForLoops.Task2;

public class Task02_12_coz {
    public static void main(String[] args) {
        // Bir text veriliyor, kaç adet kelimenin ilk harfi ile son harfi aynıdır
        // Ör :     input : "Ağa hasan, ece ile ali ye aba hediye etti"
        //          output: 3

        String str = "Ağa hasan, ece ile ali ye aba hediye etti";

        String yeniStr = str.trim().replace(",", "") + " ";//son kelime yi alabilmek icin sona bosluk biraktik ve virgülü kaldirdik.

        int counter = 0;

        for (int i = 0; i < yeniStr.length(); i++) {
            char ch = yeniStr.charAt(i);
            if (ch == ' ') {

                String kelime = yeniStr.substring(0,i);
                yeniStr =yeniStr.substring(i+1);


                if (kelime.substring(0,1).equalsIgnoreCase(kelime.substring(kelime.length()-1)))
                counter++;
                i=0;
            }
        }
        System.out.println(counter);
    }
}
