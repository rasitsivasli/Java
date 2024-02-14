package CodeChallenges.Projeler.Tas;

import java.util.Scanner;

public class Task1_TasKagitMakas {
    /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 1 ile 4 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int benutzerPunkt = 0;
        int computerPunkt = 0;

        System.out.println("***** Herzlich Wilkommen zum Spiel *****");
        System.out.println("1- Stein \n2- Papier \n3- Schere");
        String istWeiter;
        do {
            System.out.print("Bitte wählen Sie ein Zahl aus : ");
            int benutzer = scanner.nextInt();
            System.out.println();
            if (benutzer > 3 || benutzer < 1) {
                System.err.println("Bitte wahlen Sie von 1 bis 3 ein Ziffern aus");// kirmizi uyari icin err. yaptik
                System.exit(0);// Direkt Program aus.
            }
            System.out.println("Der Auswahl des Spielers: " + nomen(benutzer));
            int computer = (int) (Math.random() * 3 + 1);
            System.out.println("Der Auswahl des Computers : " + nomen(computer));
            if (benutzer == computer) {
                System.out.println("Das Ergebnis : Untentschied");
            } else {
                if (benutzer == 1) {// Stein
                    if (computer == 2) {// Papier
                        computerPunkt++;
                        System.out.println("Der Gewinner ist der Computer");
                    } else {
                        benutzerPunkt++;
                        System.out.println("Der Gewinner ist Der Spieler");
                    }
                }

                if (benutzer == 2) {// Papier
                    if (computer == 3) {// Schere
                        computerPunkt++;
                        System.out.println("Der Gewinner ist der Computer");
                    } else {
                        benutzerPunkt++;
                        System.out.println("Der Gewinner ist der Spieler");
                    }
                }
                if (benutzer == 3) { // Schere
                    if (computer == 1) {// Stein
                        computerPunkt++;
                        System.out.println("Der Gewinner ist der Computer");
                    } else {
                        benutzerPunkt++;
                        System.out.println("Der Gewinner ist der Spieler");
                    }
                }
            }
            System.out.println();
            System.out.print("Würden Sie weiter spielen : ");
            istWeiter = scanner.next();// weiter oder fertig?

        } while (istWeiter.equalsIgnoreCase("Ja"));

        System.out.println("Der Punkt des Computers : " + computerPunkt);
        System.out.println("Der Punkt des Spielers : " + benutzerPunkt);

        if (computerPunkt > benutzerPunkt) System.out.println("Der Gewinner ist der Computer");
        if (computerPunkt < benutzerPunkt) System.out.println("Der Gewinner ist der Spieler");
        if (computerPunkt == benutzerPunkt) System.out.println("Untentschieden");


    }

    public static String nomen(int benutzer) {
        if (benutzer == 1) {
            return "Stein";
        } else if (benutzer == 2) {
            return "Papier";
        } else return "Schere";
    }

}
