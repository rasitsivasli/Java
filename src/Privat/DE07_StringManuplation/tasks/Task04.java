package Privat.DE07_StringManuplation.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci kelimeyi giriniz : ");
        String str1 = scan.nextLine();

        System.out.println("Ikinci kelimeyi giriniz : ");
        String str2 = scan.nextLine();

        if (str1.length()%2==0){
            int yarisi = str1.length()/2;
            String ilkParca = str1.substring(0,yarisi);
            String sonParca = str1.substring(yarisi);
            System.out.println("tamami : "+ilkParca+str2+sonParca);

        }else System.out.println("Birinci kelime cift sayida karakter icermiyor ..");








    }
}
