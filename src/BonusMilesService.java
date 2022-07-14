public class BonusMilesService {

    private int miles;

    public int calculate(int price) {

        int cost = 20;
        miles = (price / cost);

        return miles;
    }

}
