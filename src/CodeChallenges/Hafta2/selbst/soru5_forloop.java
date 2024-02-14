package CodeChallenges.Hafta2.selbst;

import java.util.Scanner;

public class soru5_forloop {
    public static void main(String[] args) {
        //girilen 3 harfli kelimeyi tersten yan yana print eden code create ediniz
        //eğer girilen kelime tersten okunuşu ile aynı ise palindromdur yazın
        // ala ,ata, asa


        Scanner scanner = new Scanner(System.in);
        System.out.print(" Bir metin giriniz : ");
        String str = scanner.nextLine();
        int uz = str.length();
        String tersMetin = "";

        for (int i = uz; i > 0; i--) {

            tersMetin = "" + tersMetin + str.charAt(i - 1);
        }
        System.out.println(tersMetin);

        if (tersMetin.equalsIgnoreCase(str)){
            System.out.println("palindromdur");
        }else System.out.println("palindromdur degildir");







//        char ch0 = str.charAt(0);
//        char ch1 = str.charAt(1);
//        char ch2 = str.charAt(2);
//
//        String strYeni =""+ch2+ch1+ch0;/// "" ile bu sekilde ch lar birlestirilebilir. String degerli olmayan en basta "" denilebilir
//
//
//        System.out.println("strYen = " + strYeni);
//
//        System.out.println(str.equalsIgnoreCase(strYeni));


    }
}
