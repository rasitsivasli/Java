package Privat.DE08_Loops.L01_ForLoops.Task1;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

        int n = 6; // Desen boyutu

        for (int i = 1; i <= n; i++) {
            // Boşlukları yazdır
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Sayıları yazdır
            for (int k = i; k <= n; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // Yeni bir satıra geç
        }
    }
}





