package Privat.DE08_Loops.L01_ForLoops.Task1;

public class Task25_2inciYontemiDeneTekrarBak {

    /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = "aabbcccccddddaaa";

//        1.yol

        String yeniStr = str;

        int uzunluk = str.length();

        for (int i = 0; i < uzunluk; i++) {

            yeniStr = str.charAt(i) + yeniStr.replace(""+str.charAt(i),"");

        }
        System.out.println("yeniStr = " + yeniStr);



//
////        2.yolu tekrar dene
//
//        String str2 = "aabbcccccddddaaa";
//        String yeniStr2 = "";// isleme etki etmeyecek yeni bir string tanimladik
//
//        for (int i = 0; i <str2.length() ; i++) {
//            String ch = ""+str2.charAt(i);
//            if (!yeniStr2.contains(ch)){
//
//                yeniStr2=yeniStr+ch;
//            }
//
//        }
//        System.out.println("yeniStr2 = " + yeniStr2);


    }
}
