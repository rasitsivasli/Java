package _____OSA_____.DE40InterviewQuestions.Day05;

public class Q13_PrintArray {
    // Create a method which takes String array as a parameter
    // and prints all the element
    public static void main(String[] args) {
        String[] arabalar = {"Honda", "Toyota", "Porsche", "Tesla", "BMW"};
        String[] renkler = {"Mavi", "Kirmizi", "Mor", "Kahverengi", "Sari", "Turuncu", "Yesil"};
        printElements(arabalar, renkler);

    }

    public static void printElements(String[] arr, String[] renkler) {

        for (String string : arr) {
            System.out.print(string + " ");
        }
        System.out.println();
        for (String string : renkler) {
            System.out.print(string + " ");
        }
    }


}
