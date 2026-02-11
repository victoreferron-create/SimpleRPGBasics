package entities;

import core.Entity;

public class Player extends Entity {

    public Player(int baseDamage, int baseResistance) {
        super();
        this.setMaxHp(50);
        this.setHp(50);
        this.setBaseDamage(6);
        this.setBaseResistance(10);
    }

    @Override
    public int attackerSideModifiers() {
        return 0;
    }

    @Override
    public int finalDamageModifiers() {
        return 0;
    }

    @Override
    public void onDeath() {
        System.out.println("YOU DIED...");
    }
}
