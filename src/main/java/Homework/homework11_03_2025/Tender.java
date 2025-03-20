package Homework.homework11_03_2025;

import java.util.Map;

public class Tender {
    private Map<Skill, Integer> skills;
    private String tenderName;

    public Tender(Map<Skill, Integer> skills, String tenderName) {
        this.skills = skills;
        this.tenderName = tenderName;
    }


    public Map<Skill, Integer> getSkills() {
        return skills;
    }

    public String getTenderName() {
        return tenderName;
    }

    @Override
    public String toString() {
        return "Tender{" +
                "skills=" + skills +
                ", tenderName='" + tenderName + '\'' +
                '}';
    }
}




