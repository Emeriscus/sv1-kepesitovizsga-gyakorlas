package army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        army.forEach(a -> a.sufferDamage(damage));
        army = army.stream().filter(a -> a.getHitPoints() > 25).toList();

    }

    public int getArmyDamage() {
        return army.stream()
                .mapToInt(MilitaryUnit::doDamage)
                .sum();
    }

    public int getArmySize() {
        return army.size();
    }
}
