package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Swich_KisaltilmisKelimeninAnlami {
    public static void main(String[] args) {


//ISTB kisaltmasaindan ögrenilmek istenen harfi alma ve karsiligini ögrenme
//I:International, S : Software, T : Testing , Q: Qualification, Cocuk:Board

        Scanner scanner = new Scanner(System.in);
        System.out.print("ISTB de anlamini bilmek istediginiz harfi yazin : ");
        char harf = scanner.next().toUpperCase().charAt(0);

        switch (harf) {
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("gecersiz giris yaptiniz");
        }


    }
}
