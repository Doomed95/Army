package Soldier;

import Constant.Type;

public abstract class Soldier {
    private final String name;
    private final Type type;
    private final int damage;

    public Soldier(String name, Type type, int damage) {
        this.name = name;
        this.type = type;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public void report(Type type) {
        System.out.println("Soldier " + this.name + " here. Constant.Type - " + type);
    }
}
