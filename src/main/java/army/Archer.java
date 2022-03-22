package army;

public class Archer extends MilitaryUnit {

    private static final int HIT_POINTS = 50;
    private static final int DAMAGE = 20;

    public Archer() {
        setDamage(DAMAGE);
        setHitPoints(HIT_POINTS);
    }
}
