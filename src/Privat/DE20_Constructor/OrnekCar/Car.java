package Privat.DE20_Constructor.OrnekCar;

public class Car {
    String marka;
    String renk;
    String model;
    int modelYili;
    boolean vites;

    public Car(String marka, String model, boolean vites, int modelYili) {
        this.marka=marka;
        this.model=model;
        this.vites=vites;
        this.modelYili=modelYili;
    }


    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", modelYili=" + modelYili +
                ", vites=" + vites +
                '}';
    }

    public Car(String marka, String model, boolean otomatikMi){
        this.marka = marka;
        this.model = model;
        this.vites = otomatikMi;

    }

    public Car() {
    }
}
