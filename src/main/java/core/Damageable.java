package core;

public interface Damageable {
    int getBaseResistance();
    int calculateFinalDamage(Damager damager);
}
