package Soldier;

import Constant.Type;
import Operation.Defend;
import Operation.SpecialAbility;

public class Archer extends Soldier implements Defend, SpecialAbility {

    public Archer(String name, int damage) {
        super(name, Type.DEFENSIVE, damage);
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + getName() + " defends " + getDamage() + " damage.");
    }

    @Override
    public void specialAbility() {
        System.out.println("Soldier " + getName() + " fires fire arrows");
    }
}
