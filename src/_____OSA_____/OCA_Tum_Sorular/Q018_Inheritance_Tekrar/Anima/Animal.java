package _____OSA_____.OCA_Tum_Sorular.Q018_Inheritance_Tekrar.Anima;

public class Animal {
    String species;

    // parametresiz coms.
    public Animal(){
        System.out.println("Animal sinifinin parametresi cons.");
    }
    // Parametreli Yapici Metot
    public Animal(String species) {
        this.species = species;
        System.out.println("Animal sinifinin parametreli yapici metodu çagrildi.");
    }

    public void eat() {
        System.out.println("Animal yemek yiyor.");
    }

}
