package Privat.DE08_Loops.L01_ForLoops.Tasks;

public class Task29_baska_yontemleCoz {

    public static void main(String[] args) {
        // Task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK


        String str = "Java candir, Selenium heyecandir";
        int uz = str.length();
        String sonuc = "";

            for (int i = 0; i < uz; i++) {
                char ch = str.charAt(i);
                if (i % 2 == 0) {
                    sonuc += Character.toUpperCase(ch);
                } else {
                    sonuc += Character.toLowerCase(ch);
                }
            }

            System.out.println("Sonuç: " + sonuc);
        }
    }




