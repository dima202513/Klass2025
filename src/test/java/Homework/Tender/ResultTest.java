package Homework.Tender;

import Homework.homework11_03_2025.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {
    private Worker worker1;
    private Worker worker2;
    private Worker worker3;
    private Worker worker4;
    private Team team1;
    private Team team2;
    private List<Team> teams;

    @BeforeEach
    public void setUp() {
        worker1 = new Worker("john");
        worker2 = new Worker("van");
        worker3 = new Worker("sasha");
        worker4 = new Worker("kostya");

        worker1.addSkill(Skill.CARPENTER, Skill.MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS, Skill.ARCHITECT);
        worker2.addSkill(Skill.SURVEYOR, Skill.PAINTER_PLASTERER, Skill.ARCHITECT);
        worker3.addSkill(Skill.ARCHITECT, Skill.CONCRETE_WORKER, Skill.CARPENTER);
        worker4.addSkill(Skill.ECONOMIST,Skill.CARPENTER);

        team1 = new Team();
        team1.setPrice(100);
        team1.addWorkers(worker1, worker2);

        team2 = new Team();
        team2.setPrice(150);
        team2.addWorkers(worker3, worker4);

        teams = Arrays.asList(team1, team2);
    }

    @Test
    public void testFindCheapestTeam_SuccessfulCase() {
        Map<Skill, Integer> skillSet = new HashMap<>();
        skillSet.put(Skill.CARPENTER, 1);
        skillSet.put(Skill.ARCHITECT, 1);
        Tender tender = new Tender(skillSet, "Bibliothek");

        Team cheapestTeam = Result.findCheapestTeam(teams, tender);

        assertNotNull(cheapestTeam, "The cheapest team should not be null.");
        assertEquals(100, cheapestTeam.getPrice(), "The price of the cheapest team should be 100.");
    }

    @Test
    public void testFindCheapestTeam_NoMatchingSkills() {
        Map<Skill, Integer> skillSet = new HashMap<>();
        skillSet.put(Skill.TECHNOLOGIST, 1);
        skillSet.put(Skill.ROOFER, 1);
        Tender tender = new Tender(skillSet, "Bibliothek");

        Team cheapestTeam = Result.findCheapestTeam(teams, tender);

        assertNull(cheapestTeam, "There should be no matching team.");
    }
}
