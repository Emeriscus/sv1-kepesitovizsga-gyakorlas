package army;

public class HeavyCavalry extends MilitaryUnit {

    private static final int HIT_POINTS = 150;
    private static final int DAMAGE = 20;
    private boolean isFirstAttack = true;

    public HeavyCavalry() {
        setDamage(DAMAGE);
        setHitPoints(HIT_POINTS);
        setArmored(true);
    }

    @Override
    public int doDamage() {
        if (isFirstAttack) {
            isFirstAttack = false;
            return 3 * getDamage();
        } else {
            return getDamage();
        }
    }

    @Override
    void sufferDamage(int damage) {
        setHitPoints(getHitPoints() - damage / 2);
    }
}
