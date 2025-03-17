package Homework.homework11_03_2025;

import java.util.List;
import java.util.Set;

public class Result {
    public static boolean getMatch(Tender tender, Team team) {
        Set<Skill> requiredSkills = tender.getSkills();
        List<Worker> workers = team.getWorkersList();
        for (Skill skill : requiredSkills) {
            skill.reset();
        }
        //proverka
        for (Skill skill : requiredSkills) {
            boolean skillFound = false;
            for (Worker worker : workers) {
                if (worker.hasSkill(skill) && !skill.hasBeenChecked()) {
                    skill.check();
                    skillFound = true;
                    break;
                }
            }
            if (!skillFound) {
                return false;
            }
        }

        return true;
    }

    public static Team findCheapestTeam(List<Team> teams, Tender tender) {
        Team cheapestTeam = null;
        for (Team team : teams) {
            System.out.println("Checking team: " + team);
            if (getMatch(tender, team)) {
                System.out.println("Team matched: " + team);
                if (cheapestTeam == null || team.getPrice() < cheapestTeam.getPrice()) {
                    cheapestTeam = team;
                }
            }
        }
        if (cheapestTeam == null) {
            System.out.println("No team matched the tender requirements");
        } else {
            System.out.println("Cheapest team: " + cheapestTeam);
        }
        return cheapestTeam;
    }}

//test napisat na result