package Privat.DE20_Constructor.OrnekCar;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car();
        car.renk = "Kirmizi";
        car.model = "Toyota Coralla";
        car.modelYili = 2020;
        System.out.println(car);

        Car car2 = new Car("Audi","A6",true,2009);
        System.out.println("car2 = " + car2);

        Car car3 = new Car("Volvo", "s60",false,2024);
        System.out.println("car3 = " + car3);

        Person kisi = new Person("Rasit Yilmaz","Kaiserslautern",car2);
        System.out.println("kisi = " + kisi);


    }
}
