package Homework.Tender;

import Homework.homework11_03_2025.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class testResultTest {
//    @Test
//    public void testFindCheapestTeam_SuccessfulCase() {
//        Worker worker1 = new Worker("john");
//        Worker worker2 = new Worker("van");
//        Worker worker3 = new Worker("sasha");
//        Worker worker4 = new Worker("kostya");
//
//        worker1.addSkill(Skill.CARPENTER, Skill.MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS);
//        worker2.addSkill(Skill.SURVEYOR, Skill.PAINTER_PLASTERER);
//        worker3.addSkill(Skill.ARCHITECT, Skill.CONCRETE_WORKER);
//        worker4.addSkill(Skill.ECONOMIST);

//        Team team1 = new Team();
//        team1.setPrice(100);
//        team1.addWorkers(worker1, worker2);
//
//        Team team2 = new Team();
//        team2.setPrice(150);
//        team2.addWorkers(worker3, worker4);
//
//        Set<Skill> skillSet = Set.of(Skill.ARCHITECT, Skill.CARPENTER); // Требования для тендера
//        Tender tender = new Tender(skillSet, "Bibliothek", 120);
//
//
//        List<Team> teams = Arrays.asList(team1, team2);
//        Team cheapestTeam = Result.findCheapestTeam(teams, tender);
//
//        assertNotNull(cheapestTeam, "The cheapest team should not be null.");
//        assertEquals(100, cheapestTeam.getPrice(), "The price of the cheapest team should be 100.");
//    }
    @Test
        public void testFindCheapestTeam_NoMatchingSkills() {
            Worker worker1 = new Worker("john");
            Worker worker2 = new Worker("van");
            Worker worker3 = new Worker("sasha");
            Worker worker4 = new Worker("kostya");

            worker1.addSkill(Skill.CARPENTER, Skill.MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS);
            worker2.addSkill(Skill.SURVEYOR, Skill.PAINTER_PLASTERER);
            worker3.addSkill(Skill.ARCHITECT, Skill.CONCRETE_WORKER);
            worker4.addSkill(Skill.ECONOMIST);

            Team team1 = new Team();
            team1.setPrice(100);
            team1.addWorkers(worker1, worker2);

            Team team2 = new Team();
            team2.setPrice(150);
            team2.addWorkers(worker3, worker4);

            Set<Skill> skillSet = Set.of(Skill.TECHNOLOGIST, Skill.ROOFER);
            Tender tender = new Tender(skillSet, "Bibliothek", 120);

            List<Team> teams = Arrays.asList(team1, team2);
            Team cheapestTeam = Result.findCheapestTeam(teams, tender);

            assertNull(cheapestTeam, "There should be no matching team.");
        }

}