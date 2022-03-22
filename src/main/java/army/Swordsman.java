package army;

public class Swordsman extends MilitaryUnit {

    private static final int HIT_POINTS = 100;
    private static final int DAMAGE = 10;
    private boolean hasShield = true;

    public Swordsman(boolean armored) {
        setHitPoints(HIT_POINTS);
        setDamage(DAMAGE);
        setArmored(armored);
    }

    @Override
    void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else {
            if (isArmored()) {
                setHitPoints(getHitPoints() - damage / 2);
            } else {
                super.sufferDamage(damage);
            }
        }
    }
}
