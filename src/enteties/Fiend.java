package enteties;

public class Fiend {

  private String name;
  private int currentHealth;
  private int fullHealth;
  private int armour;
  private int magicDefence;

  public Fiend() {
  }

  public Fiend(String name, int currentHealth, int fullHealth, int armour, int magicDefence) {
    this.name = name;
    this.currentHealth = currentHealth;
    this.fullHealth = fullHealth;
    this.armour = armour;
    this.magicDefence = magicDefence;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getCurrentHealth() {
    return currentHealth;
  }

  public void setCurrentHealth(int currentHealth) {
    this.currentHealth = currentHealth;
  }

  public int getFullHealth() {
    return fullHealth;
  }

  public void setFullHealth(int fullHealth) {
    this.fullHealth = fullHealth;
  }

  public int getArmour() {
    return armour;
  }

  public void setArmour(int armour) {
    this.armour = armour;
  }

  public int getMagicDefence() {
    return magicDefence;
  }

  public void setMagicDefence(int magicDefence) {
    this.magicDefence = magicDefence;
  }

}
