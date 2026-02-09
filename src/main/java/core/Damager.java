package core;

public interface Damager {
    int getBaseDamage();
    int calculateAttackerSideDamage();
    void attack(Damageable target);
}
