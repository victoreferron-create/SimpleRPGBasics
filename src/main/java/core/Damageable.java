package core;

public interface Damageable {
    int getBaseResistance();
    int calculateFinalDamage(Damager damager, int attackerSideDamage);
    void hit(Damager damager);
}
