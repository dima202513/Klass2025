package zadachaSredizemie;

public class BattleForMiddleEarth {
    public static void main(String[] args) {
        Human human1 = new Human("Human1", 100, 60, 3, 2, 40);
        Elf elf1 = new Elf("Elf1", 80, 70, 2, 20);
        Dwarf dwarf1 = new Dwarf("Dwarf", 150, 110, 5, 2);
        Orc orc1 = new Orc("Orc1", 110, 100, 2);
        Warg warg1 = new Warg("Warg1", 80, 90, 2, 7);
        Nazgul nazgul1 = new Nazgul("Nasgul1", 150, 120, 6, 10);
        Army army1 = new Army(new Hero[]{human1, elf1, dwarf1});
        Army army2 = new Army(new Hero[]{nazgul1, orc1, warg1});
       fight(army1, army2);
//        int count = 1;

//        while ((human1.getHealth() != 0 || elf1.getHealth() != 0 || dwarf1.getHealth() != 0) && (orc1.getHealth() != 0 || warg1.getHealth() != 0 || nazgul1.getHealth() != 0)) {
//            if (human1.getHealth() != 0 && orc1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                human1.attack(orc1);
//                count++;
//            } else if (human1.getHealth() != 0 && warg1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                human1.attack(warg1);
//                count++;
//            } else if (human1.getHealth() != 0 && nazgul1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                human1.attack(nazgul1);
//                count++;
//            }
//
//            if (elf1.getHealth() != 0 && warg1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                elf1.attack(warg1);
//                count++;
//            } else if (elf1.getHealth() != 0 && orc1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                elf1.attack(orc1);
//                count++;
//            } else if (elf1.getHealth() != 0 && nazgul1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                elf1.attack(nazgul1);
//                count++;
//            }
//
//            if (dwarf1.getHealth() != 0 && nazgul1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                dwarf1.attack(nazgul1);
//                count++;
//            } else if (dwarf1.getHealth() != 0 && orc1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                dwarf1.attack(orc1);
//                count++;
//            } else if (dwarf1.getHealth() != 0 && warg1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                dwarf1.attack(warg1);
//                count++;
//            }
//
//            if (orc1.getHealth() != 0 && human1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                orc1.attack(human1);
//                count++;
//            } else if (orc1.getHealth() != 0 && elf1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                orc1.attack(elf1);
//                count++;
//            } else if (orc1.getHealth() != 0 && dwarf1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                orc1.attack(dwarf1);
//                count++;
//            }
//
//            if (warg1.getHealth() != 0 && elf1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                warg1.attack(elf1);
//                count++;
//            } else if (warg1.getHealth() != 0 && human1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                warg1.attack(human1);
//                count++;
//            } else if (warg1.getHealth() != 0 && dwarf1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                warg1.attack(dwarf1);
//                count++;
//            }
//
//            if (nazgul1.getHealth() != 0 && dwarf1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                nazgul1.attack(dwarf1);
//                count++;
//            } else if (nazgul1.getHealth() != 0 && human1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                nazgul1.attack(human1);
//                count++;
//            } else if (nazgul1.getHealth() != 0 && elf1.getHealth() != 0) {
//                System.out.print(count + ". ");
//                nazgul1.attack(elf1);
//                count++;
//            }
//        }
//
    }

    public static void fight(Army army1, Army army2) {
        System.out.println("Start battle ");
        int index1 = 0;
        int index2 = 0;

        while (army1.isAlive() && army2.isAlive()) {

            System.out.println("Atack army1");
            army1.attack(army2);
            System.out.println("Atack army2");
            army2.attack(army1);


        }
        System.out.println("Битва завершена!");
        if (army1.isAlive()) {
            System.out.println("Победила армия 1!" + army1);
        } else if (army2.isAlive()) {
            System.out.println("Победила армия 2!" + army2);
        } else {
            System.out.println("Ничья!");
        }
    }
}

