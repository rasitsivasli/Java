package soru_cevap._21Inheritance.VarmisinYokmusun;

public class Child extends Parent{
    public Child() {
    }
    @Override
    public String toString() {
        return "Ben Child Class'taki toStringMethodu";
    }
    @Override
    public void parentIsimYazdir() {
        System.out.println("Ben Child Class !");
    }
}