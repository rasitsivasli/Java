package Privat.DE07_StringManuplation.tasks02;

import java.util.Scanner;

public class Task02_06 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakterin
         yerine '*' koyup print ediniz
         */


        Scanner scanner = new Scanner(System.in);

        System.out.print("bir metin giriniz : ");
        String str = scanner.nextLine();

        System.out.println("istenen karakterin index'ini giriniz : ");
        int index = scanner.nextInt();

        String yeniMetinIlkKisim= str.substring(0,index+1);
        String yeniMetinikinciKisim = str.substring(index+1);

        System.out.println(yeniMetinIlkKisim.replace(yeniMetinIlkKisim.charAt(yeniMetinIlkKisim.length()-1),'*')+yeniMetinikinciKisim);


//        System.out.println(str.replace(str.charAt(str.length()-1),'*'));







    }
}
