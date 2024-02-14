package CodeChallenges.Hafta5;

import java.util.Arrays;

public class Arrays6ElemaninYeriniDegistirm {
    public static void main(String[] args) {

//        bu  dizi de 1. ve 3. index ini degistirin


        int[] dizi = {2, 5, 7, 9};
        elemaniDegistirme(dizi, dizi[1],dizi[3]);


    }

    private static void elemaniDegistirme(int[] dizi, int a, int b) {

        int gecici=a;// gecici = 5
        a=b; // a=9
        b=gecici;//b=5

        dizi[1]=a;
        dizi[3]=b;
        System.out.println("dizi = " + Arrays.toString(dizi));
    }
}


