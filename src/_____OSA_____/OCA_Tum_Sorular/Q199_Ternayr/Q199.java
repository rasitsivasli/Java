package _____OSA_____.OCA_Tum_Sorular.Q199_Ternayr;

public class Q199 {
    public static void main(String[] args) {
        String stuff = "TV";
        String res = null;
       res= stuff.equals("TV") ?  "Walter": stuff.equals("Movie") ?  "White" :  "No Result";

    }
}

/*
A) ;
B) res = stuff.equals("TV") ? "Walter" else stuff.equals("Movie") ? "White" : "No Result";
C) res = stuff.equals("TV") ? stuff.equals("Movie") ? "Walter" : "White" : "No Result";
D) res = stuff.equals("TV") ? "Walter": stuff.equals("Movie") ? "White" : "No Result";

D sikki dogru cevap cunku esit sayida ':' ve '?' olmasi lazim (2'ser tane). C sikkinda "Walter" yanlis yerde; B sikkinda 'else' kullanilmamali.
A sikkinda 'res' ler yanlis yerdeler
 */