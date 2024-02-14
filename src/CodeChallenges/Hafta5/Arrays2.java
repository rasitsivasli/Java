package CodeChallenges.Hafta5;

public class Arrays2 {
    public static void main(String[] args) {
        int[] aDizisi = {10, 20, 11, 23, 12}; // 5 elemanı dizi tanımladık
        int toplam = 0;
        for (int i = 0; i < aDizisi.length; i++) {
            toplam += aDizisi[i];

        }
        System.out.println("toplam = " + toplam);


    }
}
