package Homework.zadachaSredizemie;

public class Dwarf extends Hero{

    private double armorMultiplier;

    public Dwarf(String name, int health, int power, int defence, double armorMultiplier) {
        super(name, health, power, defence);
        setArmorMultiplier(armorMultiplier);
    }

    @Override
    public String toString() {
        return String.format("Dwarf %s has %d health.", getName(), getHealth());
    }

    @Override
    public int getDefence() {
        return (int)(super.getDefence() * armorMultiplier);
    }

    @Override
    protected void setHealth(int health) {
        if (health >= 120 && health <= 150){
            super.setHealth(health);
        } else {
            throw new IllegalArgumentException("The health is invalid.");
        }
    }

    private void setArmorMultiplier(double armorMultiplier) {
        if (armorMultiplier > 1.0 && armorMultiplier <= 5) {
            this.armorMultiplier = armorMultiplier;
        } else {
            throw new IllegalArgumentException("Armor multiplier is invalid.");
        }
    }
}