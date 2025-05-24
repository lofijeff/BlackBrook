package org.lofijeff.enteties;

public class Fiend {

  private String name;
  private int currentHealth;
  private int fullHealth;
  private int armour;
  private int magicDefence;
  private int damage;

  public Fiend() {
  }

  public Fiend(String name, int currentHealth, int fullHealth, int armour, int magicDefence, int damage) {
    this.name = name;
    this.currentHealth = currentHealth;
    this.fullHealth = fullHealth;
    this.armour = armour;
    this.magicDefence = magicDefence;
    this.damage = damage;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
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
