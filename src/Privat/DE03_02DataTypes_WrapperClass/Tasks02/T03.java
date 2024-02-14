package Privat.DE03_02DataTypes_WrapperClass.Tasks02;

// 4 adet double sayı veriliyor, en küçük olanı yazdırınız
public class T03 {
    public static void main(String[] args) {

        double d1 = 34;
        double d2 = 44;
        double d3 = 24;
        double d4 = 14;
        double enK = Double.min(Double.min(d1, d2), Double.min(d3, d4));
        System.out.println("enK = " + enK);
    }
}
