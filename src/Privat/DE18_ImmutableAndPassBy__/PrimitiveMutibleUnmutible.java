package Privat.DE18_ImmutableAndPassBy__;

public class PrimitiveMutibleUnmutible {
    public static void main(String[] args) {


        String s1="Ali";
        System.out.println(System.identityHashCode(s1));
        String s2="Al";
        s2=s2+"i";
        System.out.println(System.identityHashCode(s2));
        String s3=new String("Ali");
        System.out.println(System.identityHashCode(s3));
        System.out.println(s1==s2);//true aynı referansı gösterdiği için
        System.out.println(s1==s3);//false
        System.out.println(s1.equals(s3));//true
    }
}
