package _____OSA_____.DE40InterviewQuestions.Day04;


public class Q13_DuplicateValue {
       /*
        Write a code that returns the duplicate chars in a String array.
        (interview Question)
        Input :
        String str=“Javaisalsoeasy”
        Output: [a, s]
         */

    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        StringBuilder output = new StringBuilder();
        String[] str2 = str.split("");

        for (String string : str2) {
            int count = 0;
            for (String s : str2) {
                if (string.equals(s)) {
                    count++;
                }
            }
            if (count > 1 && !output.toString().contains(string)) output.append(string);
        }
        System.out.println("output = " + output);
    }


}

