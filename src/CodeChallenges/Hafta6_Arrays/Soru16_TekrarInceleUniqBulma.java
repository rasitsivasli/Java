package CodeChallenges.Hafta6_Arrays;

public class Soru16_TekrarInceleUniqBulma {
    public static void main(String[] args) {

        // hangi variable uniq dir..

        String[] names = {"ali", "ayşe", "john", "ali", "ayşe", "john", "asya", "yusuf"};
        String uniqe = names[0];//ali
        int count;

        for (int j = 0; j < names.length; j++) {
            uniqe = names[j];
            count = 0;
            for (int i = 0; i < names.length; i++) {
                if (uniqe.equals(names[i])) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(uniqe + " is unique");
            }

        }
    }
}
