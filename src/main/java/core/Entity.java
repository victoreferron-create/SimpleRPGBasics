package core;

import org.jetbrains.annotations.NotNull;

public abstract class Entity implements Damager, Damageable{

    private final int baseDamage;
    private final int baseResistance;
    private int hp;
    private int maxHp;


    /**
     * <font color="red"><b>WARNING:</b></font>
     * In your constructor, you must set Max HP before Current HP.
     * <pre>
     * public MyEntity() {
     * super(10, 5);
     * setMaxHp(100); // 1. Do this first
     * setHp(100);    // 2. Do this second
     * }
     * </pre>
     */
    public Entity(int baseDamage, int baseResistance) {
        this.baseDamage = baseDamage;
        this.baseResistance = baseResistance;
    }


    @Override
    public int getBaseDamage() {
        return this.baseDamage;
    }

    @Override
    public int calculateAttackerSideDamage() {
        return this.getBaseDamage();
    }

    @Override
    public int getBaseResistance() {
        return this.baseResistance;
    }

    @Override
    public int calculateFinalDamage(Damager damager, int attackerSideDamage) {

        int netDamage = attackerSideDamage - this.getBaseResistance();

        if (netDamage <= 0) {
          return 1;
        } else {
            return netDamage;
        }

    }

    @Override
    public void hit(@NotNull Damager damager) {
        int rawDamage = damager.calculateAttackerSideDamage();

        int finalDamage = this.calculateFinalDamage(damager, rawDamage);

        this.setHp(Math.max(0, this.getHp() - finalDamage));

        if (this.getHp() == 0) {
            this.onDeath();
        }
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, Math.min(hp, this.getMaxHp()));
    }
    public int getHp() {
        return this.hp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }
    public int getMaxHp() {
        return this.maxHp;
    }

    public abstract void onDeath();

    @Override
    public void attack(Damageable target) {
        target.hit(this);
    }


}
