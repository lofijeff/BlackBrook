package items;

public class Potion {

    String name;
    String description;
    int healthRestored;
    int damage;

    public Potion() {}

    public Potion(String name, String description, int healthRestored, int damage) {
        this.name = name;
        this.description = description;
        this.healthRestored = healthRestored;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHealthRestored() {
        return healthRestored;
    }

    public void setHealthRestored(int healthRestored) {
        this.healthRestored = healthRestored;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
