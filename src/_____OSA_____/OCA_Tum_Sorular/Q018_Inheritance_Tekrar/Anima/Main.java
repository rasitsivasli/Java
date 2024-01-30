package _____OSA_____.OCA_Tum_Sorular.Q018_Inheritance_Tekrar.Anima;

public class Main {
    public static void main(String[] args) {
        // Dog sinifindan bir nesne olu?tural?m
        Dog myDog = new Dog("Köpek", "Golden Retriever");

        // Dog sinifinin methodlarini cagiriyoruz
        myDog.eat();  // Dog sinifinin Override edilmis methodlari cagirili
        myDog.bark(); // Dog siniina ait method cagirilir
        Animal animal = new Animal();

        // Animal sinifinin metotlarini çagiralim (miras alinan metotlar)

    }
}
