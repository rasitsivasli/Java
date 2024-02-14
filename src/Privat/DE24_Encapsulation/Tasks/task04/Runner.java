package Privat.DE24_Encapsulation.Tasks.task04;

import java.util.Scanner;

public class Runner {
    /*Task
     B_RunnerMusteri ve rentApartments Class'ları create ediniz
    rentApartments Class'ında data hiding->encapsulated
    Bu variable'ları create ediniz
    String name
    int roomCount
    boolean balconyOrNo



    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    B_RunnerMusteri class  içinde;
    userName rent is amountOfRent(... kiracı nın datalarını -> oda saysı, balkon isteği ,kira miktarı)
    print eden code create ediniz*/
    public static void main(String[] args) {
        RentApartments kiraci = new RentApartments();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kiracinin ismi : ");
        kiraci.setName(scanner.next());
        System.out.print("Daire kac odali : ");
        kiraci.setRoomCount(scanner.nextInt());
        System.out.print("Balkon var mi : ");
        kiraci.setBalconyOrNo(scanner.nextBoolean());

        System.out.println("kiraci = " + kiraci+" Kira : "+kiraci.rent());


    }
}
