package CodeChallenges.Hafta2.selbst;

import java.util.Scanner;

public class soru7_StringMan {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sifre giriniz :  ");
        String str = scanner.nextLine();
        char sonKarakter = str.charAt(str.length() - 1) ;
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            if (sonKarakter >='0' && sonKarakter <='9') {
                if (!str.contains(" ")){
                    if (str.length()>=10){
                        System.out.println("sifre basariyla kaydedildi");
                    }else System.out.println("uzunlugu en az 10 karakter olmali");

                }else System.out.println("Sifrede bosluk olmamali");
            } else System.out.println("Son karakter rakam olmali");

        } else System.out.println("ilk harf kücük olmali");


    }
}
