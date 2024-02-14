package CodeChallenges.Hafta5;

public class Arrays4 {
    public static void diziYaz(int[] str) {

        System.out.print("[");
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + ",");
        }
        System.out.print(str[str.length - 1] + "]");
    }

    public static void diziYaz(char[] str) {

        System.out.print("[");
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + ",");
        }
        System.out.print(str[str.length - 1] + "]");
    }

    public static void diziYaz(String[] str) {

        System.out.print("[");
        for (int i = 0; i < str.length - 1; i++) {
            System.out.print(str[i] + ",");
        }
        System.out.println(str[str.length - 1] + "]");
    }
}