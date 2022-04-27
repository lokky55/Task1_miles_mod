public class BonusMilesService {
    public int calculate(int cost) {

        int rubBonus = 20;

        int amountBonus = cost / rubBonus;
        return amountBonus;
    }

}
