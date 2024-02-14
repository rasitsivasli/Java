package CodeChallenges.Hafta2.selbst;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

//Girilen mailde "_" işareti varsa kelimelerin yerini değiştirip yazdırın
//"_" yok ise aynı şekilde yazdırın
//Örnek: //"asya_cool@gmail.com";--> cool_asya@gmail
        //"asyacool@gmail.com"---> asyacool@gmail.com

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String str2 = str.substring(str.indexOf("_") + 1, str.indexOf("@"));

        String str3 = str.substring(0, str.indexOf("_"));

        if (str.indexOf("_") > 0) {
            System.out.println(str2 + "_" + str3 + str.substring(str.indexOf("@")));
            System.out.println(str);
        } else {
            System.out.println(str);
        }


    }
}
