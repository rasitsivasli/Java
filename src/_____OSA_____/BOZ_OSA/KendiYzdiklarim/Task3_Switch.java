package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task3_Switch {
    public static void main(String[] args) {

        final char a = 'A';  // final keyword variable nin son degerini belirler
        final char d = 'D';
        char grade   = 'B';

        switch (grade) {
            case   a:// normalde case e variable yazilamaz, ancak final deger oldugu ve degismeyecegi icin konulabilir, hata vermez
            case 'B': System.out.print("great");
            case 'C': System.out.print("good");break;
            case   d:
            case 'F': System.out.print("not good");
        }

    }
}
