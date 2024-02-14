package CodeChallenges.Hafta2.Freitag;

public class For {
    public static void main(String[] args) {
//       1.soru... 1'den 10'e kadar olan sayıların karelerini ekrana yazdır
//
//        for (int i = 1; i <=10 ; i++) {
//            System.out.print( i*i+",");

//       2. soru For döngüsü kullanarak aşağıdaki şekli oluşturun.
//
//            for (int j = 0; j <5 ; j++) {
//                System.out.println("+\t\t+");
//                System.out.println("\t+");
//            }
         String str = "almanya";

        for (int i = str.length()-1 ; i >=0 ; i--) {
            System.out.print(""+str.charAt(i));
        }

    }
    }

