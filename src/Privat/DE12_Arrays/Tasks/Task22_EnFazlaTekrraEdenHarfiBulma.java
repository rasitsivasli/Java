package Privat.DE12_Arrays.Tasks;

public class Task22_EnFazlaTekrraEdenHarfiBulma {
    public static void main(String[] args) {


    /*  Write a Java program to get a String from user as input and find the maximumCounts occurring character in that string.
         (Ignore case sensitivity)

         Girilen  string icinde en cok tekrar eden karakteri print eden code create ediniz.
       input : JavaCAN'lara selam olsun
       output: maximumCounts occurring character is : a
        */
        String str = "JavaCAN'lara selam olsun";

        String[] arr = str.split("");
        int count = 0;// icerdeki for dan cikinca sifirlanmali, yoksa üstüne yazdirir
        int enBuyuk = 0; // en fazla Count u olani bulmak icin
        String enCokTekrarEdenHarf="";
        for (int i = 0; i < arr.length; i++) {
            count=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                }
            }if (count>enBuyuk){
                enBuyuk=count;
                enCokTekrarEdenHarf=arr[i];
            }
        }
        System.out.println(enCokTekrarEdenHarf+ " harfi toplam "+enBuyuk+" defa tekrarlamaktadir");


    }
}

