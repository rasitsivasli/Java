package Privat.DE20_Constructor.OrnekCar;

public class Person {
    String adSoyad;
    String adres;
    Car car2;

    public Person() {

    }

    public Person(String adSoyad, String adres,Car car2) {
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.car2=car2;

    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "adSoyad='" + adSoyad + '\'' +
                ", adres='" + adres + '\'' +
                ", car2=" + car2 +
                '}';
    }
}
