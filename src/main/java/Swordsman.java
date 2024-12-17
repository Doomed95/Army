public class Swordsman extends Soldier implements Attack, Defend, SpecialAbility {

    public Swordsman(String name, int damage) {
        super(name, Type.ADAPTABLE, damage);
    }

    @Override
    public void attack() {
        System.out.println("Soldier " + getName() + " deals " + getDamage() + " damage.");
    }

    @Override
    public void defend() {
        System.out.println("Soldier " + getName() + " defends " + getDamage() + " damage.");
    }

    @Override
    public void specialAbility() {
        System.out.println("Soldier " + getName() + " uses Mortal strike.");
    }
}
