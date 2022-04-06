public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}





public class BonusMilesService {
    public int calculate(int price) {
        int oneMile = 20;
        int miles = price / oneMile;
        return miles;
    }
}