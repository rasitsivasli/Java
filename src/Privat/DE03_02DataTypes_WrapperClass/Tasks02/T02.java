package Privat.DE03_02DataTypes_WrapperClass.Tasks02;

// 2 adet byte sayı veriliyor, küçük olanı yazdırınız
public class T02 {
    public static void main(String[] args) {
        byte b1 = 24;
        byte b2 = 33;
        int enB = Integer.max(b1, b2);
        System.out.println("enB = " + enB);
    }


}
