package CodeChallenges.Hafta6_Arrays;

public class Soru16_selbst {
    public static void main(String[] args) {

        String[] names = {"ali", "ayşe", "john", "ali", "ayşe", "john", "asya", "yusuf"};
        // hangi variable unique dir.. ve diger uniq olmayanlar kac defa kullanilmistir...

        int count;
        String uniq;

        for (int i = 0; i < names.length; i++) {
            uniq = names[i];
            count=0;

            for (int j = 0; j < names.length; j++) {

                if (uniq.equals(names[j])) {
                    uniq = names[i];
                    count++;

                }

            }if (count==1) System.out.println(uniq+" is unique ");

        }

    }
}
