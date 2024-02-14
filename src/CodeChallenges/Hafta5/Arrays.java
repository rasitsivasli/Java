package CodeChallenges.Hafta5;

public class Arrays {
    public static void main(String[] args) {
        int [] aDizisi = {10,20,11,23,12}; // 5 elemanı dizi tanımladık
        int temp = aDizisi[1]; // temp =20
        aDizisi[1]=aDizisi[2];
        aDizisi[2]=temp;
        System.out.println("aDizisi= ");
        for (int i = 0; i < aDizisi.length; i++) {
            System.out.print(aDizisi[i]+",");

        }


    }
}
