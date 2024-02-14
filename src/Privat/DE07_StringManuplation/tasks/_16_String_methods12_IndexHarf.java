package Privat.DE07_StringManuplation.tasks;

public class _16_String_methods12_IndexHarf {

    public static void main(String[] args) {

        /*  Florida kelimesinden bir String oluşturun.
            Florida kelimesinin içindeki, sadece  'o'  harfinin bulunduğu indexini yazdırın.  */

//        //Kodu aşağıya yazınız.
//        String str = "Florida";
//        System.out.println(str.charAt(2));


//   2. cözüm---------

//
//        String str = "Florida";
//        System.out.println(str.charAt(str.length()-5));
//   3. cözüm---------

//
        String str = "Florida";
        System.out.println(" 'o' harfinin indexi : "+ str.indexOf("o")+ "  dir");

        int ilkIndex = str.indexOf("o",2);//2. karakterden itibaeren o nun kacinci karakterden itibaren indexi
        System.out.println("ilkIndex = " + ilkIndex);

        // soru : "Merhaba Dünya" stringinde 2. kelime deki  a harfinin indeksi
        str = "Merhaba Dünya";
        int boslukIndex = str.indexOf(" ");
        int ikinciKelimedekiAninIndexi = str.indexOf("a", boslukIndex);

        System.out.println("Ikinci kelimedeki a nin yeri : " + ikinciKelimedekiAninIndexi);
        // 2. yol
        System.out.println("Ikinci kelimedeki a nin yeri : " + ikinciKelimedekiAninIndexi);
    }
}
