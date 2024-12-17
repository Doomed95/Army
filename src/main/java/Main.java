import Soldier.Archer;
import Soldier.Knight;
import Soldier.Swordsman;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();

        army.addSoldier(new Swordsman("Soldier.Swordsman 1", 3));
        army.addSoldier(new Swordsman("Soldier.Swordsman 2", 3));

        army.addSoldier(new Archer("Soldier.Archer 1", 4));
        army.addSoldier(new Archer("Soldier.Archer 2", 4));
        army.addSoldier(new Archer("Soldier.Archer 3", 4));

        army.addSoldier(new Knight("Soldier.Knight 1", 5));
        army.addSoldier(new Knight("Soldier.Knight 2", 5));
        army.addSoldier(new Knight("Soldier.Knight 3", 5));

        army.report();
        army.attack();
        army.defend();
        army.SpecialMove("fury attack");
        army.SpecialMove("fire defend");
        army.SpecialMove("flank");
    }
}
