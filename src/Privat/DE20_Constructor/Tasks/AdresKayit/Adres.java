package Privat.DE20_Constructor.Tasks.AdresKayit;

public class Adres {
    // bir B_Musteriler clası oluşturun, cadde,postaKodu,şehir,kapıNo
    String street;
    int zipCode;
    String city;
    String doorNumber;

    public Adres(String street, int zipCode, String city, String doorNumber) {
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.doorNumber = doorNumber;
    }

    @Override
    public String toString() {
        return "B_Musteriler{" +
                "street='" + street + '\'' +
                ", zipCode=" + zipCode +
                ", city='" + city + '\'' +
                ", doorNumber='" + doorNumber + '\'' +
                '}';
    }
}
