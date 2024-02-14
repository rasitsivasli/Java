package Privat.DE20_Constructor.selbst;

public class Person {
    String isim;
    int yas;
    String sehir;

public Person(){

}
public Person(String isim, int yas , String sehir){
    isim = isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
    this.isim = isim;
    this.yas = yas;
    this.sehir = sehir;
}
}
