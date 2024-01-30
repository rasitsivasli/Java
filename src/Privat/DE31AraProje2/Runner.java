package Privat.DE31AraProje2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    final static String c_BLACK  = "\u001B[30m";
    final static String c_RED    = "\u001B[31m";
    final static String c_GRAY   = "\u001B[37m";
    final static String c_RESET  = "\u001B[0m";
    final static String BOLD     = "\033[0;1m";
    final static String ITALIC   = "\033[3m";
    final static String UNDER_LINE = "\033[4m";
    final static String c_BLUE   = "\u001B[34m";

/*    final static String c_GREEN  = "\u001B[32m";
    final static String c_YELLOW = "\u001B[33m";
    final static String c_PURPLE = "\u001B[35m";
    final static String c_CYAN   = "\u001B[36m";
    final static String c_WHITE  = "\u001B[37m";
    final static String nITALIC  = "\033[0m";
    final static String bc_BLACK = "\u001B[40m"; // Siyah zemin
    final static String bc_RED   = "\u001B[41m"; // k?rm?z? zemin
*/


    static Map<Integer, Musteriler> musList = new HashMap<>();
    static Map<Integer, Satislar>   satList = new HashMap<>();
    static int musSonID = 0;
    static int satSonID = 0;
    public static void main(String[] args) {
        // read data from file and put it in map
        MusFileHelper.dosyadanOku();
        SatFileHelper.dosyadanOku();
        anaMenu();

    }
    private static void anaMenu() {
        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            anaMenuText();
            secim= scanner.next().substring(0,1);
            switch (secim) {
                case "1" -> musMenu();
                case "2" -> satMenu();


            }
        } while (!secim.equalsIgnoreCase("x"));
    }

    private static void anaMenuText() {
        String str=STR."\{BOLD}\{UNDER_LINE}  - Ana Men� - \{c_RESET}";
        System.out.println(str);
        /*
        Ustteki 2 sat?r kodu ile string tamplate �rne?i yapt?k,
        e?er JDK' niz 21 den az ise bu kod �al??maz bunun yerine a?a??daki sat?r? kullanmal?s?n?z
         */
     //   System.out.println(BOLD + UNDER_LINE + "- Ana Men� -" + c_RESET);

        String text= """
                1 - M�?teri Kay?tlar?
                2 - Sat?? ??lemleri
                x - �?k??
                """;
        System.out.print(BOLD + ITALIC + text);
    }


    private static void musMenu() {
        InterIslem dbMus= new MusIslemler();
        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            musMenuText();
            secim= scanner.next().substring(0,1);
            switch (secim) {
                case "1" -> dbMus.veriAdd();
                case "2" -> dbMus.veriUpdate();
                case "3" -> dbMus.veriDelete();
                case "4" -> dbMus.veriList();
                case "5" -> dbMus.veriDeletedList();

            }
        } while (!secim.equalsIgnoreCase("x"));
    }

    private static void musMenuText() {
        // alt sat?r String tamplate e d�n�?t�r�lebilir ( Java n?n tercihi budur, �stte �rne?i var)
        System.out.print("\t\t" + BOLD + UNDER_LINE + c_RED + "- M�?teriler Men� -" + c_RESET + " \n");
        System.out.print(c_RESET);
        
        String text= """
                        1 - M�?teri ekle
                        2 - M�?teri bilgisini g�ncelle
                        3 - M�?teri Kayd?n? sil
                        4 - M�?teriler listesi
                        5 - Silinmi? Kay?tlar1
                        x - Ana Men�
                """;
        System.out.print(ITALIC + c_RED + text + c_BLACK);
    }
    private static void satMenu() {
        InterIslem dbSat= new SatIslemler();
        // Usteki sat?r ile alttaki tamamen ayn? i?i g�r�r ,
        // zira metotlar birebir ayn? , bir "polimorfizm" �rne?i olsun diye b�yle yapt?k
         //Satislar dbSat= new SatIslemler();

        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            satMenuText();
            secim= scanner.next().substring(0,1);
            switch (secim) {
                case "1" -> dbSat.veriAdd();
                case "2" -> dbSat.veriUpdate();
                case "3" -> dbSat.veriDelete();
                case "4" -> dbSat.veriList();
                case "5" -> dbSat.veriDeletedList();
                case "6" -> raporlar();


            }
        } while (!secim.equalsIgnoreCase("x"));
    }



    private static void satMenuText() {
// alt sat?r String tamplate e d�n�?t�r�lebilir ( Java n?n tercihi budur, �stte �rne?i var)
        System.out.print("\t\t" + BOLD + UNDER_LINE + c_RED + "- Sat??lar Men� -" + c_RESET + " \n");
        System.out.print(c_RESET);
        String text = """
                        1 - Sat?? yap
                        2 - �nceki Sat??ta de?i?ikli yap
                        3 - Sat??? Sil
                        4 - Sat??lar Listesi
                        5 - Silinmi? Sat?? Kay?tlar?
                        6 - Raporlar
                        x - Ana Men�
                """;
        System.out.print(ITALIC + c_RED + text+c_BLACK);
    }

    private static void raporlar() {
        Scanner scanner = new Scanner(System.in);
        String secim;
        do {
            rprMenuText();
            secim= scanner.next().substring(0,1);
            switch (secim) {
                case "1" -> SatRaporlar.birMusteriHesapDokumu();
                case "2" -> SatRaporlar.topSatisOzeti();
                case "3" -> SatRaporlar.musterilerBakiyeListesi();
                case "4" -> SatRaporlar.borcluMusteriler();


            }
        } while (!secim.equalsIgnoreCase("x"));
    }
    private static void rprMenuText(){
        String str=STR."\t\t\t\t\{BOLD}\{c_BLUE}\{UNDER_LINE}  - Raporlar Men� - \{c_RESET}";
        System.out.println(str);
        /*
        Ustteki 2 sat?r kodu ile string tamplate �rne?i yapt?k,
        e?er JDK' niz 21 den az ise bu kod �al??maz bunun yerine a?a??daki sat?r? kullanmal?s?n?z
         */
        //   System.out.println(BOLD + c_BLUE + UNDER_LINE + "- Ana Men� -" + c_RESET);

        String text= """
                                1 - Bir M�?teri Hesap D�k�m�
                                2 - T�m Sat??lar Listesi
                                3 - M�steri bazl? bakiye raporu
                                4 - Bor�lu m�?teriler raporu
                                x - Sat??lar Men�s�
                """;
        System.out.print(BOLD + ITALIC + c_BLUE + text + c_RESET);
    }
}
