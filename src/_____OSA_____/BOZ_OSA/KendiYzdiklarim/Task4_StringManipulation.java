package _____OSA_____.BOZ_OSA.KendiYzdiklarim;

public class Task4_StringManipulation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        /*7. satir a seceneklerden hangisini eklersek Equal i görürürüz.
        * equals--- equalsIgnoreCase---  == */

        if (str1.equalsIgnoreCase(str2)) {
            System.out.println("Equal");

        } else {
            System.out.println("Not Equal");
        }
    }
}
