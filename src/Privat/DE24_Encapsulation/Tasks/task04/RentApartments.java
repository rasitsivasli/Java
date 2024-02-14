package Privat.DE24_Encapsulation.Tasks.task04;

public class RentApartments {
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
    private String name;
    private int roomCount;
    private boolean balconyOrNo;

    public RentApartments() {
    }

    public RentApartments(String name, int roomCount, boolean balconyOrNo) {
        this.name = name;
        this.roomCount = roomCount;
        this.balconyOrNo = balconyOrNo;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }

    @Override
    public String toString() {
        return "RentApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +
                '}';
    }

    public int rent() {
        int rent = switch (roomCount) {
            case 0 -> 1400;
            case 1 -> 1700;
            case 2 -> 2200;
            case 3 -> 2700;
            default -> {
                System.out.println(roomCount + " odali dairemiz mevcut degil");
                yield 2700;
            }
        };
        if (balconyOrNo) rent+=200;
        return rent;
    }

}
