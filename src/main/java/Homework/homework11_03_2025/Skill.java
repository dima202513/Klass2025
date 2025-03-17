package Homework.homework11_03_2025;

public enum Skill {
    CIVIL_ENGINEER,
    ARCHITECT,
    SURVEYOR,
    ECONOMIST,
    TECHNOLOGIST,
    CRANE_OPERATOR,
    MASTER_OF_CONSTRUCTION_AND_INSTALLATION_WORKS,
    CARPENTER,
    ROOFER,
    CONCRETE_WORKER,
    PAINTER_PLASTERER;

    private boolean isChecked = false;

    public void check() {
        isChecked = true;
    }

    public boolean hasBeenChecked() {
        return isChecked;
    }

    public void reset() {
        isChecked = false;
    }
}

