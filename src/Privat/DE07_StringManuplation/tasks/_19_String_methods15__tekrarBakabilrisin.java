package Privat.DE07_StringManuplation.tasks;

public class _19_String_methods15__tekrarBakabilrisin {

    public static void main(String[] args) {

        /* ClassMain method oluşturun.
            Mouse değerinde bir String oluştur.
            Mouse String'inin 2. sırasındaki karakteri yazdırın.  */

        //Kodu buraya yazınız.

String str = "Mouse micky";
        System.out.println(str.charAt(2));// 2 kelimenin sadece ilk harfini büyük yap ve sonra yazdir

        int bi = str.indexOf(" ");// bosluk icin index olusturdum
        System.out.println(bi+1);// 2. karakterden itibaren bosluktan 1 sonrasina kadar yaz..


    }
}
