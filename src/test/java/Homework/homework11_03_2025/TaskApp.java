package Homework.homework11_03_2025;

import java.util.List;
import java.util.*;

public class TaskApp {
    public static void main(String[] args) {
        Worker worker1 = new Worker("john");
        Worker worker2 = new Worker("van");
        Worker worker3 = new Worker("sasha");
        Worker worker4 = new Worker("kostya");

        worker1.addSkill(Skill.CARPENTER, Skill.MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS, Skill.ARCHITECT);
        worker2.addSkill(Skill.SURVEYOR, Skill.PAINTER_PLASTERER, Skill.ARCHITECT);
        worker3.addSkill(Skill.ARCHITECT, Skill.CONCRETE_WORKER, Skill.CARPENTER);
        worker4.addSkill(Skill.ECONOMIST,Skill.CARPENTER);

        Team team1 = new Team();
        team1.setPrice(100);
        team1.addWorkers(worker1, worker2);
        Team team2 = new Team();
        team2.setPrice(150);
        team2.addWorkers(worker3, worker4);

        System.out.println(team1);
        System.out.println(team2);


        // tender
        Map<Skill, Integer> skillSet = new HashMap<>();
        skillSet.put(Skill.CARPENTER, 1);
        skillSet.put(Skill.ARCHITECT, 1);
        Tender tender = new Tender(skillSet, "Bibliothek");


//        // deshevle
        List<Team> teams = Arrays.asList(team1, team2);
        Team cheapestTeam = Result.findCheapestTeam(teams, tender);

        if (cheapestTeam != null) {
            System.out.println("Cheapest team: " + cheapestTeam);
        } else {
            System.out.println("No suitable team found.");
        }
    }
}



//Представьте ситуацию: Тендер на строительство ещё одной национальной
//        библиотеки☺️ На контракт претендуют несколько бригад строителей.
//В каждой бригаде есть некоторое количество работников, обладающих набором
//профессиональных навыков (все навыки ограничены специально созданным вами
//        перечисляемым типом enum;  один работник может обладать несколькими
//навыками), и свое финансовое предложение. Для того чтобы получить контракт,
//надо соответствовать требованиям (иметь все требуемые навыки). Из подходящих
// бригад выбрать самую дешевую. Если подходящих не нашлось – закрыть проект
// строительства☹️ (можно выкинуть исключение)
//
//Использовать коллекции (списки) для представления бригад.
//
//Пример навыков (можете добавлять/изменять/использовать свои): CIVIL_ENGINEER,
// ARCHITECT, SURVEYOR, ECONOMIST, TECHNOLOGIST, CRANE_OPERATOR,
// MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS, CARPENTER, ROOFER, CONCRETE_WORKER, PAINTER_PLASTERER
//
//        Написать тесты, метод мэйн не обязательно.
//**Дополнительное условие: для каждого требуемого навыка нужен отдельный человек.
// Прим: если для тендера нужен каменщик и плотник, то только один человек в бригаде может работать
// каменщиком и другой плотником. Т.е. если в бригаде только 1 человек с навыками каменщик и плотник,
// и других людей с такими навыками нет, то такая бригада не подойдёт.