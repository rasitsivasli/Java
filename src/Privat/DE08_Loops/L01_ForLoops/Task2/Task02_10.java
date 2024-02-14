package Privat.DE08_Loops.L01_ForLoops.Task2;

public class Task02_10 {
    public static void main(String[] args) {
        // Verilen string içerisinde bazı rakamlar vardır, bu rakamlar için kaç adet 0, kaç adet 1,
        // ... kaç adet 9 vardır her birini ayrı ayrı hesaplayıp yazdırınız

        String str = "1jhb23jb5445ld56666778k7789lö090";
        int birSayisi = 0;
        int ikiSayisi = 0;
        int ucSayisi = 0;
        int dortSayisi = 0;
        int besSayisi = 0;
        int altiSayisi = 0;
        int yediSayisi = 0;
        int sekizSayisi = 0;
        int dokuzSayisi = 0;
        int sifirSayisi = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                switch (ch) {

                    case '0' -> sifirSayisi++;
                    case '1' -> birSayisi++;
                    case '2' -> ikiSayisi++;
                    case '3' -> ucSayisi++;
                    case '4' -> dortSayisi++;
                    case '5' -> besSayisi++;
                    case '6' -> altiSayisi++;
                    case '7' -> yediSayisi++;
                    case '8' -> sekizSayisi++;
                    case '9' -> dokuzSayisi++;
                }
            }

        }
        System.out.println("sifir sayisi : " + sifirSayisi);
        System.out.println("bir sayisi : " + birSayisi);
        System.out.println("iki sayisi : " + ikiSayisi);
        System.out.println("uc sayisi : " + ucSayisi);
        System.out.println("dort sayisi : " + dortSayisi);
        System.out.println("bes sayisi : " + besSayisi);
        System.out.println("alti sayisi : " + altiSayisi);
        System.out.println("yedi sayisi : " + yediSayisi);
        System.out.println("sekiz sayisi : " + sekizSayisi);
        System.out.println("dokuz sayisi : " + dokuzSayisi);


    }
}
