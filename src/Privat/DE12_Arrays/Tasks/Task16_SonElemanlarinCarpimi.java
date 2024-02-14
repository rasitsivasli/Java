package Privat.DE12_Arrays.Tasks;

public class Task16_SonElemanlarinCarpimi {
    public static void main(String[] args) {
        // Task-> sayi arr'deki son elemanların çarpımını print eden code create ediniz

        int[] carpim = {1, 2, 3, 4, 5, 6};
        arrCarpimSonTerinler(carpim);
    }

    private static void arrCarpimSonTerinler(int[] carpim) {
        System.out.println("Son terimlerin carpimi = "+ carpim[carpim.length-1]*carpim[carpim.length-2]);

    }
}
