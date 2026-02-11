package entities;

import core.Entity;

public class Spiky extends Entity {


    public Spiky(int baseDamage, int baseResistance) {
        super();
        this.setMaxHp(5);
        this.setHp(5);
        this.setBaseDamage(8);
        this.setBaseResistance(0);

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
        System.out.println("Spike defeated!");
    }
}
