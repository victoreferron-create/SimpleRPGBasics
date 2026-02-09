package entities;

import core.Entity;

public class Player extends Entity {

    public Player(int baseDamage, int baseResistance) {
        super(baseDamage, baseResistance);
        this.setMaxHp(50);
        this.setHp(50);
    }

    @Override
    public void onDeath() {
        System.out.println("YOU DIED...");
    }
}
