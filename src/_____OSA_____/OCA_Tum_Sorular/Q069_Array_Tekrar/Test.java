package _____OSA_____.OCA_Tum_Sorular.Q069_Array_Tekrar;

public class Test {
    public static void main(String[] args) {
        String[][] chs = new String[5][2];
        chs[0] = new String[2];// dizinin 1. elemani 2 elmanli old. g�steriyor
        chs[1] = new String[2];
        int i = 97;

        for (int a = 0; a < chs.length; a++) {
            for (int b = 0; b < chs.length; b++) {
                chs[a][b] = " " + i;
                i++;
            }
        }
        for (String[] ca : chs) {
            for (String c : ca) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
/**
 * What is the result?
 * A. 97 9899 100 null null null
 * B. 97 9899 100 101 102 103
 * C. Compilation fails.
 * D. A NullPointerException is thrown at runtime.
 * E. An ArrayIndexOutOfBoundsException is thrown at runtime.
 */




// E
