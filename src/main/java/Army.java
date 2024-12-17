import Operation.Attack;
import Operation.Defend;
import Soldier.Soldier;
import Soldier.Knight;
import Soldier.Swordsman;
import Soldier.Archer;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<Soldier> army = new ArrayList<>();


    public void addSoldier(Soldier soldier) {
        army.add(soldier);
    }

    public void report() {
        System.out.println("-------REPORT-------");
        for (Soldier soldier : army) {
            soldier.report(soldier.getType());
        }
        System.out.println();
        System.out.println();
    }

    public void attack() {
        System.out.println("-------ATTACK-------");
        for (Soldier soldier : army) {
            if (soldier instanceof Attack) {
                ((Attack) soldier).attack();
            }
        }
        System.out.println();
        System.out.println();
    }

    public void defend() {
        System.out.println("-------DEFEND-------");
        for (Soldier soldier : army) {
            if (soldier instanceof Defend) {
                ((Defend) soldier).defend();
            }
        }
        System.out.println();
        System.out.println();
    }

    public void SpecialMove(String command) {
        System.out.println("-------" + command + "-------");
        for (Soldier soldier : army) {
            if (soldier instanceof Knight && command.equalsIgnoreCase("flank")) {
                System.out.println(soldier.getName() + " is flanking");
            } else if (soldier instanceof Archer && command.equalsIgnoreCase("fire defend")) {
                System.out.println(soldier.getName() + " is firing fire arrows.");
            } else if (soldier instanceof Swordsman && command.equalsIgnoreCase("fury attack")) {
                System.out.println(soldier.getName() + " is fury attacking.");
            }
        }
        System.out.println();
        System.out.println();
    }


}
