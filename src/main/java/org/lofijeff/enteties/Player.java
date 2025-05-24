package org.lofijeff.enteties;

import org.lofijeff.items.Potion;
import org.lofijeff.items.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {

  public String name;
  public String type;
  private int currentHealth;
  private int fullHealth;
  private int armour;

  private int damage;
  public List<Potion> potions;
  Weapon weapon;

  public Player() {
  }

  public Player(String name, String type) {
    this.name = name;
    this.type = type;

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

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage + weapon.getDamage();
  }

  public void defend(int attack) {
    Random random = new Random();
    int damageNegation = random.nextInt(20) + 1;
    int damageTaken;
    if (damageNegation > attack) {
      damageTaken = damageNegation - attack;
      setCurrentHealth(getCurrentHealth() + damageTaken);
    } else if (damageNegation < attack) {
      damageTaken = attack - damageNegation;
      setCurrentHealth(getCurrentHealth() - damageTaken);
    }
  }

  public String getPotions() {
    StringBuilder potionsStringList = new StringBuilder();
    for (Potion p : potions) {
      potionsStringList.append(p.getUseText())
          .append("\n- ").append(p.getDescription());
    }
    return potionsStringList.toString();
  }

  public void drinkPotion(Potion potion) {
    if (this.getCurrentHealth() + potion.getHealthRestored() > 50) {
      this.setFullHealth(50);
      this.setCurrentHealth(this.getFullHealth());
    } else {
      this.setCurrentHealth(this.getCurrentHealth() + potion.getHealthRestored());
    }
    if (potion.getDamage() > 0) {
      this.setCurrentHealth(this.getCurrentHealth() - potion.getDamage());
    }
  }

  public void setPotions(List<Potion> potions) {
    this.potions = potions;
  }

  public Weapon getWeapon() {
    return weapon;
  }

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
