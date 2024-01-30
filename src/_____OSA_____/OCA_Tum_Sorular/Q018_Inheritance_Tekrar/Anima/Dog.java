package _____OSA_____.OCA_Tum_Sorular.Q018_Inheritance_Tekrar.Anima;

// Alt Sinif
class Dog extends Animal {
    String breed;

    // Parametreli Yapici Metot
    public Dog(String species, String breed) {

        this.breed = breed;
        System.out.println("Dog sinifinin parametreli yapici metodu çagrildi.");
    }

    // Yeni bir metot ekleyelim
    public void bark() {
        System.out.println("Hav hav!");
    }

    // Üst siniftan miras alinan bir metodu ezelim (override)
    @Override
    public void eat() {
        System.out.println("Dog yemek yiyor.");
    }
}

