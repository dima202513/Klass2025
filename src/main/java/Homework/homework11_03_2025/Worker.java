package Homework.homework11_03_2025;

import java.util.HashSet;
import java.util.Set;
public class Worker {
    private String name;
    private Set<Skill> skills = new HashSet<>();

    public Worker(String name) {
        this.name = name;
    }

    public void addSkill(Skill... skillList) {
        for (Skill skill : skillList) {
            skills.add(skill);
        }
    }

//    public boolean hasSkill(Skill skill) {
//        return skills.contains(skill);
//    }

    public Set<Skill> getSkills() {
        return skills;  // + metod dlya vozvrata navikov
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }
}
