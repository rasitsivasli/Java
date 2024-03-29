package _____OSA_____.DE40InterviewQuestions.Day05;

public class Q05_WrapperClassTask {

    // create a method that accepts an int
    // and returns twice of that int
    // overload this method with wrapper class: Integer

    // int kabul eden bir metot yarat
    // ve bu int'nin iki katını döndürür
    // bu yöntemi wrapper sınıfıyla overload et : Integer
    public static void main(String[] args) {
        int sayi = 5;
        Integer sayiInteger = 5;
        int ikiKati = carp(sayi);
        int dortKatiInteger = carp(sayiInteger);
        System.out.println("iki Kati = " + ikiKati);
        System.out.println("dort Kati = " + dortKatiInteger);

    }

    private static int carp(int sayi) {
        return sayi*2;
    }
    private static int carp(Integer sayi) {
        return sayi*4;
    }

}
