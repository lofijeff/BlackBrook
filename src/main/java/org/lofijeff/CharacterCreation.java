package org.lofijeff;

import org.lofijeff.enteties.*;
import org.lofijeff.items.Weapon;
import org.lofijeff.items.Potion;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CharacterCreation {
  List<Potion> potions;

  public Player createSoldier(String name) {
    Weapon weapon = new Weapon("Sword", 20, 30);
    Weapon critWeapon = new Weapon("Black Sword", 27, 40);
    Random random = new Random();
    Player player = new Player();
    player.setType("soldier");
    player.setName(name);
    int weaponRandomizer = random.nextInt(100) + 1;
    if (weaponRandomizer < 93) {
      player.setWeapon(weapon);
      System.out.println("So... You're a righteous " +
          player.getType() +
          " named " +
          name + "... And you think you're special? Fuck off.");
    } else {
      player.setWeapon(critWeapon);
      System.out.println("So... You're a righteous " +
          player.getType() +
          " named " +
          name + "... Normally I wouldn't be impressed, but that sword" +
          "you carry... It demands respect.");
    }
    player.setFullHealth(50);
    player.setCurrentHealth(50);
    player.setArmour(8);
    player.setDamage(player.getWeapon().getDamage());
    potions = new ArrayList<>();
    return player;
  }

  public Player createThief(String name) {
    Weapon weapon = new Weapon("Dagger", 10, 40);
    Weapon critWeapon = new Weapon("Black Dagger", 15, 50);
    Random random = new Random();
    Player player = new Player();
    player.setType("thief");
    player.setName(name);
    int weaponRandomizer = random.nextInt(100) + 1;
    if (weaponRandomizer < 85) {
      player.setWeapon(weapon);
      System.out.println("Dirty fuckin thief, are ye? Well go on, git!");
    } else {
      player.setWeapon(critWeapon);
      System.out.println("You dirty dirty thief... Thats a fucked up cool dagger you've got there.");
    }
    player.setFullHealth(45);
    player.setCurrentHealth(45);
    player.setArmour(3);
    player.setDamage(player.getWeapon().getDamage());
    potions = new ArrayList<>();
    return player;
  }

  public Player createWitch(String name) {
    Weapon weapon = new Weapon("Staff", 6, 15, 8);
    Weapon critWeapon = new Weapon("Black Staff", 6, 23, 10);
    Random random = new Random();
    Player player = new Player();
    player.setType("witch");
    player.setName(name);
    int weaponRandomizer = random.nextInt(100) + 1;
    if (weaponRandomizer < 90) {
      player.setWeapon(weapon);
      System.out.println("Alright. A master of the dark arts. I can respect that. Best of luck to you.");
    } else {
      player.setWeapon(critWeapon);
      System.out.println("That... That staff. It it something else. I love you.");
    }
    player.setFullHealth(40);
    player.setCurrentHealth(40);
    player.setArmour(5);
    player.setDamage(player.getWeapon().getDamage());
    return player;
  }
}
