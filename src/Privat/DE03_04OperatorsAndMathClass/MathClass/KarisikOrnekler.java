package Privat.DE03_04OperatorsAndMathClass.MathClass;

public class KarisikOrnekler {
    public static void main(String[] args) {
        // 2 basamakli random sayi üret

        int sayi = (int) (Math.random()*10);
        System.out.println(sayi);

        System.out.println(Math.sqrt(sayi));
        System.out.println(Math.round(Math.sqrt(sayi)));
        System.out.println((int) Math.floor(Math.sqrt(sayi)));
        System.out.println(Math.pow(sayi,sayi));

    }
}
