package CodeChallenges.Hafta1.KonularaGore_Sorular;

import java.util.Scanner;

public class Costains {
    public static void main(String[] args) {

     /*   String number oluşturulmuştur.
             Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
             Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
             Aksi halde (else) "no money" yazdırın.   */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime= scanner.next();

        if (kelime.contains("$")){
            System.out.println("kelime $ i kapsiyor");
        }
        else if (kelime.contains("€")){
            System.out.println("kelime € i kapsiyor");
        }else System.out.println("no moneydfsd");




    }}

