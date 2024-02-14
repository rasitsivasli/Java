package Privat.DE07_Concat;

public class Replay {
    public static void main(String[] args) {

        String str = "Merhaba Dünya";
        str=str.replace("a","*");
        System.out.println(str);

        int strUzunluk = str.length();

        String yildizsiz = str.replace("*","");
        System.out.println("yildizsiz = " + yildizsiz);
        int yildizsizSayisi = yildizsiz.length();
        System.out.println(yildizsizSayisi);




    }
}

