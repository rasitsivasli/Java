package Privat.DE08_Loops.L02_WhileLoops.BOZ;

public class Aufgabe1 {
    public static void main(String[] args) {

        // 1 den 100 e kadar olan sayilarin toplami mit While

        int toplam=0;
        System.out.println("toplamMitWhile(toplam) = " + toplamMitWhile(toplam));

    }

    private static int toplamMitWhile(int topla) {
        int i =1;
        while (i<=100){

            topla+=i;
            i++;
        }
        return topla;
    }
}
