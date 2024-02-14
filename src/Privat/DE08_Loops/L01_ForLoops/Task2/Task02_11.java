package Privat.DE08_Loops.L01_ForLoops.Task2;

public class Task02_11 {
    public static void main(String[] args) {
        // Bir text veriliyor, tekstin içerisindeki kelimelerden , kaç tanesi 'a' veya 'Baba' ile başlıyordur.
        // Örnek    input : "Ahmet ile ayşe top almışlar"
        //          output: 3

        String str = "Ahmet ile ayşe top almışlar";

         int aIleBaslayanSayisi = 0;

        for (int i = 0; i <str.length()-1 ; i++) {

            String harf = str.substring(i,i+1);

            if (harf.equals(" ")&&str.substring(i+1,i+2).equalsIgnoreCase("a")){
                    aIleBaslayanSayisi++;
                }
        }if (str.substring(0,1).equalsIgnoreCase("a")){
            aIleBaslayanSayisi++;
        }
        System.out.println("aIleBaslayanSayisi = " + aIleBaslayanSayisi);


    }
}
