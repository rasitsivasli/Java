package CodeChallenges.Hafta5;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        String[] aDizisi ={"r","a","s","i","t"};
        System.out.println("aDizisi = " + Arrays.toString(aDizisi));
        String[] bDizisi ={"","","","",""};
        System.out.println("bDizisi = " + Arrays.toString(bDizisi));
        String[] cDizisi =new String[5];
        System.out.println("cDizisi = " + Arrays.toString(cDizisi));// diziyi direkt Arrays klasi ile de yazdirabiliriz.
        System.out.println(aDizisi[aDizisi.length-1]);
        System.out.println( aDizisi[1].length());

        int [] intDizisi = new int[10];
        int [] array2= {1,2,3,4,5};

        System.out.println("intDizisi = " + Arrays.toString(intDizisi));

        char[] charDizisi = new char[10];
        System.out.println("charDizisi = " + Arrays.toString(charDizisi));

        Arrays4.diziYaz(intDizisi);
        Arrays4.diziYaz(array2);


    }
}
