package core;

public abstract class Entity implements Damager, Damageable{

    private final int baseDamage;
    private final int baseResistance;

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
        // added comment
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


}
