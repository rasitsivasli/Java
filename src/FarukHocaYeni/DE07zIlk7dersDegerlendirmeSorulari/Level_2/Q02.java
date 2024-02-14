package FarukHocaYeni.DE07zIlk7dersDegerlendirmeSorulari.Level_2;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Klavyeden girilen 4 sayının en büyüğünü
        // Aşağıdaki yöntemlerden en az 2 tanesi ile çözünüz
        // Task 04.1 : if kullanarak bulunuz (ternary, wrapper,Math kullanılmayacak)
        // Task 04.2 : ternary kullanarak bulunuz (if, wrapper,Math kullanılmayacak)
        // Task 04.3 : Matt class kullanarak bulunuz (if, ternary, wrapper,kullanılmayacak)
        // Task 04.4 : Wrapper class kullanarak bulunuz (if, ternary, math,kullanılmayacak)
        // Task 04.5 : Math class içinde ternary kullanarak bulunuz (if,wrapper,kullanılmayacak)
        // Task 04.6 : Ternary içinde Math class kullanarak bulunuz (if,wrapper,kullanılmayacak)

        Scanner scanner = new Scanner(System.in);
        System.out.println("4 adet sayi giriniz : ");
        double sayi1=scanner.nextDouble();
        double sayi2=scanner.nextDouble();
        double sayi3=scanner.nextDouble();
        double sayi4=scanner.nextDouble();

        // Math class
        System.out.println(Math.max(Math.max(sayi1,sayi2),Math.max(sayi3,sayi4)));

        // tearnary

        System.out.println(Math.max((sayi1>sayi2 ? sayi1:sayi2),(sayi3>sayi4 ? sayi3:sayi4)));



    }
}
