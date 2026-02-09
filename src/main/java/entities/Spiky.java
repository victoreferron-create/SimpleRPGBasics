package entities;

import core.Entity;

public class Spiky extends Entity {


    public Spiky(int baseDamage, int baseResistance) {
        super(baseDamage, baseResistance);
        this.setMaxHp(5);
        this.setHp(5);

    }

    @Override
    public void onDeath() {
        System.out.println("Spike defeated!");
    }
}
