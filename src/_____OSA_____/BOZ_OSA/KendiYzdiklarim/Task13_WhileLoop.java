package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task13_WhileLoop {
    public static void main(String[] args) {

        // Asagidaki kod blogu calistirilirsa sonuc ne olur?
        int x = 0;
        while (x++ < 10) { }  // Loop un ici bos oldugu icin icerde bisi olmaz. X 10 a kadar gelir sart saglanmaz While den cikar
                              // ama cikarken yine 1 artar. Sonucta x=11 olur.

        String message = x > 10 ? "Greater than" : "sart yanlis";
        System.out.println(message + "," + x);

    }


}
