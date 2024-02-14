package Privat.DE07_Concat;

public class IndexOf {

    public static void main(String[] args) {

        String str = "Merhaba Dünya";
        //Str stringinde boslugun yerini bulunuz
        int indexOfBosluk = str.indexOf(" ");

        System.out.println(str.substring(0,indexOfBosluk));
        System.out.println(str.substring((indexOfBosluk+1)));

    }
}
