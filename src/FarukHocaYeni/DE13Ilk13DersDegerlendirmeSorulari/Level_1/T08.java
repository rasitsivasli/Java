package DE13Ilk13DersDegerlendirmeSorulari.Level_1;

import java.util.Arrays;
import java.util.Scanner;

public class T08 {
    // Klavyeden grilen bir stringin içerisinde "a" herfleri geçmektedir, bu a harflerinin bulunduğu
    // indexleri yazdırın
    public static void main(String[] args) {

    }
    private static void cozum_ebruhanim(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ifade giriniz : ");
        String str = scan.nextLine();
        String[] dizi = str.split("");
        System.out.println(Arrays.toString(dizi));
        for (int i = 0; i < str.length(); i++) {
            if (dizi[i].equals("a")) {
                System.out.println("a harfi " + i + ". indekstedir");
            }
        }
    }

    private static void cozum_yasinbey(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("String giriniz : ");
        String str = scanner.nextLine();
        System.out.println("Indexlerin Listesi : ");
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+1).equals("a")){
                System.out.print(i+", ");
            }
        }
    }
    private static void cozum_ercanbey(){
        Scanner scan= new Scanner(System.in);
        System.out.println("bir metin giriniz"); //ankara
        String str = scan.nextLine();
        int index =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a') {
                index = i;
                System.out.print(index+", ");

            }

        }
    }
}
