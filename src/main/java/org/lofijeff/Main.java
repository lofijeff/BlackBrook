package org.lofijeff;

import org.lofijeff.enteties.Player;
import org.lofijeff.items.Weapon;

public class Main {
  public static void main(String[] args) {
    BattleMethods battleMethods = new BattleMethods();
    Player player = new Player();
    Weapon weapon = new Weapon();
    weapon.setName("knife");
    weapon.setDamage(10);
    weapon.setCriticalDamage(30);
    player.setName("ringadingding");
    player.setType("thief");
    player.setArmour(8);
    player.setWeapon(weapon);
    player.setFullHealth(100);
    player.setCurrentHealth(100);
    System.out.println("TESTING!!!\n" + battleMethods.generateDamage(player));
    Gameplay game = new Gameplay();
    game.start();
  }
}
