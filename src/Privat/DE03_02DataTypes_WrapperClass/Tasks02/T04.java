package Privat.DE03_02DataTypes_WrapperClass.Tasks02;

public class T04 {
    public static void main(String[] args) {
        // 4 adet int sayı veriliyor, en küçük olanı yazdırınız (* tek bir satırda)
        int s1 = 22, s2 = 11, s3 = 17, s4 = 29;
        int enBuyuk = Integer.min(Integer.min(s1, s2), Integer.min(s3, s4));
        // enBuyuk = ???  ;
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
