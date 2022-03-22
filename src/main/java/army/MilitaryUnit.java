package army;

public abstract class MilitaryUnit {

    private int hitPoints;
    private int damage;
    private boolean armored;

    public boolean isArmored() {
        return armored;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setArmored(boolean armored) {
        this.armored = armored;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int doDamage() {
        return damage;
    }

    void sufferDamage(int damage) {
        hitPoints -= damage;
    }
}
