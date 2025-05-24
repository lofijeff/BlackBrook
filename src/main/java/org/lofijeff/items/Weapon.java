package org.lofijeff.items;

public class Weapon {

  String name;
  int damage;
  int spellDamage;
  int criticalDamage;

  public Weapon() {
  }

  public Weapon(String name, int damage, int criticalDamage) {
    this.name = name;
    this.damage = damage;
    this.criticalDamage = criticalDamage;
  }

  public Weapon(String name, int damage, int spellDamage, int criticalDamage) {
    this.name = name;
    this.damage = damage;
    this.spellDamage = spellDamage;
    this.criticalDamage = criticalDamage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public int getSpellDamage() {
    return spellDamage;
  }

  public void setSpellDamage(int spellDamage) {
    this.spellDamage = spellDamage;
  }

  public int getCriticalDamage() {
    return criticalDamage;
  }

  public void setCriticalDamage(int criticalDamage) {
    this.criticalDamage = criticalDamage;
  }
}
