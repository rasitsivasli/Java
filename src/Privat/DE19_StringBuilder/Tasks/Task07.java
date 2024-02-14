package Privat.DE19_StringBuilder.Tasks;

public class Task07 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        String str = "dfhjklj4678,4,31"; // değişebilir örnektir
        sb1.append(str);



        //1. yol
        sb1.setLength(0);// sb1 icini sifirladik
        sb1.append(str.replaceAll("\\d", ""));
        System.out.println("sb1 = " + sb1);
        ikinciYol(sb1, str);
    }

    private static void ikinciYol(StringBuilder sb1, String str) {
        sb1.setLength(0);// sb1 in  icini bosalttik
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isDigit(ch)) {// Character.isLetter(ch) if in icine böyle yazsaydik sadece harflerden olusan sb1 elde ederdik
                sb1.append(ch);
            }
        }
        System.out.println("sb1 Ikinci Yol = " + sb1);
    }
}