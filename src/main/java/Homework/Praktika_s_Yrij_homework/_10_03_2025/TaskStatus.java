package Homework.Praktika_s_Yrij_homework._10_03_2025;

public enum TaskStatus {

NEW("new Task"),
IN_PROGRESS("is making"),
COMPLETED("is finished");

private String description;

    public String getDescription() {
        return description;
    }

    TaskStatus(String description) {
        this.description = description;
    }
}
