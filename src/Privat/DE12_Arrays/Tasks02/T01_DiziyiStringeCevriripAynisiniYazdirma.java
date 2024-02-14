package Privat.DE12_Arrays.Tasks02;

import java.util.Arrays;

public class T01_DiziyiStringeCevriripAynisiniYazdirma {
    public static void main(String[] args) {

        String str2 = "Selamlar mehmet bey nasılsınız";
        String[] strArr2 = str2.split(" ");
        String str3 = Arrays.toString(strArr2);
        System.out.println(str3);
        // yukarıdaki strArr2 dizisini string cevirin ama str2 dekinin aynısı olsun
        // en az 2 yöntem


        // 1. yontem
        String yeniStr = "";
        for (int i = 0; i < strArr2.length; i++) {
            yeniStr += strArr2[i] + " ";

        }
        System.out.println(yeniStr);
        // 2. yontem
        String str = "Selamlar mehmet bey nasılsınız ";// Stringe formülümüz icin bir bosluk ekledik
        String kelime = "";
        for (int i = 0; i < str.length(); i++) {

            kelime += str.substring(0, str.indexOf(" "))+" ";
            str = str.substring(str.indexOf(" ")+1);// her seferinde ilk bosluktan itibaren str yi kisalttik

        }System.out.println(kelime);

    }
}
