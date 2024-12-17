package Soldier;

import Constant.Type;
import Operation.Attack;
import Operation.SpecialAbility;

public class Knight extends Soldier implements Attack, SpecialAbility {


    public Knight(String name, int damage) {
        super(name, Type.OFFENSIVE, damage);
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void specialAbility() {
        System.out.println("Soldier " + getName() + " executes the enemy.");
    }
}
