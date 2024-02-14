package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task7_DataCasting {
    public static void main(String[] args) {
        // byte < short < integer < long < float < double

        byte a = 40, b = 50;
        //byte sum = a + b;// java esitligin sag tarafindaki tamsayi degerlerini int olarak kabul eder. Castin yapmamiz gerekir
        byte sum = (byte) (a + b);
        System.out.println(sum);

    }


}
