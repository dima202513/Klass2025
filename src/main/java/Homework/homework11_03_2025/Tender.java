package Homework.homework11_03_2025;

import java.util.Set;

public class Tender {

    private Set<Skill> skills;

    private String tenderName;

    private double tenderPrice;


    public Tender(Set<Skill> skills, String tenderName, double tenderPrice) {
        this.skills = skills;
        this.tenderName = tenderName;
        this.tenderPrice = tenderPrice;
    }

    public Set<Skill> getSkills() {
        return skills;
    }

    public String getTenderName() {
        return tenderName;
    }

    public double getTenderPrice() {
        return tenderPrice;
    }

    @Override
    public String toString() {
        return "Tender{" +
                "skills=" + skills +
                ", tenderName='" + tenderName + '\'' +
                ", tenderPrice=" + tenderPrice +
                '}';
    }
}





