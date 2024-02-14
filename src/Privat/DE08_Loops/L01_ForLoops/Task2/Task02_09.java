package Privat.DE08_Loops.L01_ForLoops.Task2;

public class Task02_09 {
    public static void main(String[] args) {
        // Bir string veriliyor, for kullanarak her harf arasına bir boşluk gelecek  şekilde yazdırın
        // ama yazarken ilk harf büyük olsun ve sonrası bir küçük, bir büyük harf olarak devam etsin
        String str = "Selamlar";
        String yeniStr ="";

        for (int i = 0; i <str.length() ; i++) {

            if (i%2==0){
                yeniStr =yeniStr+" "+str.substring(i,i+1).toUpperCase();
            }else yeniStr =yeniStr+" "+str.substring(i,i+1).toLowerCase();

        }
        System.out.println(yeniStr.trim());
//
//        ///  2.yol
//        for (int i = 0; i <str.length() ; i++) {
//
//            if (i%2==0){
//                System.out.println(str.substring(i,i+1).toUpperCase()+" ");
//            }else System.out.println(str.substring(i,i+1).toLowerCase()+" ");
//
//        }
//        System.out.println(yeniStr);

    }
}
