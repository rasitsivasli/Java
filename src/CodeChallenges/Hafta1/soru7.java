package CodeChallenges.Hafta1;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        //  Girilen yarıcap değeri için Çemberin cevresini ve
        //  Dairenin alanını print eden code create ediniz. (pi =3.14)
        //  Çemberin Çevresi: 2*pi*r
        //  Çemberin Alanı pi*r*r //

        Scanner scanner = new Scanner(System.in);
        System.out.print("yaricapi giriniz : ");
        int yariCap= scanner.nextInt();
        double pi = 3.14;
        double cevre = 2*pi*yariCap;
        double alan = pi*yariCap*yariCap;
        System.out.println("Cevre : "+ cevre+"\n"+"Alan :"+ pi*yariCap*yariCap);





    }
}
