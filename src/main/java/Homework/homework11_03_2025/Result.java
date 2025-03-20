package Homework.homework11_03_2025;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Result {
    public static boolean getMatch(Tender tender, Team team) {
        Map<Skill, Integer> skills = tender.getSkills();
        List<Worker> workers = team.getWorkersList();

        Map<Skill, Integer> skillCounts = new HashMap<>();
        for (Skill skill : skills.keySet()) {
            skillCounts.put(skill, 0);
        }

        // podschet rabochich s navikamy
        for (Worker worker : workers) {
            for (Skill skill : worker.getSkills()) {
                if (skills.containsKey(skill)) {
                    skillCounts.put(skill, skillCounts.get(skill) + 1);
                }
            }
        }

        // proverka trebovanij
        for (Map.Entry<Skill, Integer> entry : skills.entrySet()) {
            if (skillCounts.get(entry.getKey()) < entry.getValue()) {
                return false;
            }
        }

        return true;
    }

    public static Team findCheapestTeam(List<Team> teams, Tender tender) {
        Team cheapestTeam = null;

        // komanda == trebovanie
        for (Team team : teams) {
            System.out.println("Checking team: " + team);
            if (getMatch(tender, team)) {
                System.out.println("Team matched: " + team);
                // deshevle
                if (cheapestTeam == null || team.getPrice() < cheapestTeam.getPrice()) {
                    cheapestTeam = team;
                }
            } else {
                System.out.println("Team does not match: " + team);
            }
        }

        if (cheapestTeam != null) {
            System.out.println("Cheapest team: " + cheapestTeam);
        } else {
            System.out.println("No team matched the tender requirements");
        }

        return cheapestTeam;
    }}



//test napisat na result