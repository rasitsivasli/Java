package _____OSA_____.DE40InterviewQuestions.Day03;

import java.util.Arrays;

public class Q03_HackerLanguage {

    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method
// (method ismi hackerDili) yazınız. Hackerlar bazı harfleri sayılara çevirerek
// yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.(Array ve String Manipulation)
    public static void main(String[] args) {
        String str = "Java ile hersey güzel";
        str = str.replace("s", "5").replace("a", "4")
                 .replace("e", "3").replace("i", "1").
                  replace("o", "0");
        System.out.println("str = " + str);


        //        2.yol

        String[] arr = str.split("");
        System.out.println("arr = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]){
                case "s": arr[i]=""+5;break;
                case "a": arr[i]=""+4;break;
                case "e": arr[i]=""+3;break;
                case "i": arr[i]=""+1;break;
                case "o": arr[i]=""+0;break;
            }
        }
        System.out.println(Arrays.toString(arr).substring(1,Arrays.toString(arr).length()-1)
                .replace(", ",""));



    }
}
