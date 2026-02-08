package core;

public interface Damageable {
    int getResistance();
    int calculateFinalDamage(Damager damager, int attackerSideDamage);
}
