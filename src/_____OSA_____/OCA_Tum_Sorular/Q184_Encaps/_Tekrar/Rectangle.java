package _____OSA_____.OCA_Tum_Sorular.Q184_Encaps._Tekrar;

public class Rectangle {
    private double length;
    private double heigth;
    private double area;
    public void setLength(double length){
        this.length = length;

    }
    public void setHeigth(double heigth){
        this.heigth = heigth;

    }
   public  void setArea(){
        area = length*heigth;
    }
}

/*
Which two changes would encapsulate this class and
ensure that the area field is always equal to length * height
whenever the Rectangle class is used?
A.	Call the setArea method at the end of the setHeight method.
B.	Call the setArea method at the beginning of the setHeight method.
C.	Call the setArea method at the end of the setLength method.
D.	Call the setArea method at the beginning of the setLength method.
E.	Change the setArea method to private.
F.	Change the area field to public.
Answer: AC

Bu soruda, s?n?f?n i�indeki area alan?n?n her zaman length * heigth ile g�ncellenmesini
sa?lamak i�in hangi de?i?ikliklerin yap?lmas? gerekti?i soruluyor.

?ki de?i?iklik gereklidir:

setLength veya setHeigth metodlar? �a?r?ld???nda area alan?n? g�ncellemek i�in setArea metodunu kullanmak.
setArea metodunu s?n?f d???ndan eri?ime kapatmak (private yapmak) ve bu i?lemi s?n?f i�inde kontrol etmek.
Yani, do?ru cevaplar C ve D se�enekleridir:
 */
