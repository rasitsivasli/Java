package CodeChallenges.Hafta3.Freitag;

public class Task12 {

    public static void main(String[] args) {
//        Girilen bir sayı kadar satır ve sütünu olan ve
//        sağ kenara dayalı üçgeni basan kodu yazınız.
//                Ekran Çıktısı
//        Bir sayi giriniz: 5
//           *
//          **
//         ***
//        ****
//       *****

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }


    }
}


