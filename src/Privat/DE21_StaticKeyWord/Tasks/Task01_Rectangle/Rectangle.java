package Privat.DE21_StaticKeyWord.Tasks.Task01_Rectangle;

public class Rectangle {
    int width;
    int length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public int cevreHesaplama(){
        return width*2+length*2;
    }
    public int alanHesaplama(){
        return width*length;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
