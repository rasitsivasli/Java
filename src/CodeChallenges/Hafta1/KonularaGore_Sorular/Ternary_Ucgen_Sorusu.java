package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Ternary_Ucgen_Sorusu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir ücgenin kenar uzunluklarini sirayla giriniz : ");
        int kenarBir = scanner.nextInt();
        int kenarIki = scanner.nextInt();
        int kenarUc = scanner.nextInt();


        System.out.println(kenarBir==kenarIki && kenarIki==kenarUc && kenarBir>0 ? "Eskenar Ücgendir": "Eskenar ücgen degildir" );


    }

}
